Status
------

* We've been designing a new ADT (although one you already know a bit about).
* We designed one version that worked just with strings.
* We also designed a more generalized version.
* Now it's time to start implementing it.

Implementing Lists with Arrays
------------------------------

_"If all you have is a hammer, everything looks like a nail."_

* We'll start with a simple approach - Since the primary structure we know
  is an array, we'll use arrays to implement our lists.
* Fields:
    * The underlying array
    * A count of the number of set elements
* What's an Iterator?  It will be a position in the array.
* How do we append?
* How do we prepend?
    * Easy strategy: Shift everything over one, which is in O(n).
    * Harder strategy: Wrap around.
* What happens when we insert at the iterator?
    * Almost always - Shift things down, which is O(n)
    * What does that do to the other iterators?  Maybe it's time to change
      our documentation.
