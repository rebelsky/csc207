Outline 09: Input and Output
============================

Held: Friday, 13 September 2013

Back to [Outline 08 - Some Basic Types: Numbers and Strings in Java](outline.08.html).
On to [Outline 10 - Exceptional Programming](outline.10.html).

**Summary**

We consider basic mechanism for textual input and output in Java.

**Related Pages**

* [Reading: I/O](../readings/io.html)
* [Lab: I/O](../labs/io.html)
* [EBoard](../eboards/09.html) 
  ([Source](../eboards/09.md))
  ([PDF](../eboards/09.pdf))

**Overview**

* Leftover types topics.
* A few notes on textual output and input.
* Output.
* Input.
* Lab.

**Administrivia**

* Reading for Monday (it's ready!)
    * [Exceptions](../readings/exceptions.html)
* I've prepared a lab for today, but I don't know if there will be time.
* I hear that some of you are losing files.  You should make it a practice
  to save early and often.  You should also make it a practice to commit
  regularly.  (Say, after each working procedure you write.)
* I'm in the midst of grading HW2.  I should have it done by Monday. 
  We'll discuss the averaging problem.
* Only about half the class has filled out the prologue (as of
  8:30 p.m. on Thursday)
    * Do you want hints on the strategy?
    * Your initial solution will be inefficient.  That's okay.
      (And yes, it can stay inefficient.)
    * Hint number one: An exhaustive approach is a reasonable start.
* EC opportunities:
    * CS Table, Friday: Trusting Trust.
    * CS Table, next Friday: Pair Programming.
    * More?

Leftover Stuff on Basic Types
-----------------------------

* I'll do a quick review.
* Do you have questions from the readings?
* Make sure to browse the API so that you can see what functions are
  available.

Textual Input and Output
------------------------

* For many years, the only way you interacted with the computer was from
  the command line.
* These days, we more frequently interact via more complicated GUIs.
* But it's still nice to be able to generate and read text (not least
  because we'll want to store data in files and retrieve data from
  those files).

Output
------

* We'll explore output by looking at the Java API for some basic output
  classes.  (In part, we're doing it this way because you need to get
  used to reading the API.)
* The classes we'll consider are
    * `java.io.PrintWriter`
    * `java.io.File`

Input
-----

* We'll explore input by looking at the Java API for some basic input
  classes.  (In part, we're doing it this way because you need to get
  used to reading the API.)
* The classes we'll consider are
    * `java.io.InputStreamReader`
    * `java.io.BufferedReader`
    * `java.io.FileReader`

Lab
---

* There should be a bit of time to start [the lab](../labs/io.html).

