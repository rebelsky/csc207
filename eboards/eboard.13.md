CSC207.01 2014S, Class 13: Some Subtleties: References and Automatic Boxing/Unboxing
====================================================================================

_Overview_

* Preliminaries.
    * Admin.
    * Upcoming Work.
    * Questions.
* A Few Notes on Exceptions
* Lab.

Preliminaries
-------------

### Admin

* While you're waiting for real class to start, fork and clone the
  repo for the lab <https://github.com/Grinnell-CSC207/lab-boxing>.
* Reminder: Lab writeups get sent to me, and not the grader.
* You should have received grades on HW2 along with an anonymous detailed
  grade sheet.
* Now that I've graded writeup 8, we should talk for a few minutes 
  about Exceptions.
* Does anyone else need a partner for HW4?
* When I write "Fine", what does it mean to you?
* Mentor session tonight at 7pm in 3821.  A good chance to ask questions 
  (retrospectively on topics and prospectively on homework).  And the
  study break is immediately thereafter.
* Extra credit: 
    * CS Extra Thursday at 4:30: Stone on Red/Black Trees
    * CS Table Friday at noon: Law, Order, and Computers
    * More?

### Upcoming Work

* Readings for Tuesday: Interfaces, Polymorphism, Weiss 4
    * Weiss 4 lasts the whole week, you need not do the whole thing.
* No writeup today!
* Continue to work on HW4. (Or start HW4, for the slackers.)

### Questions on HW4

_How do I test for an exception?_

    try
      {
        CodeThatShouldThrowAnException();
        fail("Exception was not thrown"); 
      }
    catch (Exception e)
      {
        // Success!
      }

_Do we have to support PEMDAS (aka order-of-operations)?_

> No.  I would not expect you to figure out the algorithm on your own.

_If we find a way to support PEMDAS (say, on StackOverflow), will we
 get extra credit?_

> Maybe.

_What operations should we support?_

> Addition, Subtraction, Multiplication, Division, Negation, Store in register

_Can you explain the register/storage elements?_

> Kind of like the store/recall button, but textual

    r0 = 2 * 3
    r1 = r0 * r0

_Do we have to support multiple assignments on one line, as in the following?_

    r0 = r1 = r2 = 2

> No.

_Do we have to worry about the calculator equals, which means print?_

> No.  The = is just assignment.  Print the value after each line

_If you had to write a hash code for fractions, what would you do?_

    return this.num.hashCode * prime1 + this.denom.hashCode * prime2;

### Questions on the Readings for Today

Why won't the following work?

    obj = new Integer((obj.intValue())++);

> It's similar to writing `5++`.  You increment variables, not values.

Some More Notes on Exceptions
-----------------------------

Some lessons from the Exceptions lab.

* You can return different exceptions for different situations.
    * The client can choose appropriate responses for each situation.
* You can design your own exceptions (and it doesn't take much work).
* `catch` clauses are tried in order.
* You should probably throw exceptions on bad input (or recover from bad
  input) rather than returning a special value.

Lab
---
