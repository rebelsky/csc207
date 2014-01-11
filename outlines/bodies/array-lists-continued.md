Status of Array-Based List Implementation
-----------------------------------------

* We can prepend and append.
    * We've even seen a clever trick for constant-time prepend
      (provided we don't have to expand the array)
* We've started to design our iterators
    * Right now, all they have is an integer field

Basic Iterator Tasks
--------------------

* Implement the constructor
* Implement `get`
* Implement `advance`

Two More Difficult Tasks: `insert` and `delete`
-----------------------------------------------

* What's the structure of `insert`?
* What's the structure of `delete`?
* Can we make either constant time?
    * There is a hack that some people use for deletion, but it doesn't
      preserve order.

Some Complications
------------------

* How do we know that an interator belongs to this list.  Do we care?
* What happens to the other iterators after an insertion/deletion?
