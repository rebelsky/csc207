Hash Tables
-----------

* As you may have noticed, dictionaries are "a lot like arrays"
  (except that you index dictionaries by object and arrays by number).
* However, in terms of implementation, that claim hasn't held.
    * The unordered list implementation has O(*n*) set and
      O(*n*) get.
    * An ordered array implementation has O(*n*) set and
      O(log<sub>2</sub>*n*) get.
    * The binary search tree implementation has O(log*n*) set and
      O(log*n*) get, if we're lucky (or if we learn how to keep the
      tree balanced).
* The corresponding array operations are O(1).
* *Is there a dictionary implementation with O(1) 
  `get` and `set`?*
* Surprisingly, if you're willing to sacrifice some space and increase
  your constant, it is possible to build a dictionary that is *likely*
  to have O(1) `get` and `set`.
* How?  Well, we know that arrays provide O(1) get and set, so use arrays 
  (or vectors).
* How do we use an array?  We "number" the keys in such a way that
    * all numbers are between 0 and array.length-1
    * no two keys have the same number (or at least few have the same
      number).
* If there are no collisions (keys with the same number), the system is simple
    * To set a value, determine the number corresponding to the key
      and add it in that place of the array.  This is O(1+cost of 
      computing that number).
    * To get a value, determine the number corresponding to the key
      and look in the appropriate cell.  This is O(1+cost of computing that
      number).
* Implementations of dictionaries using this strategy are called
  *hash tables*.
* The function used to convert an object to a number is the
  *hash function*.  
* To better understand hash tables, we need to consider
    * The hash functions we might develop.
    * What to do about collisions (when two keys map to the same index).

Hash Functions
--------------

* The goal in developing a hash function is to come up with a function
  that is unlikely to map two objects to the same position.  
    * Now, it isn't possible to guarantee that no two objects have the
      same position (particularly if we have more objects than
      positions).  
    * We'll discuss what to do about two objects mapping to
      the same position later.
* Hence, we sometimes accept a situation in which the hash function
  distributes the objects more or less uniformly.
* It is worth some experimentation to come up with such a function.
* In addition, we should consider the cost of computing the hash function.
  We'd like something that is relatively low cost (not just constant time,
  but not too many steps within that constant).
* We'd also like a function that does (or can) give us a relatively
  large range of numbers, so that we can get fewer collisions by increasing
  the size of the hash table.
    * We might want to make the size of the table a parameter to the
      hash function.
    * We might strive for a hash function that uses the range of positive
      integers, and mod it by the size of the table.
* What are some hash functions you might use for strings?
    * Sum the ASCII values in the string 
    * constant1*firstLetter + constant2*secondLetter
    * ...

An Exercise in Hashing
----------------------

* Let's try an exercise.  We'll come up with a hash value for
  everybody's first name.  We'll then put things in the hash table.
* We'll use "sum the values of the first three letters in the name". 
* We'll use the following table:
<pre>
A: 1   F: 6   K: 11  P: 16  U: 21  Z: 26
B: 2   G: 7   L: 12  Q: 17  V: 22
C: 3   H: 8   M: 13  R: 18  W: 23
D: 4   I: 9   N: 14  S: 19  X: 24
E: 5   J: 10  O: 15  T: 20  Y: 25
</pre>
* There are about 22 of you in the class.  Typically, our hash tables are somewhat
  bigger than the size of the collection we're working with, so we'll use a 
  hash table of size 40.  
    * Once you've computed your result, mod it by 40 (compute the remainder 
      after dividing by 40)
* For my first name (Samuel), 
* The sum is 19 (S) + 1 (A) + 13 (M) = **33**
* The index is therefore **33**.
* Is this a good hash function?  
    * Why?
    * Why not?

Hashing in Java
---------------

* Hash tables are so useful that Java includes them as a standard
  library class, `java.util.Hashtable`.
* Let's look over the [documentation for `java.util.Hashtable`](http://docs.oracle.com/javase/7/docs/api/java/util/Hashtable.html)
* Why are there three constructors?
* What methods are there other than `get` and `set`?
* Where's the hash function?
    * Answer: Every class is expected to provide its own.
* Why is there also a `java.util.HashMap`](http://docs.oracle.com/javase/7/docs/api/java/util/HashMap.html)

Handling Conflicting Keys
-------------------------

* Since we typically have many more possible keys than places in the
  array, we will eventually hit a point in which two keys hash to the
  same value.
* *What should we do when this conflict happens?*
* It is not reasonable to disallow the second key, since it's a
  different key.
* We could put a list of key/value pairs, rather than a singleton, at
  every position.  This technique is sometimes called *chaining*.
* We could step through the array until we find an empty space.  This
  technique is sometimes called *linear probing*.  (You don't need to
  offset by 1; you can offset by a constant amount.)
* I thought people tended to use linear probing, but I see that Java uses
  chaining.

Removing Elements from Hash Tables
----------------------------------

* Our analysis of Hash Tables to date has been based on two simple
  operations: `get` and `set`.
* What happens if we want to remove elements?  This operation
  can significantly complicate matters.
* If we've chosen linear probing to resolve collisions, what do we do when 
  it comes time to remove elements?
    * Do we shift everything back?  If so, think about how far we may
      have to look.  
    * Do we leave the thing there as a blank?  We might then remove it 
      later when it's convenient to do so (e.g., when we grow the table).  
    * Do we do something totally different?
* Note also that there are different ways of specifying "remove".  We
  might remove the element with a particular key.  We might instead
  remove elements based on their value.  The second is obviously a much
  slower operation than the first (unless we've developed a special way
  to handle that problem - see if you can think of one).

