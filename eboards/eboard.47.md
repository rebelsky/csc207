CSC207.01 2014S, Class 47: Heap Sort
====================================

_Overview_

* Preliminaries.
    * Admin.
    * Upcoming work.
    * Questions.
* Heap sort.
* Can we do better?
* Lab.

Preliminaries
-------------

### Admin

* Sad Earnest.
* Don't forget to register!
* I need two graders for next semester who can do detailed comments.
  Yes, I will provide training.
* I've heard concerns that the Eclipse formatter rearranges comments.
  I *think* the current style avoids that problem.

### Upcoming Work

* Reading for Friday: No reading.  
* Today's writeup: Exercise 5.
* Part 2 of the project is due Friday at 10:30 p.m.  (No, I'm not updating
  the Web page.)

### Extra Credit

* Today's Town Hall at noon and 7:30 on Work/Life balance.
* One pride week activity.
* Math extra Thursday: Sphere Packing.
* CS Table Friday: Heartbleed.
* Women's Track and Field Friday at Simpson.
* Iowater project April 26 - Tag drains.  Mail iowater@grinnell.edu for details.

### Questions

Remaining Questions from Heaps
------------------------------

* Given the index of an element, what are the indices of its left child, right
  child, and parent?
    * Left child: 2*i + 1
    * Right child:  2*(i+1)
    * Parent: (i-1)/2, round down
* Why do we care about the indices of the children?
    * We can actually store it in the array.
    * For swapping down after removal
* Why do we care about the index of the parent?
    * For swapping up after insertion

Heap Sort
---------

Repeatedly remove largest and shove at end.

* Each time we grab the largest and shove at the end is O(logN)
* The overall routine is O(NlogN)
* Why is this better than other NlogN sorting algorithms?
    * Quicksort: Heap sort is predictable, Quicksort is not
    * Merge sort: This sorts in place!  Merge sort does not.
    * Skip list sort: Heap sort is predictable.  Skip list sort is not
      And uses lots of overhead.

Can we have a better implementation of priority queues?
-------------------------------------------------------

* No.

Lab
---

Writeup number 5!
