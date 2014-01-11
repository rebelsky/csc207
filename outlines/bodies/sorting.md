The problem of sorting
----------------------

* Goal: Given a collection of values, put them in order.
* How do you decide what order?  
    * Sometimes we use the natural ordering.
    * Sometimes we use a comparator.

An object-oriented approach
---------------------------

* We'll build a sorter interface.
    * Will the individual objects ever need more than one copy?
      Probably not.  We'll see how to handle that issue later.
* The basic method: Sort an array of T's using an appropriate comparator.
* I'll ask you to fill in the blanks (preconditions, postconditions,
  etc.)

Testing sorters
---------------

* How do we test a sorter?
* Three basic approaches:
    * Systematically generate a lot of samples and see that it works
      on all of them
    * Randomly generate a lot of samples and see that it works on
      all of them
    * Perhaps do a few special cases
* How do we know that a sort method has succeeded?
    * The result is in order
    * The result is a permutation of the original array
* We can check these by writing `inOrder` and `isPermutation` 
  predicates, but those are a pain.
* A better strategy: 
    * Start with a sorted array.  
    * Make a copy.
    * Permute the copy.
    * Sort the permuted copy.
    * Compare to the original array.
* For the random samples approach, we just need a "randomly permute"
  method.
* For the systematic approach, we might want to make all permutations.
  But how?

Sam's favorite permutation algorithm
------------------------------------


    
