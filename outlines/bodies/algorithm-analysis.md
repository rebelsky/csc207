A Motivating Problem: Exponentiation
------------------------------------

* Consider the problem of computing x^y for double x and postitive
  inteter y.
* How do we do it?  You may have seen at least two strategies, one using a
  for loop, one using a clever recursive solution.

Here's a simple iterative solution using a for loop

    double result = 1.0;
    for (int i = 0; i < y; i++)
        result *= x;

Here's a *divide and conquer* solution.

     To compute x^y
     If y is 0
       return 1
     Else if y is odd
       return x*x^(y-1)
     Else if y is even
       return square(x^(y/2))

* Is the second algorithm better?  If so, how much better? 
* Are there other, perhaps more efficient, algorithms we can use?

Comparing Algorithms
--------------------

* As you may have noted, there are often multiple algorithms one can
  use to solve the same problem.
    * In finding the minimum element of a list, you can step through
      the list, keeping track of the current minimum.  You could also
      sort the list and grab the first element.
    * In finding x^y, one might use repeated multiplication,
      divide and conquer, or even built-in e^n and natural log procedures.
    * You can come up with your own variants.
* _How do we choose which algorithm is the best?_
    * The fastest/most efficient algorithm.  
    * The one that uses the fewest resources.  
    * The clearest.  
    * The shortest.  
    * The easiest to write.
    * The most general. 
    * ... 
* Frequently, we look at the *speed*.  That is, we consider how
  long the algorithm takes to run.  
    * It is therefore important for us to be able to carefully
      analyze the running time of our algorithms.

Potential Problems
------------------

*Is there an exact number we can provide for the running
time of an algorithm?*  Surprisingly, no.

* Different inputs lead to different running times.  For example,
  if there are conditionals in the algorithm (as there are in many
  algorithms), different instructions will be executed depending
  on the input.
* Not all operations take the same time.  For example, addition is
  typically quicker than multiplication, and integer addition is
  typically quicker than floating point addition.
* The same operation make take different times on different machines.
* The same operation may appear to take different times on the same machine,
  particularly if other things are happening on the same machine.
* Many things that affect running time happen behind the scenes and
  cannot be easily predicted.  For example, the computer might move
  some frequently-used data to cache memory.

Asymptotic Analysis
-------------------

* Noting problems in providing a precise analysis of the running time
  of programs, computer scientists developed a technique which is often
  called "*asymptotic analysis*".  In asymptotic analysis of algorithms,
  one describes the general behavior of algorithms in terms of the size
  of input, but without delving into precise details.
    * The analysis is "asymptotic" in that we look at the behavior
      as the input gets larger.
* There are many issues to consider in analyzing the asymptotic behavior
  of a program.  One particularly useful metric is an *upper bound*
  on the running time of an algorithm.  We call this the "Big-O" of
  an algorithm.
* Informally, Big-O gives the general shape of the curve of the graph 
  of the upper bound of the worst case running time vs. input size.
    * That is, is it linear, quadratic, logarithmic, ...
* I like to think about bounds in terms of what happens when you double
  the size of the input.
    * Does the running time usually double?
    * Does the running time usually go up by a constant?
    * Does the running time usually quadruple?
    * Does the running go up as a square?

Big-O Formalized
----------------

* Big-O is defined somewhat mathematically, as a relationship between
  functions.
* f(n) is in O(g(n)) iff 
    * there exists a number n_0
    * here exists a number d
    *  for all but finitely many n > n_0, |f(n)| < |d * g(n)|
* What does this say?  It says that after a certain value, n_0,
  f(n) is bounded above by a constant times g(n).
    * The constant, d, helps accommodate the variation in the algorithm.
    * We don't usually identify the d precisely (although we do use it
      in formal proofs).
    * The n_0 represents "for big enough n".
* We can apply big-O to algorithms.
    * n is the "size" of the input (e.g., the number of items in 
      a list or vector to be manipulated).
    * f(n) is the running time of the algorithm
* Some common Big-O bounds
    * An algorithm that is in O(1) takes <em>constant time</em>.  That is, the
      running time is independent of the input.  Getting the size of a
      vector should be an O(1) algorithm.
    * An algorithm that is in O(n) takes time *linear* in the
      size of the input.  That is, we basically do constant work for each
      "element" of the input.  Finding the smallest element in a list is
      often an O(n) algorithm.
    * An algorithm that is in O(log_2(n)) takes *logarithmic*
      While the running time is dependent on the size of the input,
      it is clear that not every element of the input is processed.
      Many such algorithms involve the strategy of "divide and conquer".

Implications of Big-O
---------------------

_You can formally prove all of the following (and probably will, in 
some course)_

* Big-O is transitive.  If f(n) is in O(g(n)) and g(n) is in O(h(n)),
  then f(n) is also in O(h(n))
* We don't need to worry about constant multipliers; they get handled
  by the d.
* We don't need to worry about lower-order terms.  That is, if
  f(n) is in O(g(n) + h(n)) and g(n) is in O(h(n)), then f(n) is in
  O(h(n))

Doing Informal Asymptotic Analysis
----------------------------------

* We now have a theoretical grounding for asymptotic analysis.  How
  do we do it in practice?
* For iterative algorithms, it's often best to "count" the steps
  in an algorithm and then add them up.  
    * Assume most things take one step.
    * If you call a function, you'll need to analyze the running time 
      of that function
    * For loops, analyze the body of the loop and then multiply by the 
      number of times the loop repeats.
    * For conditionals, analyze the two halves of the conditional and 
      take the largest.
    * For procedure calls, use the number of steps your analysis of the
      procedure call says it will take.
    * We may find other ways to count, too.
* Once you've counted, you get to throw away the lower-order terms and
  the constant multipliers.
* After you've taken combinatorics or discrete structures, you can use 
  _recurrence relations) for recursive functions.
     * We may look at some informal recurrence relations.
* Over the semester, we'll look at a number of examples.  Some
  starting ones.
    * Finding the smallest/largest element in a vector of integers.
    * Finding the average of all the elements in a vector of integers.
    * Putting the largest element in an array at the end of the array.
      if we're only allowed to swap subsequent elements.
    * Binary search
    * ...

Recurrence Relations
--------------------

Let's try to figure out the running time of a few recursive algorithms
given descriptions of the relationships of running times.

* f(1) = a; f(n) = b + f(n/2)
* f(1) = a; f(n) = b + f(n-1)
* f(1) = a; f(n) = b + n + f(n-1)
* f(1) = a; f(n) = b + 2*f(n/2)

I find it easiest to "work out" some example inputs and then to look for
patterns.

Experimental Analysis
---------------------

* Note that in addition to this informal analysis of running time, we
  often analyze our algorithms experimentlaly to see if the data we gather 
  match the predicted running times.
* What do I mean when I say "analyze our algorithms experimentally"?  I mean
  that we can time them on a variety of inputs and graph the results.
* If the experimental and the abstract results match, we can be fairly
  confident in the abstract results.
* If they don't, we may need to reflect and try again.
    * Our analysis may be correct and our implementation incorrect.
    * Our analysis may be correct and our data may all be outliers.
    *  Our analysis may be incorrect.
    *  Our analysis is for worst case, and the data are often for average case.
    * ...
* Note also that some analyses can be very difficult.

