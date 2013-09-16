When things go wrong
--------------------

* Things go wrong in programs.  You get bad input.  Files you expect to
  be there aren't there.  Clients don't pay attention to preconditions.
* Two wrong approaches:
    * Crash the program
    * Report the error to the user
* A correct approach
    * Report the error to the caller
* In Java, we report errors to callers with *exceptions*

The basis of exceptions
-----------------------

* Indicate that a procedure may fail with `throws Exception`
* Indicate that a procedure fails with `throw Exception`

Lab
---
