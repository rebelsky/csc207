Outline 07: Arrays in Java
==========================

Held: Tuesday, 10 September 2013

Back to [Outline 06 - Debugging](outline.06.html).
On to [Outline 08 - Some Basic Types: Numbers and Strings in Java](outline.08.html).

**Summary**

We consider the design of arrays as an ADT and then the specifics
of arrays in Java.

**Related Pages**

* [Reading: Arrays](../readings/arrays.html)
* [Lab: Arrays](../labs/arrays.html)
* Javadoc 
* [EBoard](../eboards/07.html) 
  ([Source](../eboards/07.md))
  ([PDF](../eboards/07.pdf))

**Overview**

* About HW 2
* ADT Design
* Arrays
* Strings (maybe)

**Administrivia**

* A final reminder to register for the 2nd-year retreat.  It looks like
  a good opportunity to do lots of things - talk more about group work,
  learn from alums, think about choosing a major, etc.
* It sounds like there was some demand that I focus on the syntax and
  semantics of imperative Java, so I've rearranged the syllabus (including
  today) to go over it.
     * Rearranging stuff put me even further behind!  Readings may not
       be ready in time, and class sessions will probably focus on
       lecture + discussion + recitation.
* Reminder: Mentor session Wednesday night at 8pm
* Readings for Wednesday (expect them later today):
     * [Strings in Java](../readings/strings.html)
     * [Numbers in Java](../readings/numbers.html)
* Homework 3 is ready!
* EC opportunities:
    * Humanities Center Speaker Sarah Hendron, Wednesday, 7:30 p.m., JRC101
      Waking the Machines: Art, Design, and Adaptive Technology
    * Learning from Alumni 2:15-4:05 Thursday: Ian Lunderskov '08
    * Tentative Thursday Extra: Matt Atherton '95
    * CS Table, Friday: Trusting Trust.
    * More?


Some Initial Notes on HW2
-------------------------

* Many of you spent about the amount of time I would have hoped 4-5 hours.
* The biggest challenge seems to have been the lab equipment (Git and
  Eclipse).  Also learning a bit about syntax.
* A number of you said that getting the syntax right for parts C and D
  was hard.  There's a reason that I wrote "It's okay if this code doesn't
  compile."
* The average one came from a bug in Java's implementation of binary
  search, a bug that was first noticed by someone at Google.  
    * I included the problem to remind you that you really do need to
      think about boundary cases.

ADTs, Revisted
--------------

When you design an ADT, you should think about

* Philosophy
* Practica
* Procedures
* ...

One big conceptual issue: Are you a minimalist or a maximalist?
(Do you put as little or as much as possible in your design?)

After designing, think about implementation.

Arrays in Java
--------------

* Arrays are both an ADT (in the sense that we can think about them
  as meeting some abstract goals that can be implemented in many
  ways) and a data structure (in the sense that we can also pay
  attention to their implementation.
* We started to look at Arrays as ADTs on the first day of class.
* We'll continue today.

Strings in Java (optional)
--------------------------

