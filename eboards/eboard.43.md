CSC207.01 2014S, Class 43: Hash Tables, Continued
=================================================

_Overview_

* Preliminaries.
    * Admin.
    * Questions on the project.
* Questions on hash tables.
* Lab.

Preliminaries
-------------

### Upcoming Work

* Reading for Friday: You may review the reading on Hash Tables.  (You need not.)
* Today's writeup: Exercise 3b.  
* Part 1 of the project is due tonight.
    * I'll take questions after the introductory stuff.

### Admin

* Yesterday's MathLAN problem solved - The lock daemon was broken.
* The longstanding MathLAN problem has not been solved.

### Extra Credit

* Convo today: Philip Deloria, Professor of History and Native American 
  Studies, University of Michigan.
* CS extra Thursday: Charlie Eddy on Kinect.
* CS Pub Night Thursday.
* CS table Friday: Big Data (Stone leads).
* Get and wear one of the 1 in 4 shirts.
* Any other sexual assault awareness week activity.
* Iowater project April 19 - Tag drains.  Mail iowater@grinnell.edu for details.
* <http://www.strikingly.com/pioneerweekend>

### Questions on the Project

_Do we have to support top-level arrays and not just top-level objects?_

> Yes.

_When we are handling numbers, how do we deal with the various kinds?_

> Option 1: Always use BigDecimal.

> Option 2: Pay attention to what symbols you've seen in the number (or
  build the string and search for symbols).   If it includes a decimal
  point, it's a decimal number.  If not, it's an integer.

_Where would you make that decision?_

> Probably in the parser.

_What advice does E-guy have?_

> Use a wrapper class.  But Sam says it's up to you.

_What's the performance of charAt and substring?_

> charAt is O(1)

> I don't know the implementation of substring.  I think it is
  O(length of resulting string), but it could be O(1)

_What's the performance of "build a string by appending characters"?_

> O(n^2), unless you are using a StringBuffer/StringBuilder.

> But you probably want to use substring instead.

_Do key/value pairs appear anywhere besides in objects?_

> No.

Questions
---------

Lab
---

* 
* Today's writeup: Exercise 3b.  
