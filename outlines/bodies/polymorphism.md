Interfaces
----------

* Separate the what from the how.
* Only have signatures of methods (plus some other stuff).

Polymorphism
------------

_Warning: There is some gap between the ideal of polymorphism and its
  implementation in many languages, including Java._

* Use related things in the same way.
* Why should you have to write N copies of square?  It should work
  with anything that has a multiply method.
    * And it does work that way in Scheme.
    * But Scheme trusts you.  Java is your nanny.
    * (Note: Java does not provide a multipliable interface, so the
       theory and practice don't match as well as they should.)
* Closely tied to interfaces.
    * If you write a procedure that accepts an interface.
    * Then your procedure will work with anything that implements
      that interface.
* Not the same as overloading
    * Overloading requires you to write N methods for N types.
    * Polymorphism requires you to write 1 method for N types.
* Example: Text blocks.
