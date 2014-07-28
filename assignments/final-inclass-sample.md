Sample In-Class Final Examination
=================================

**Held**: 2-5 p.m., Tuesday, 13 May 2014.  (Alternate date: 2-5 p.m.,
Thursday, 15 May 2014.)

This sample final examination is intended to give you a sense of what
the in-class final examination will be like.  While the problems on the
in-class final will not be identical, they will generally have the same
form and level of difficulty as these problems.  Some of these problems
may also appear on the in-class final, as may some variants of the
take-home examination problems.

In preparing for the final examination, you should prepare a set of notes
for yourself (see policy #1 below), practice on these problems, and 
make sure that you know the key ideas from this class.  The key ideas
include

* *Abstract data types*: List, Expandable Array, Dictionary, Linear
  Structure, Stack, Queue, Priority Queue, etc.
* *Data structures*: Linked list, Array-based list, Skip list, Heap,
  Hash table (open and chained), etc.
* *Algorithms*: Sorting (insertion, selection, heap, merge, 
  Quicksort, etc.), Searching, etc.
* *Algorithm and Data structure design strategies*: Divide and conquer,
  Greed, Dynamic programming, etc.
* *Core OOP concepts*: Encapsulation, inheritance, and polymorphism.
* *Object-oriented design patterns*: Model-View-Controller, Adapter,
  Factory, Singleton, etc.
* *Relevant Java concepts*: Interfaces, Parameterized types, Anonymous 
  inner classes, Iterators, Protection levels, etc.

<!--NewPage-->

Preliminary Policies for the In-Class Final Examination
-------------------------------------------------------

1. This is a *closed book* examination.  You may not rely on notebooks,
papers, textbooks, computers, colleagues, or anything similar.  You may,
however, refer to one 8.5 x 11 inch, double sided, hand-written, set of
notes that you brought to this exam.

2. This is also a *paper* examination.  Answer all problems in pen or
pencil in an examination booklet.  You may use pages in the back of the
booklet or any blank space in this packet as scratch paper.

3. There are six problems on this exam.  Although they are not
necessarily of equal difficulty, each is worth the same point value.

4. Some of the problems may ask you to write Java code.  Although you need
not write correct working Java code, your code should be of sufficient
quality that the grader can be confident that you would be able to make
it work correctly with minimal effort when given access to a compiler.

5. Other people may be taking this exam (or a similar exam) at another
time.  Before Monday, 19 May 2014, you may not discuss this examination
with anyone other than Samuel A. Rebelsky.

6. Accompanying this examination is a sheet paper with multiple lists.
One gives a list of strings, the other gives a list of randomly generated
numbers in the range [0..1).  When you are called upon to insert a
sequence of values into a structure, use the sequence of strings.  When an
algorithm calls upon a random number, use the next number in the sequence.

7. Please turn in this examination, the booklet, the lists, and your notes
(if you used notes).

8. After you have completed the examination, please *write* and *sign*
the following statements:

> *I have neither received nor given inappropriate assistance on this
  examination.*

> *I am not aware of any other students who have given
  or received inappropriate assistance on this examination.*

<!--NewPage-->

Sample Lists
------------

*Strings*:

<pre>
 0: twas         1: brillig      2: and          3: slithy
 4: toves        5: did          6: gyre         7: gimble
 8: in           9: the         10: wabe        11: all
12: mimsy       13: were        14: borogoves   15: mome
16: raths       17: outgrabe    18: beware      19: jabberwock
</pre>

*Random numbers*:

<pre>
0.9938 0.3536 0.0868 0.6144 0.4923 0.8577 0.5018 0.8708 0.7499 0.2637
0.3296 0.0406 0.6285 0.0019 0.1583 0.1792 0.3670 0.8066 0.9672 0.6864
0.4107 0.5180 0.9780 0.7079 0.4152 0.0700 0.9885 0.4500 0.2699 0.7753
0.4251 0.0385 0.4412 0.7857 0.7607 0.4015 0.5365 0.7860 0.0002 0.4117
0.7580 0.5596 0.6519 0.1825 0.8308 0.0550 0.9779 0.9829 0.0658 0.9778
0.3412 0.7073 0.4510 0.7349 0.1544 0.2167 0.0492 0.7627 0.2750 0.1551
0.5284 0.8907 0.6884 0.0354 0.3459 0.4067 0.9751 0.4900 0.9701 0.9213
0.3660 0.5836 0.5301 0.9585 0.1566 0.9988 0.4576 0.4416 0.8730 0.7226
0.0067 0.8874 0.8615 0.5830 0.0218 0.1735 0.9051 0.6183 0.9592 0.2025
0.0666 0.7952 0.9632 0.6492 0.1990 0.0350 0.7472 0.2510 0.4714 0.8566
</pre>

Sample Problems
---------------

### Problem 1: Graphing Algorithm Running Times

Sketch a graph of each of the following.

a. The total time spent inserting n elements into a skip list, with
expected behavior of skip lists.  That is, graph the function f(n),
where f is the cost of inserting n elements.  For example, the y value
for an x value of 10 should be the cost of inserting 10 elements.
You may assume that the depth of the skip list is sufficient to handle
the number of elements.

b. The total time spent inserting n elements into a chained hash table
with worst case behavior.  

### Problem 2: Insertion and Removal in Binary Search Trees

a. Show the data structure that results from inserting the first ten
values in your list of words into a binary search tree.

b. Using the random number generator to determine elements, remove
five elements from your binary search tree.  For example, since the
first random number is 0.9938, we would remove element 9,
"in".  Since the second random number is 0.3536, we would remove
element 3, "and".  Since the third random number is `0.0868`, we 
would remove element 0, "twas".  And so on and so forth.

Show the binary search tree after each removal.

### Problem 3: Skip Lists

a. Sketch the algorithm for inserting a new element into a skip list.
You may use pseudocode or Java.

b. Sketch the algorithm for deleting an element from a skip list.  
You may use pseudocode or Java.

### Problem 4: Heaps and Heap Sort

a. Show the heap that results from inserting the the first ten elements of
you list of input strings, one at a time.

b. Write that heap as an array.

c. Show the steps involved in sorting that array using heap sort.
(Recall that the first phase in heap sort is to put the values into
a heap.  Hence, you only have to show the second phase of heap sort.)

### Exercise 5: An Invariant for Computing Stamps

As you may recall, the dynamic-programming solution to the minimum
stamps problem involves iterating an array of values from left to
right.  Assume that each element of the array contains a vector of
the stamps that total that value, with the length as small as possible
(the goal of the problem).  

Since we are iterating an array, we should design a loop invariant.
Give the invariant in both pictorial and textual form.

### Problem 6. Design Patterns

Describe three useful design patterns other than model-view-controller
and factories and indicate one time that we used them in class.

### Problem 7: All Permutations

In testing some algorithms, it is helpful to generate all permutations
of an array.  Suppose we have an interface, `StringArrayTester`,
that provides one method, `test(String[] permutation, String[]
original)`.  Write a method, `testAllPermutations`, that takes a `StringArrayTester` and
an array of strings as parameters, builds every permutation of the array,
and calls the `test` method on each permutation.

<pre>
public void testAllPermutations(StringArrayTester tester, String[] vals)
</pre>

For example, if we call `testAllPermutations` on the array
`["c","a","b"]`, we should see calls to each of the following
(although not necessarily in the same order).

<pre>
tester.test(["c","a","b"], ["c","a","b"]);
tester.test(["c","b","a"], ["c","a","b"]);
tester.test(["a","b","c"], ["c","a","b"]);
tester.test(["a","c","b"], ["c","a","b"]);
tester.test(["b","a","c"], ["c","a","b"]);
tester.test(["b","c","a"], ["c","a","b"]);
</pre>

You may assume that `vals` has no duplicates.

### Problem 8: Iterating Binary Search Trees

You may recall that our binary search trees had a structure something
like the following:

<pre>
public class BST<K,V>
{
  Node root;
  ...
  class Node
  { 
    K key;
    V value;
    Node smaller;
    Node larger;
  } // class Node
} // class BST<K,V>
</pre>

Write Java code for a depth-first, preorder iterator for BSTs.

### Problem 9: An Unnatural Flag Problem

You may recall that our standard partition method rearranges an
array of values so that the left portion meets one criterion and
the right portion meets another criterion (typically, small vs. large).
Similarly, the Dutch National Flag problem rearranges an array of
values to group the values into three sections (red, white, or blue).

Suppose we want to rearrange an array into four sections.  We'll start
with an interface.

<pre>
public interface Classifier<T>
{
  /**
   * Classify a value as one of four categories (represented as
   * the integers 0, 1, 2, and 3).
   */
  int classify(T val);
} // interface Classifier<T>
</pre>

Our goal is to rearrange the values so that all the values that are
classified as 0 precede those classified as 1, the values that are 
classified as 1 precede those classified as 2, and the values that are
classified as 2 precede those classified as 3.

a. Write iterative Java code to accomplish the goals of the four-way flag.
Your algorithm should not do more than 2*n swaps (or equivalent), where
n is the size of the array.

b. Sketch/draw an invariant for each loop in your code.

