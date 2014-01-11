Implementing dictionaries, Mark 1
---------------------------------

* The simplest approaches: Store key/value pairs in a list or array.
* Some of the same design questions as priority queues: Do we store
  them in order or unordered.
* For our sample version, we'll store them unordered.
    * `get` involves searching until you find a key or run out of elements
    * `put` involves adding it at an available spot
* We'll use linked nodes, with a dummy node at the front

Looking ahead: Implementing dictionaries, Mark 2
------------------------------------------------

* Can we do better than O(n) for `get`?  (Or, alternately, O(n) for
  for `put`, which still requires O(logn) for `get`?)
* What are techniques we've used for improving algorithms in the past?
    * Divide and conquer
    * Randomness and luck
    * Thinking outside of the box
    * ...
* What's a divide-and-conquer approach?
    * Looking up elements is like binary search
    * Can we build an easy to extend structure that mimics binary
      search?
    * Idea: Instead of having one link from each node, we have two:
      One for the smaller keys, one for the larger keys.
* We'll return to this approach on Monday.
