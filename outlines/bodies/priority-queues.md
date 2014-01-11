A quick introduction to priority queues
---------------------------------------

* Linear structures.
* But with the policy "highest priority first".
* Priority represented with a Comparator.
* Probably easier to implement than queues, particularly if you've already
  studied sorting.

Implementation with arrays
--------------------------

* Two options: 
    * Stored in order (put is slow)
    * Stored unordered (get is slow)

Run-time analysis
-----------------

* Put or get is O(n).  
* That's kind of disappointing.  For queues and stacks, put and get
  were both O(1).
* Can we do better?  Yes, but it requires that we learn some new
  concepts.  So we'll return to a better implementation toward the
  end of the semester.

Sorting with priority queues
----------------------------

* Can you guess an obvious sorting algorithm?

Lab
---

Back to our favorite repository.  (And we're not done with it yet!)
