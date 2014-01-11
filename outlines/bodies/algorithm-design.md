Algorithm Design
----------------

* You are faced with a new algorithmic problem.  How do you approach
  solving it?
    * And what are common patterns of algorithms?
* We'll take a few minutes for you to talk amongst yourselves, and then
  we'll see what you've come up with.

Object Design
-------------

* Object-oriented programmers tend to like to think about object design
  in similar ways.
* That is, what are common patterns of design.
* Here's one: The singleton.  It's a class in which we want only one
  object.
* Our example is the integer comparator, at least as we first wrote it.
<pre>
public class StandardIntegerComparator implements Comparator<Integer> {

} // class StandardIntegerComparator
</pre>
* Take a few minutes to talk to your friends about other common patterns
  of design.
* A few that we've used
    * Adapter - Convert an object to meet a different interface
    * Delegate - Ask another object to do most of the work
    * Wrapper (not a formal one) - Extend methods in another class,
      but meet the same interface
    * Iterator - Provide access to the values in a structure without
      giving access to the internal design of the structure
    * Model-View-Controller
* A few others that you may find useful
    * Factory

Program and Test Design
-----------------------

What other techniques have we learned in designing programs and tests?
