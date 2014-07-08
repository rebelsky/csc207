Fibonacci
---------

* Recursive formulation
* Improving the solution
    * Cache the results in a table!
* Making it iterative
    * Fill in the table from left to right
* Making it even better
    * Only need two variables

Generalizing the Idea
---------------------

* Tables!

The Stamps Problem
------------------

* Given some set of stamp values and a desired value, find the
  fewest stamps to make that value.
    * E.g., 1, 2, 7, 12, 25
* Recursive formulation
* Making it iterative
    * Use a table and fill it in left-to-right

The Edit Distance Problem
-------------------------

* What's the fewest number of edits (insertions, deletions) necessary
  to transform one string to another?
* Once again, there's a nice recursive formulation.
* Can we use similar techniques to make it iterative?
* This time, we need a two-dimensional table.
    * Columns: Letters of source string
    * Rows: Letters of target string
    * Moving left represents deletion
    * Moving up represents insertion
* And yes, we should fill it in iteratively
