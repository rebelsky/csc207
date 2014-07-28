Makeup for Examination 2
========================

*This makeup is still in draft form.*

A few of you had some significant problems on exam 2.  Since there were
unit tests for exam 2, I don't think that a makeup that simply asks you
to correct your already buggy implementations is appropriate.  I've also
had very little luck with such makeup examinations.  Hence, this makeup
primarily asks you to reflect in new ways on a few issues from the
examination.

Policies and other notes
------------------------

* The makeup is due in electronic form at 10:30 p.m. on Thursday, 10 April 
  2014.  The makeup is due in printed form at 10:00 a.m. on Friday, 11
  April 2014.
* Each makeup problem is worth at most 1/2 point on the examination's
  4-point scale.
* You cannot increase your grade on the examination beyond a grade of B+.
* You may do no makeup problems, all of the makeup problems, or some of the 
  makeup problems.
* You need not return your examination to me.
* You may not put your work in a public GitHub repository.
* I would prefer that you email me a tarball of your code that unpacks
  into a directory that corresponds to your user name.  However, I will
  also accept an email that just contains the .java and .md files.
* You must follow the same academic honesty policies.  
* You must submit another academic honesty statement.
* You will not get credit if you format the code incorrectly or fail
  to comment your end braces.

Additional issues

* Grading your makeup examinations will be low priority.  It may not happen
  until after the end of the semester.
* I reserve the right to change any and all policies regarding this makeup.

Preparation
-----------

Clone the repository at <https://github.com/Grinnell-CSC207/makeup2-2014S>.

Makeup Problem 1
----------------

As the examination suggested, I try to use some interesting approaches
in my unit tests.  For this problem, you need to explore and explain a few
of those approaches.  Your goal is to explain the approaches to someone
who hasn't seen my code, but wants guidance in strategies for writing more
sophisticated unit tests.  You can treat them as if they are 'blog posts.

a. Explain how one might use factories in writing unit tests.  You may 
need to teach yourself about factories in order to complete this problem.

b. Explain at least two ways in which one might use permutations in testing.
For example, you might explain about randomized permutations and all
permutations.

Makeup Problem 2
----------------

In the repository, you will find two implementations of filtered iterators,
along with a skeletal set of unit tests.  Both implementations passed my
unit tests, but one has a large number of flaws.  Your goal is to write
a set of tests that will identify some of those flaws.  (I believe that
the good implementation is correct; you will get extra credit if you 
identify flaws in that implementation.)  Your tests must illustrate the
following flaws:

* It is possible to make `next` return `null`, even when `null` is not
  in the underlying collection.  Put a test that reveals this issue
  in `testNext1`.
* There are other situations (sequences of operations) in which `next` 
  correctly returns some values in the underlying iterator and only returns 
  values in the underlying iterator that meet the predicate, but fails to 
  return the correct value for some of the calls to `next`.
    * Some of those situations are primarily caused by a flaw in `next`,
      rather than a flaw in `hasNext` or `remove`.  Put a test that reveals
      this issue in `testNext2`.
    * Some of thosse situations are primarily caused by a flaw in
      `hasNext`.  Put a test that reveals this issue in `testNext3`.
* It is possible to make `remove` remove the wrong element (that is,
  something other than what was most recently returned by `next`).
  Put a test that reveals this issue in `testRemove1`.  Note that
  the problem might be that the code calls `base.remove()` when it
  should be throwing an exception.
* It is possible to make `hasNext` return the wrong value (either
  `true` when there should not be remaining elements, or `false` when 
  there should be remaining elements).  Put a test that reveals this
  issue in `testHasNext1`.

Ideally, you will find that `BadFilteredIterator` fails these five tests
(and passes the two sample tests) and that `GoodFilteredIterator` passes
all the tests.
