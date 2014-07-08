Anonymous Inner Classes
-----------------------

* Almost as cool as anonymous functions.
* Basic idea: Create "one off" classes without naming them.
* Some uses
    * On-the-fly predicates
    * On-the-fly comparators
    * Iterators
    * And more

Syntax
------

With interfaces

    new *Interface*() 
      {
        *Body of Class*
      } 

With classes

    new *Class*()
      {
        *Body of Subclass*
      }

Subtleties
----------

* When compiling, you'll get extra `.class` files with names like
  `MainClass$1.class`.

Lab
---


