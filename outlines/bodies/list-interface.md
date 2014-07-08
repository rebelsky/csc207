ADT Design, Reviewed
--------------------

* ADTs provide a high-level overview of how the type helps you think
  about data.
* I like a short "philosophy" statement - what's the grounding
  principle?  For example, an array or vector is a collection of values
  indexed by integers (typically integers from 0 to N-1).
* Then we think about the *methods* that will provide those facilities.
* Reflecting upon possible *uses* of the ADT may help us think more about
  what methods to provide.
* Eventually we *implement* the ADT as a data structure, choosing a physical
  way to represent the information, and implementations of the methods.
* These then give us running times for the methods.

Keep in mind that ...

* There is often no one correct design for an ADT.  Different designers
  will make different choices.
* The implementation will likely make some operations faster and some 
  slower.  Hence, it can be useful to think about what operations are
  likely to be used more frequently.
    * And it may be useful to have multiple implementations.
* I will often push you to explore more concepts in your design
  and new ways to implement.

Lists
-----

* You've implemented lists as a data structure.  You've used Scheme lists.
  Both encourage you to think about lists in a particular way, a way that
  may be grounded in implementation.
* So let's take a step back and think about what the guiding principles
  of lists are.
    * We accept that lists collect values.
    * Heterogeneous or homogeneous?
    * Fixed-size or dynamic?
    * What other issues?
* Given those guidelines, what are the reasonable methods?  You may
  find it useful to think about general ideas (create a new list) and then
  think about particular details and options.
    * Some of the time, you'll only want one veresion of the method.
    * Some of the time, you'll find it easier to have multiple versions.
* I'll give you five-to-ten minutes to write down methods you think would
  be useful.
    * Don't search the web.  This is a design exercise.  There are no
      wrong answers.
* Then we'll go around the room seeing what you've come up with.

Implementation
--------------

* How do we implement lists?
* As arrays
* As linked structures (aka "linked lists")
