ADT, Continued
--------------

* We'll continue exploring the ADT we started to design last class.
* A common Java design question: Does the remove method belong in the
  iterator or in the class itself?
    * What are the arguments for each in general or in this case?

Review: Designing Data Structures 
----------------------------------

What are the basic questions you should ask when you're implementing an
ADT with a data structure?

Implementing Dictionaries: A Simple Approach
--------------------------------------------

* Probably easiest to start with an unordered array or linked list.
* We'll store key/value pairs in the array or list.
* We can implement `put` by adding to the front of the
  linked list (or the back of the array).
* We can implement `get` by searching the linked list or array.
* How should we deal with a `set` for an element already in the
  array?
    * Technique 1: Find the key/value pair, replace.
    * Technique 2: Just shove new things at the front of the list; we'll
      see them first anyway.
* What are the running times in each case?
* This approach is typically called an *association list*.

How can we do better?
---------------------

* After you design and analyze a data structure (or algorithm), your
  first question (after assuring correctness) should be
  *Can I do better?*
* So, how might we improve this implementation?
* One common strategy: Store in a sorted array.
* One strategy you should know: Use a skip list.
* Are there others?

About binary search trees
-------------------------

* Idea: Apply "divide and conquer" to data structure design.
* Linked structures.
* Two links from every node.  One to the "smaller" values, one to the
  "larger" values.
* When used to implement dictionaries, store a key/value pair in each
  node.
* Note: While association lists only require that we be able to compare
  value for equality, binary search trees require that we have a way
  to order values.
