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
