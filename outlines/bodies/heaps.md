Priority Queues, Reviewed
-------------------------

* What is a priority queue?
* What are the primary operations?
* What are the implementations we have?   What are the running times
  of the key operations?

Implementation Techniques
-------------------------

* What are implementation techniques we've learned since we last looked
  at priority queues?
* I know of two: We've started looking at trees and we've learned some
  clever ways of using arrays (in hash tables).
* Will either help?
* Binary search trees are cool, but would be cooler if we could keep
  them balanced.

Heaps
-----

* Simplified binary search trees.
* Binary trees with *the heap property*
    * Each node is at least as big as the roots of its subtrees.
    * Each subtree also has the same property.
* Binary trees that are *nearly complete*
    * It's complete in the sense that most nodes have two children
    * At the last level all the nodes are at the left.

Adding Elements
---------------

* Two invariants to maintain: The shape of the tree and the heap property.
     * Which is harder?  Probably getting the shape right.
* So we add an element at the end of the last level.
* And then we restore the heap property by repeatedly swapping up.

Removing Elements
-----------------

* The largest (highest priority) element is at the top.
* Once we remove it, what do we do?
* Once again, two invariants to maintain: The shape of the tree and the
  heap property.
* So, we take the last element and put it at the root.
* And then we swap it down to the right place?
    * Repeatedly swap with the larger child (provided it's smaller than
      the larger child).

Using Arrays
------------

* Here's the really clever part: We can store heaps in arrays.
* Can you figure out the index of children and parents?

Heap Sort
---------

* Sorting using heaps.  Turn the array into a heap.  Then repeatedly grab
  the top element and put it at the end.
