Outline 10: Exceptional Programming
===================================

Held: Monday, 16 September 2013

Back to [Outline 09 - Input and Output](outline.09.html).
On to [Outline 11 - Classes, Objects, and Interfaces](outline.11.html).

**Summary**

We consider Java's standard mechanism for reporting and recovering from
errors.

**Related Pages**

* [Reading: Exceptions](../readings/exceptions.html)
* [Lab: Exceptions](../labs/exceptions.html)
* [EBoard](../eboards/10.html) 
  ([Source](../eboards/10.md))
  ([PDF](../eboards/10.pdf))

**Overview**

* Dealing with errors.
* Java's Exceptions.
* [Lab](../labs/exceptions.html).

**Administrivia**

* **On the importance of Scholars Convocation.**
  I went to a school that had a large common core.  It was almost guaranteed
  that you or your roommate had read Freud, Plato, Kuhn, and Adam Smith.
  And that shared knowledge meant that discussions of any topic could
  draw upon those ideas.  As much as I love the open curriculum (or
  whatever term they have for it this week), I regret that Grinnell
  students have no shared knowledge base (other than what you get from
  Tutorial, and Tutorials vary significantly).  I think we'd have a higher
  level of academic discussion if everyone went to every convocation, and
  so encourage ever student to do so.

* Exception handling is one of the first places where my students start
  saying "Java is your nanny."  Can you tell why?
* Reading for Tuesday
  FORTHCOMING
* EC Opportunities
    * Convocation this Wednesday.
    * CS Extras Thursday @ 4:30: Kim Spasaro on Linguistics Programming
    * CS Table Friday (pair programming)
    * Other?


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

