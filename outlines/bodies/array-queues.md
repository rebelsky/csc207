Wrappers, Adapters, and Delegation
----------------------------------

What interesting (or not so interesting) design ideas did you get
from `ReportingLinearStructure.java`?

Here are some of the things I see as important ideas:

* We already know that we can add functionality to a particular class by
  subclassing.
* `ReportingLinearStructure.java` shows another mechanism for adding
  functionality, one that works for an arbitrary class that implements
  an interface.
* The basic strategy:
    * Our wrapper/adapter has a field that contains an object that
      implements the interface.  I call this the <quote>wrapped
      object</quote> or <quote>wrapped class</quote>.
    * Our wrapper/adapter also implements the interface.
    * Most of the methods are implemented by *delegating* the actual work
      to the wrapped object.
    * But the wrapper can add functionality or modify the behavior.

Here's my really bad ASCII art diagram.

              Wrapper
             +-------------------+
    Client ---> fun: wrapped.fun |
             |                   |
             |  wrapped          |
             |    +---------+    |
             |    | fun     |    |
             |    +---------+    |
             +-------------------+

Uses

* As you saw, one use of this pattern is to provide some automatic
  logging of your program.  When you want to log everything an object
  does, you wrap that object with something that logs each call.  Once
  you're satisfied, you remove the wrapper.
* It's also useful to add some analysis capabilities, such as a count
  of the number of times each method is called.
* Or we can change some of the behavior.  For example, we might have
  something that calls put twice for each call.  (I have no idea why
  you would want such behavior.)
* A talented Java programmer can probably write a generic logging or counting
  wrapper.  I don't have the time or depth of knowledge of Java introspection.

Terminology and Design Patterns
-------------------------------

* As object-oriented (and other) programmers have found common approaches
  to problems, they've worked to find common names for these approaches
  to make it easier to talk to others about the approach.
* Often, people use the term "design patterns" to refer to this approach.
    * Design patterns are a bit more specific, in the sense that a good
      design pattern also tells you a lot about when to use the pattern.
    * Most of the members of this department like design patterns primarily
      as a use of common terminology.
* I've had trouble finding the right term for this approach, which is a
  common pattern.
* I call these "wrappers", but I use "wrapper" for a lot of things.
* They use delegation (or the delegate pattern).
* They are kind of like the adapter pattern, although adapters are usually
  used to make objects meet new interfaces.  (You've seen me use adapters
  to get built-in Java classes meet my interfaces.)

Lab
---

* Read code.  
* Fix bugs.  
* Fix more bugs.  
* Write an interator.
