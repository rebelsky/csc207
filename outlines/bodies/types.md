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

Boxing and Unboxing
-------------------

* Java distinguishes between primitive types (e.g., `int`) and corresponding
  objects (e.g., `java.lang.Integer`).
* In early versions of Java, you had to explicitly convert from one form
  to the other.
* In current Java, many conversions happen automatically (although not
  for arrays of types).
