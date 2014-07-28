CSC 207 2014S: Extra Session, Week 2
====================================

Overview

* You ask questions.
* I try to give answers.

Questions
---------

_Can I send in my extra credit summary a week late?_

> Maybe once or twice.  Don't make it a habit.

_Can my peers have extra credit for Chinese New Year celebration 6-8 p.m.
on Friday in Harris Center?_

> Yes.

_What will we be doing with `ArrayList`s?_

> Nothing explicit.  At times, you will want expandable arrays, and you have
three choices: Implement the expandable arrays yourself (this maybe an assignment),
use `ArrayList`, use `Vector`.

> ArrayLists and Vectors are both expandable arrays.  ArrayLists only seem to expand
one element at a time.  Vectors expand more easily.  ArrayLists allow internal
deletion.

> See [examples/arrays/VectorsVsArrayLists.java](../examples/arrays/VectorsVsArrayLists.java)

> Sam's Question: Can we design a thing like lists/arrays that (1) give fast access to
individual elements; (2) won't behave too slowly if we do deleteElementAt(2), insertElementAt(2), getElementAt(1000000)

_How do we tell Java that we want an ArrayList that contains only strings?

> Use angle brackets.  That should make Java happy.  You need to use a class
(so Integer rather than int).

    ArrayList<String> strings = new ArrayList<String> ();

_How would you write average?_

> We'll come back to this tomorrow, but: 

    a/2 + b/2 + (isOdd(a) && isOdd(b) : 1 ? 0);

    Only works in the sitation that they are both non-negative
