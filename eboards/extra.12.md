CSC 207 2014S: Extra Session, Week 12
=====================================

Overview

* Admin
* You ask questions.
* I try to give answers, or at least direct you in the right direction.

Questions and Answers
---------------------

_If our awesome audio GUI requires library files, (a) How do we indicate that
to the reader? and (b) Why would anyone even bother to compete with us?_

> (a) Put it in the README, along with a link as to what needs to be downloaded.

> (b) Awesome is in the eye (ear?) of the beholder.

_Suppose we have a working parser.  Can we add MVC for only one feature?_

> Sure.

_Tell me about these weird BufferedReader thuingsymuhbobs.  BufferedReaders take
readers and add a Buffer.  When we have an error, we'd like to be able to show you the error.  How do we make it, given that we can only mark the place and move forward?_

> You are correct that marking seems to be the only way to rewind.  When you
  mark and choose a big size, it allocates that much memory.

> Another alternative (I think): If you are starting with something else (a file,
  a string, etc.), you could keep track of how far you've read, build a new 
  BufferedReader, and then read again from the beginning.

> You could choose a maximum line length (e.g., 2048 characters) and set a mark
  at the beginning of each line.

_How do we put an array into heap order in place?_

Invariant

     perm of orig
       heap     |  ????
    +--+--+--+--+--+--+--+--+
    |  |  |  |  |  |  |  |  |
    +--+--+--+--+--+--+--+--+
                |
                i

Initially

    +--+--+--+--+--+--+--+--+
    |  |  |  |  |  |  |  |  |
    +--+--+--+--+--+--+--+--+
    |
    i

One step.  From

       heap     |  ????
    +--+--+--+--+--+--+--+--+
    |  |  |  |  |  |  |  |  |
    +--+--+--+--+--+--+--+--+
                |
                i

To


       heap     |  |  ????
    +--+--+--+--+--+--+--+--+
    |  |  |  |  |??|  |  |  |
    +--+--+--+--+--+--+--+--+
                   |
                   i

Goal

       heap        |  ????
    +--+--+--+--+--+--+--+--+
    |  |  |  |  |  |  |  |  |
    +--+--+--+--+--+--+--+--+
                   |
                   i

Strategy:

* Compare that unknown value to a parent and if it's bigger, swap with parent
  and keep doing so up the tree.  Call swapUp

Code

    for (int i = 0; i < vals.length; i++)
      { 
        Heap.swapUp(vals, i, order);
      } // for i

_What are we doing on Friday?_

> Studying dynamic programming, a really cool algorithmic design strategy.

> It's a generalization of one of the strategies for writing the Fibonacci function.

_Now that you've come back from the Work/Life Balance Town Hall, are you really going to give us another homework assignment before the exam?_

> Nope.  But you do have to prepare your presentation for Monday.

_Exam?  What exam?_

> 3.

_Talk to me about privacy in Java_

> `private` - only members of this class.  Use when you don't see a reason for 
  objects in other classes to use it, or when it's particularly dangerous that
  objects in other classes to use it.  Provides the best encapsulation.

> Some programmers believe that an object should have private fields and
  provide getters and setters for clarity.
