Outline 06: Debugging
=====================

Held: Monday, 9 September 2013

Back to [Outline 05 - Unit Testing](outline.05.html).
On to [Outline 07 - Arrays in Java](outline.07.html).

**Summary**

We explore debugging, particularly the use of Eclipse's Java debugger.

**Related Pages**

* [Reading: Debugging](../readings/debugging.html)
* [Lab: Debugging](../labs/debugging.html)
* [EBoard](../eboards/06.html) 
  ([Source](../eboards/06.md))
  ([PDF](../eboards/06.pdf))

**Overview**

* Some notes on Java.
* A bit about debugging.
* Lab.
* Reflection (maybe).

**Administrivia**

* [New partners](../partners/2013-09-10.txt)
* A friendly reminder that "Learning from Alumni" is a great opportunity
  to get real-world recommendations on how to prepare for a job or
  internship (and to network).  And you get 1 credit.  Thursdays, 2:15-4:05.
* I'm still working on getting HW1 graded.  Time is just a limited commodity
  (as I think you all know from your own experience).
* Note: Sometimes the html eboards don't get updated right after class.
  You can always see what I typed by going to the original source.
    * And send me a note if you see something missing.
* Reminder: Mentor session Wednesday night (8pm, I believe)
* Study break, tonight, 8pm, CS Commons
* Readings for Tuesday: 
  [Making Your Own Classes](../readings/classes.html) and
  [Standard Object Methods](../readings/standard-methods.html).
* EC opportunities:
    * Humanities Center Speaker Sarah Hendron, Wednesday, 7:30 p.m., JRC101
      Waking the Machines: Art, Design, and Adaptive Technology
    * Learning from Alumni 2:15-4:05 Thursday: Ian Lunderskov '08
    * Tentative Thursday Extra: Matt Atherton '95
    * CS Table, Friday: Trusting Trust.
    * More?


Some Notes on Java
------------------

* As you've noted, it's relatively easy to call a `static` method in
  another class: you just write the name of the class, a period, and
  the method name.
    * Almost every method call will be preceded by something and a
      period.  Sometimes it's a class name (for static methods), sometimes
      it's an object name (for object methods).
* I'm not going to do much about othe C-like aspects of Java.  I assume
  that you'll pick it up from examples, from searching, or from talking
  to me.

Some Notes on Debuggers
-----------------------

* Amazingly, I don't have a lot to say about debuggers, other than that
  I think they're a good idea, but not a silver bullet.
* Oh, I'll mention that I  prefer textual debuggers like <code>gdb</code>.
* And we'll do a very quick demo.

Lab
---

* Do [the lab](../labs/debugging.html)

