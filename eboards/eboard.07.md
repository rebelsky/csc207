CSC207.01 2014S, Class 07: Some Basic Types: Numbers and Strings in Java
========================================================================

_Overview_

* Preliminaries.
    * Admin.
    * Work.
    * Questions.
* A quick note on printing arrays.
* Lab.

Preliminaries
-------------

### Admin

* Sorry about the limited amount of lab time yesterday; I was assuming that we 
  could go through the questions a bit more quickly.  Today we'll just do lab,
  so there should be enough time (perhaps even enough to work more on the
  arrays lab).
    * There's a lot on the outline for today, but I don't think it's worth
      going over.  We did some yesterday, and lab time is important.
    * In the near future, we'll debrief on relative time spent on different 
      approaches.
* I'll hold a review session at 10:00 a.m. tomorrow.
* Extra credit: 
    * CS Extras, Thursday: Ushahidi, Android, and 207 by Spencer, Daniel, and Lea.
    * CS Table Friday: The ACM Code of Ethics.
    * Convo Feb. 5.  (I'll give my "Why go to convo" lecture closer to the date.)     

### Upcoming Work

* Homework 2 is due at 10:30 p.m. tonight.
* Homework 3 assigned.  No partners!
    * Last semester's class said: "Make your students do some work by
      themselves."
    * Earnest says "This is a key homework, and you'll learn more by doing it
      on your own."
* Today's writeup: Exercise 9
    * Due Friday
    * Subject: CSC 207 Writeup 5: Basic Types (YOUR NAME(S))

### Questions

A quick note on printing arrays
-------------------------------

[examples/arrays/ArrayPrinting.java](../examples/arrays/ArrayPrinting.java)

* Use `Arrays.toString (array)` when you want to convert an array to a string
  (e.g., for printing)

Lab: Lessons, Notes, and Comments
---------------------------------


Intgers

* As we expect, the largest integer seems to be 2^31-1 
    * That's the largest integer one should be able to represent in 32-bit
      twos complement.
* In case you've forgotten, two's complement is pretty simple
    * For positive numbers (leading 0), it's normal binary
    * To negate a number, you flip all the bits and add 1

Strings

* Strings are immutable
* String and string buffer indexing
    * 0-based
    * Operations that take ranges tend to be of the form [lb .. ub).  That is,
      they include the lower bound but not the upper bound.

Miscellaneous

* It's all pointers.
