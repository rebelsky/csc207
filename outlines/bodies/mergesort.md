An introduction to merge sort
-----------------------------

* There's a theoretical analysis that shows that O(nlogn) comparisons
  are necessary for a comparison-based sort.
* All of the sorting algorithms we've seen so far are O(n^2).
* Can we do better?  (Can we achieve the known lower bound?)
* One strategy for writing faster algorithms is "divide and conquer".
  When presented with a large problem, 
    * split it into two parts
    * solve each part
    * combine the solutions
* The easiest way to split an array: first half and second half.
* We sort the two halves.
* What can we do after sorting the two halves?

Analysis
--------

* Let's let t(n) represent the time mergesort takes on input of size n.
* To sort an array of size n, we must sort two arrays of size n/2, and
  then merge the two.  Merging takes n steps.
* We have a simple recurrence relation: t(n) = 2*t(n/2) + n
* We can explore recurrence relations top-down or bottom up.
* Bottom up
    * t(1) = 1
    * t(2) = 2*1 + 2 = 4
    * t(4) = 2*4 + 4 = 12
    * t(8) = 2*12 + 8 = 32
    * t(16) = 2*32 + 16 = 80
    * Hmmm ...
* Top down
    * t(n) = 2*t(n/2) + n
    * t(n) = 2*(2*t(n/4) + n/2) + n     // Expand t(n/2)
    * t(n) = 2*2*t(n/4) + 2*n/2 + n     // Distribute
    * t(n) = 4*t(n/4) + 2n              // Simplify
    * t(n) = 4*(2*t(n/8) + n/4) + 2n    // Expand t(n/4)
    * t(n) = 4*2*t(n/8) + 4*n/4 + 2n    // Distribute
    * t(n) = 8*t(n/8) + 3n              // Simplify
    * t(n) = 8*(2*t(n/16) + n/8) + 3n   // Expand t(n/8)
    * t(n) = 8*2*t(n/16) + 8*n/8 + 3n   // Distribute
    * t(n) = 16*t(n/16) + 4n            // Distribute
* I see a pattern:
    * t(n) = 2^k*t(n/(2^k)) + kn
* If we let 2^x = n, we get
    * t(n) = n*t(1) + xn
    * If 2^x = n, then x = log_2(n)
    * So t(n) = n + log_2(n) * n
* The second term dominates.  t(n) is in O(nlogn)

Lab
---

* Fork and clone the code from <https://github.com/Grinnell-CSC207/sorting>
* Implement Utils.merge.
