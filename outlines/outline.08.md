Outline 08: Some Basic Types: Numbers and Strings in Java
=========================================================

Held: Wednesday, 11 September 2013

Back to [Outline 07 - Arrays in Java](outline.07.html).
On to [Outline 09 - Input and Output](outline.09.html).

**Summary**

We consider a few more of Java's core types, particularly strings and
the numeric types.

**Related Pages**

* [Reading: Arrays](../readings/arrays.html)
* [Reading: Strings](../readings/strings.html)
* [Reading: Numbers](../readings/numbers.html)
* [EBoard](../eboards/08.html) 
  ([Source](../eboards/08.md))
  ([PDF](../eboards/08.pdf))

**Overview**

* Minimalist vs. Maximalist ADT Design.
* Arrays, Continued.
* Strings.
* Numbers.

**Administrivia**

* Reminder: Mentor session TONIGHT at 8pm (or maybe 8:30)
* Although there are links (broken?) to labs for yesterday and today,
  we won't be holding those labs.  (Parts of the labs are in the homework
  assignment.)  I do hope to hold lab on Friday.
* Nationwide will be on campus next Tuesday to talk about (and recruit for)
  jobs and internships.  There's a 4:15 talk, but there's also a noon lunch
  for Math/Stats and CS majors.  Signs should be around.
* Reading for Friday (expect it Thursday; I'll send email)
     * [Input and Output](../readings/io.html)
* It's been noted that the kinds of questions I'm asking on your homework
  assignment are a lot like coding questions that get asked in interviews.
  The overlap is *not* intentional.  (I don't object to it, but I just
  choose questions that I think will challenge you appropriately.)
* If you are not on the CS mailing list and want to be on it, let me 
  know and I'll get you added.
* I see only one (worried) prologue for HW3.  
    * Here's a hint on the last problem: Recursion is likely to be your 
      friend, at least at first.
* EC opportunities:
    * Humanities Center Speaker Sarah Hendron, TONIGHT, 7:30 p.m., JRC101
      Waking the Machines: Art, Design, and Adaptive Technology
    * Learning from Alumni 2:15-4:05 Thursday: Ian Lunderskov '08
    * We think the Matt Atherton Thursday extra is NOT happening.  Sorry.
    * CS Table, Friday: Trusting Trust.
    * More?

Minimalist vs. Maximalist ADT Design
------------------------------------

* What arguments do you have for "just as many procedures as you need, but
  no more"?
* What arguments do you have for "about as many procedures as you think that
  someone will use"?
* In coming up with your answers, you may want to consider the issue from
  the perspective of the client programmer and the implementing programmer.

Arrays, Revisited
-----------------

* Suppose you had a maximalist view of ADT design.  What other methods
  would you want arrays to support?  (And yes, you can draw upon your
  experience with other languages.)
* We've talked a little bit about Java's basic array mechanism and 
  you've even used them.  What questions do you have?
* What different design decisions could we have made (other than simple
  minimalist/maximalist choices)?  Some of mine include:
    * Static or dynamic?
    * Syntax: Special or standard?
    * ...
* We'll take a quick look at Java's Vector class, which follows the
  same <quote>indexed collection of homogenous values</quote>
  array except that 
    * Vectors are dynamically sized
    * Vectors are objects, so their methods use standard call syntax
    * Vectors use more of a maximalist approach

Strings
-------

* What do you see as their purpose/philosophy?
* Their practical use is obvious enough that we won't cover it.
* What procedures would you expect to see?
    * In a minimalist ADT?
    * In a maximalist ADT?
* We'll quickly visit the String API

Numbers
-------

* Integers and Reals
* Primitive and objects
* Fixed precision and arbitrary precision
* Careful definitions of the implementation of primitive integers
  (including number of bits and representation)
    * Java was designed to be portable.
* We'll quickly visit some of the number APIs

