CSC 207 2014S: Extra Session, Week 14
=====================================

Overview

* Admin
* You ask questions.
* I try to give answers, or at least direct you in the right direction.

Questions and Answers
---------------------

_Should I take the in-class or take-home exam?_

> I think the in-class is "easier" (in the sense that you don't have to write 
  perfect code, or much code), but you do have to study/think in advance.

> The in-class is intended to take less of your time.

_Can you do problem 1 on the sample take-home exam?_

> Sure.

> What do we know about skip lists?  Expected time to insert something is 
  O(logn).  The time to insert n elements is nlogn, which is slightly worse
  than linear.  A not-quite quadratic curve would be good.

> For b, Worst case behavior is to insert everything into the same bucket.
  So 1 + 2 + 3 + ....  that's O(n^2).  However, the hash table does double
  in size when it gets pretty full, so we'd have to deal with that issue, too.

_Can you do the evil skip list problem (exercise 3)_

> Basic idea of skip lists is that we have different "height" of nodes, with
  about 1/(2^h) nodes of height h.  If this is done right, we can use the one
  or two nodes at the top height to throw away half the elements, and then
  again and again at each level.

> Insertion: 

        1. Pick a height to help get the right distribution: 50% probability of
           height 1, 25% probability of height 2, 12.5% probability of height 3,
           and so on and so forth.
        2. Find where the node belongs
             For height = maxheight down to 1
                Step along the nodes at height height until we are at
                the largest value smaller than the goal
        3. Insert the node there
        4. Make links from all the predecessors identified above

> Deletion:

        Almost identical.  Once again, we gather all the predecessors using
        the "advance along each level" technique.  Then, set node[level].next
        to node.next[level].next[leve]

_Can you do the invariant for computing stamps?_

> See the  (now erased) whiteboard.

_How about problem 2 on the take-home?_

> You should be pretty familiar with the structure of JSON.  Yay.

> In Sam's parser, Objects are stored as Hashtables and arrays as ArrayLists

> Problem: Identify the fields of the object (you know), recursively print
  at different levels of indentation.  Hint: Look at one of the many
  "dump this tree" methods that Sam wrote.

_How about problem 3?_

> Help on invariants is hard.  So let's talk about postconditions.  Your goal
  is that the heap property holds for every index in the array.

_Any other comments?_

> Wow.  The take home is more straightforward than I would have thought.  
  Searching our Web site may help for many problems.

