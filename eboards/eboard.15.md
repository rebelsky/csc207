CSC207.01 2014S, Class 15: Inheritance
======================================

_Overview_

* Preliminaries.
    * Admin.
    * Upcoming Work.
    * About Exam 1.
    * Questions.
* Questions on Polymorphism.
* Questions on Inheritance.
* Labs.

Preliminaries
-------------

### Admin

* It appears that snow is more of a deterrant than cold.
* I will not be holding a review session tomorrow.  Sorry.
* Finish the polymorphism lab before beginning the inheritance lab.
* Extra credit: 
    * CS Extra Thursday at 4:30: Stone on Red/Black Trees
    * CS Table Friday at noon: Law, Order, and Computers
    * More?

### Upcoming Work

* Finish Homework 4.
* Look at the exam so that you have questions for Friday.
* Reading for Friday: Javadoc
* No writeup for inheritance lab.
* Still need to do writeup for polymorphism lab.

### About Exam 1

* Four questions.
* Amaznigly fun.
* Sam will try to do the exam to.
* Sam will post unit tests for problems 3 and 4.

### Questions on the Homework

Questions on inheritance and polymorphism
-----------------------------------------

Why use interfaces when I can just use inheritance?

> What if you want to support *two* different interfaces?

> Images are renderable

> Images are multipliable

> And multiple inheritance is *really* confusing.  What if both superclasses
  have a method with the same signature? (implementing multiple inheritance
  is also a PITN)

> Arrays are probably Iterable, Clonable, and Comparable

> There's not much data or methodology you'd want to inherit

If my class extends a class that implements multiple interfaces, does my
class also implement those interfaaces?

> Yes, and you don't even need to say so explicitly.  (I hope.)

How do I use inheritance in place of interfaces?

> We've seen that if A implements B then we can use A in place of B.

> It's also the case that if A extends B then we can use A in place of B.

What are the big differences between inheritance and implementation?

> In inheritance, you get copies of the fields and methods.

> In inheritance, you need to be careful in the design of your constructors
  (see lab for details)

Lab
---

Thinking about ways to group blocks

    TextBlock block1 = new TextBlock("Hello");
    BoxedBlock block2 = new BoxedBlock(block1);

vs.

    TextBlock block1 = new TextBlock("Hello");
    TextBlock block2 = new BoxedBlock(block1);

vs.

    TextBlock block2 = new BoxedBlock(new TextBlock("Hello"));

Problem 7


* How do I implement `width`?  
    * What is the width of this object in terms of the width of the enclosed object?
* How do I implement `height`?
    * What is the width of this object in terms of the height of the enclosed object?
* What does the ith row look like?
    * Which row of the enclosed object?
    * How do we modify that row?
