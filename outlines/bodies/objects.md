A Brief Introduction to Objects
-------------------------------

* The core of object-oriented programming.
* Key idea one: Encapsulation.
    * Group methods and data.
    * Protect data (and some methods).
* In Java, we use template classes to build objects.
* The template specifies
    * The data (fields).
    * The methods.
    * The constructors.
* Fields look like variable declarations.
* Methods look like methods.
* Constructors look like methods with the same name as the class.

Side Notes
----------

* You can cast objects.  
    * You'll get a `ClassCastException` if Java can't convert them.  
* The `instanceof` operation lets you determine whether an
  object can be cast.
  
Standard Object Methods
-----------------------

* Java classes are expected to have a few standard methods.
    * `toString()` - convert to a string
    * `equals()` - determine if this object equals another object
    * `hashCode()` - convert to a relatively unique integer
* There are also a few common methods
    * `clone()` - make a copy
    * `compareTo()` - compare to another object of the same type

Exercise: Counters
------------------

* We'll try to build counter objects.

Exercise: Scheme Lists
----------------------

* We'll try to model Scheme lists (mutable and immutable).
