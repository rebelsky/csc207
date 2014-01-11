Thinking About Trees
--------------------

* What are the big ideas of binary search trees?
* One I note is that we've found a new way of organizing memory.
    * Not as a chunk of memory
    * Not as a bunch of linked nodes
    * But as a two-dimensional structure
* We might want to generalize the approach
    * To help us think about a technique used for building data structures
    * As an ADT that we can use to represent hierarchies
* That's right, we might use trees to implement non-tree ADTs (as in the
  case of BSTs implementing dictionaries), but we might also use other
  structures to implement things that we "think of" as trees.

Trees, Abstracted
-----------------

* Philosophy
    * A tree is a hierarchical collection of items
    * One item is designated the *root* of the tree
    * Each item has 0 or more *children* 
    * Each item other than the root has exactly one *parent*
    * The child/parent relationship is symmetric - a C is a child of P, then
      P is the parent of C
    * We call the number of children the *arity* of a item
    * An item with no children is a *leaf*
    * The *depth* of a node is the number of parent links one must follow
      in order to reach the root.  (The root has depth zero.)
    * The *height* of a tree is the maximum of the depth of its children.
    * The *size* of a tree is the number of items in the tree.
* Use Cases
    * We represent employees in a company
        * We might want to know who an employee reports to
        * We might want to know who an employee supervises
        * We might want to know how many employees an employee supervises
* Design Questions
    * What is an item?  Can the same value appear multiple times in the
      tree?
    * Are children ordered?
    * Do we allow removal of items?  (The meaning of removal can be 
      confusing when we think about it as an ADT.)
* Methods
    * *To be designed in class*

A Linked Implementation of Trees
--------------------------------

* We can probably generalize our BSTs to make general trees.
* Instead of separate fields for the left and right subtree, we'll use
  an array of all the children.  (We could even use an ArrayList.)
