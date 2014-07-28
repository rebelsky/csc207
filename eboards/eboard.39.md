CSC207.01 2014S, Class 39: Implementing Dictionaries with Arrays or Lists
=========================================================================

_Overview_

* Preliminaries.
    * Upcoming work.
    * Admin.
    * Questions.
* Implementing dictionaries, mark I.
* Looking ahead: A better implementation.
* Lab.

Preliminaries
-------------

### Upcoming Work

* No writeup today.
* HW 6 remains due tonight.
* Exam 2 makeup due Thursday night (printed in class Friday).

### Admin

* Don't forget to vote in the SEPC elections.
* I have no clue why our server continues to flake out.  I probably find it 
  even more frustrating than you do.

### Extra Credit

* <http://www.strikingly.com/pioneerweekend>
* Any one Spring into Humanities (or is it vice versa) talk.
* Get and wear one of the 1 in 4 shirts next week.
* CS extra Thursday: Software to enhance wellness: The DavisJan team.
* CS table Friday: Lambda in Java 8.
* CS extra next Monday: Walker and Liberto on bluetooth.

### Questions

_Do we need to implement iterators for problem 1?_

> Of course.  Traditionaly, queue iterators iterate from front to back.

_Do we need to implement iterators for problems 2 and 3?_

> Problems 2 and 3 are about using structures, rather than implementing them.
  You'll probably need an iterator for problem 3, but the underlying ADT should
  provide it to you.

_Can you tell what's wrong with my code?_

> Probably, but I need your code and the actual error message that you got.

Implementing dictionaries, mark I
---------------------------------

* Linked list of key/value pairs
* add is O(1)
* sensible add is O(n)
* get is O(n)
* remove is O(n)

Looking ahead: A better implementation
--------------------------------------

* Use skip lists
    * Add: O(logn)
    * Get: O(logn)
    * Remove: O(logn)
* If we keep the keys in order (and use an array rather than a list), we can 
  do binary search
    * Add O(n)
    * Get O(logn)
    * Remove O(n)
* First question in improving algorithms: Can I use divide and conquer?
* Can we apply divide and conquer to data structures?

Lab
---

* What's wrong with the unit tests?
    * Don't test what happens if we remove something we've set twice.
* What's wrong with `add`?
    * It turns out that our construtor for nodes was buggy.
    * Moral: You need to look in lots of places to find bugs.
    * Moral: You might want to draw pictures.
    * Moral: Sometimes you only figure things out by tracing code.
* Is the incorrect unit test a good thing?
* How should we deal with the "`remove` fails with duplicate keys" problem?
    * Change `add` to not add duplicates.
    * Change `remove` to remove duplicates.
