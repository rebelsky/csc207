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
* We'll potentially look a little bit at their design.

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

