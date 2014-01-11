Tree Traversal
--------------

* Once we've built a tree, we may want to systematically visit the nodes
  in the tree.  We call that *tree traversal*.
* There are a number of decisions to make as we design a traversal 
  algorithms.
* If we assume that the children/subtrees are ordered, do we visit them 
  left-to-right or right-to-left?  (Yes, there are reasons to do both.)
* Do we delve deeply into a subtree before we go across the tree 
  (*depth-first*) or do we go across each level of the tree (*breadth-first*)?
* If we are doing a depth-first traversal, do we visit a node before
  (*preorder*), between (*inorder*), or after (*postorder*) its children?
    * Why after?  If we are computing a value based on the children,
      we need to have the children finished.
* If we are doing a breadth-first traversal, do we go top-down or bottom-up?
* And how do we implement all of these, anyway?
    * That's the subject of today's lab.

Lab
---
