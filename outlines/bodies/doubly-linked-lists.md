Review of Singly-Linked Lists
-----------------------------

* Nodes have value and next.
* Likely fields: Front of the list, back of the list.
* May need special cases for empty list.

Insertion and Deletion in Singly-Linked Lists
---------------------------------------------

* We noted that insertion and deletion can be hard, since you want to
  insert where the cursor is.
* A trick: *Keep the cursor immediately before the item you will return
  with `next`, rather than on that item.*
* How do you deal with the front of the list.  You have a "dummy" node.

Doubly Linked Lists
-------------------

* All the fun of linked lists, but with a back pointer.
* Need to be careful to work out the special cases.
    * Diagrams help.

Circularly Linked Lists
-----------------------

* The "dummy node" trick can be really useful in handling the special
  cases of circularly linked lists.
* In this case, we do two things with the dummy node 
    * The next pointer refers to the front of the list
    * The previous pointer refers to the back of the list
    * If the list is empty, the pointers refer back to the dummy node
