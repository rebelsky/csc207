Analyzing mergesort, revisited
------------------------------

* We analyzed merge sort using recurrence relations.  I thought that was 
  useful.
* I know some of my colleagues do a more pictorial version of the analysis,
  which we'll also do.

Iterative mergesort
-------------------

* Merge sort, as phrased, is a recursive algorithm
* Some folks really don't like recursion.  (Our visitor from Microsoft
  says that it's too complicated for some programmers to read.)
* Can we write mergesort without recursion?
* Certainly.  The tree even helps.  
   * We order pairs of elements
   * We merge ordered pairs into ordered 4-tuples
   * We merge ordered 4-tupels into ordered 8-tuples
   * And so on and so forth.
* You'll implement this on [the homework](../assignments/assignment.08.html).

Quicksort
---------

* Divide and conquer
* Using smaller/larger as the division strategy
* Randomness helps us select an approximation of the median
    * I'm bad at probabilistic analysis, so we won't do it

Lab
---

* In the lab, you'll implement the partition portion of Quicksort over
  arrays.
