Leftover topics
---------------

* When we advanced beyond the end of the list and then inserted, we got
  some very strange output.  Why?
* Intuitively, deletion and insertion can screw up other iterators.  How 
  should we handle this?
* Many of our procedures have the precondition that the iterator belongs
  to the list.  How do we verify that precondition?

Java Iterators
--------------

* We've been implementing our own iterators (which I will soon call cursors)
* But Java provides a standard Iterator interface, as well as a ListIterator
  interface and an Iterable interface.
* Why should we use these?
* Providing what people expect is one reason.
* But we can also use the awesome foreach loop: `for (var : Iterable) { ... }`

Linked Lists
------------

* Expanding our array-based lists in the middle is expensive.
* So let's find a better strategy.  
* We'll make "Nodes" that link to the next thing.
* First question: Prepend and append
* Second question: Standard iterators
