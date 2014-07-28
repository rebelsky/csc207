Notes on Exam 2
===============

These are my quick notes on exam 2.  They are not intended to be 
comprehensive; it's mostly a collection of things I noted that you
might also want to note.  I may be making my solutions available
in the near future.

Distribution of unit test results
----------------------------------

* Problem 1: 18 passed, 4 failed
* Problem 2: 14 passed, 5 failed both test suites, 3 failed only remove
* Problem 3: 11 passed, 11 failed
* Problem 4: 6 passed, 13 failed, 3 did not terminate

Some general notes
------------------

*Please be more careful about citations!  It's not a minor issue.  For
your sanity, incorrect with citations is better than correct with no
citations.*

Once again, I was a bit more generous on bad formatting than I should
have been.  People who regularly violated formatting standards lost a
point (rather than having their exams rejected).  People who only violated
formatting standards on one problem (a bid odd, in my pespective) usually
lost 1/2 point.  People who ocasionally violated formatting standards
may have lost partial credit.

There were also a number of other programming problems: Uncommented fields
and methods, fields in the wrong place (e.g., in the methods section),
incorrect capitalization, etc.  Again, I may not be so sympathetic in
the future.

A surprising number of you used `private` as a modifier for fields and
methods.  Since I almost never use `private`, I'm wondering where you
developed the habit.  (I generally recommend against `private`; it's
often useful for subclasses or friendly classes to be able to access
your fields and methods.)

I hope to never again see anything like the following code

    if (pred.test(param))
      return true;
    else
      return false;

I also hope to never see anyting like the following code

    if (pred.test(param) == true)
      ...;

There were fewer explicit loop invariants than I would have liked, and
some of the ones that were there were careless enough that they were
unlikely to be helpful.

Many of you need to start the next examination sooner.

Notes on Individual Problems
----------------------------

### Problem 1

If your code passed the tests, but wasn't expected O(nlogn), you were
unlikely to receive credit.  (See last Friday's CS table.)

People who changed the meaning of the parameters in the helper but did
not change the documentation also likely lost credit.

### Problem 2

This problem had more `private` fields (which were often uncommented,
badly placed, and inconsistently initialized) than any other.

### Problem 3

A few of you chose to implement methods that were already implemented
(e.g., `add` and `remove`).  The goal was really to find a way to wrap
those methods appropriately.  (In this case, you did need to access the
underlying data structure for the `next` and `hasNext` methods.)

### Problem 4

A few of you implemented this by passing integer indices to the 
`partition` method and then advancing the iterator to those
indices.  But if you do that for each recursive call, your procedure
is no longer O(n).  The `partition` method needs to take the iterators
as parameters.
