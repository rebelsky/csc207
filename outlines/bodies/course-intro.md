About the Course
----------------

* CSC 207, like CSC 151 and CSC 161, is about a lot of different but
  related things.
    * It's a course about _formalized problem solving_, how you take
      a problem, formalize the problem, design a solution, express
      the solution in a formal language, and analyze the solution
      (and perhaps the problem).
    * It's a course about _algorithms_, the instructions we write
      to solve problems.
    * It's a course about _abstract data types_ and _data structures_,
      the ways in which we organize information as we solve problems.
      (Our organization can have a significant impact on our algorithms.)
    * It's a course in _programming_, the implementation of algorithms
      and data structures.
    * And it's a course in _software design_, how you approach the problem
      of designing and linking together disparate parts to make a 
      working program.
* In exploring algorithms, we will 
    * Consider a few classic algorithms.
    * Learn asymptotic analysis, a formal technique for comparing the
      running time or space usage of algorithms.
    * Develop some general patterns of algorithm design.
    * And, of course, design our own algorithms.
* In exploring abstract data types and data structures, we will
    * Consider a few classic ADTs and data structures
    * Design our own ADTs and Data structures
    * Develop a few general approaches to the design of data structures
    * Consider ways to consider the efficacy of a data structure 
      (typically in terms of the algorithm it serves)
    * And, of course, implement a variety of ADTs and data structures
* In exploring program design, we will begin your path on understanding
  object-oriented design.  We will focus on the three tiers of OOD -
    * _Encapsulation_ - techniques for grouping related parts together 
      and shielding them from the resting of the program.
    * _Inheritance_ - techniques for defining new things from old.
    * _Polymorphism_ - techniques for designing and writing things
      that work in multiple, relatedacontexts.
* And yes, you'll learn how to program in Java.
* We will also work on a variety of general skills in addition to
  problem solving - group work, thinking on your feet, communication,
  and more.

* From my perspective, CSC 207 is the real gateway to the major, the course
  in which you start to become a real computer scientist and/or a real
  programmer.
* Yes, you've written programs, algorithms, and data structures in your
  previous courses, but your depth of analysis has been relatively shallow
  and your programs have been comparatively small.
* Of course, our analysis won't be as deep as it gets in 301 or 341, and
  our programs won't be as large as they get in 323, 325, or 362, but
  we do ramp things up a bit in this course.
* _And no, we do not intend this course as a weed-out course_

* A few underlying approaches:
    * _Separate interface and implementation_.  (You can also think
      of this as separating the _what_ and the _how_, the six P's
      vs. the corresponding Scheme code.)
    * _Start simple_.  We're tempted to add lots of features.  But
      more features limit your choice of implementation.  So we'll
      start simple and build.
    * _Refactor_.  Good programmers find common code and write 
      instructions that factor out the commonalities.  So, whenever
      you are tempted to copy, paste, change, write a more general
      function and just call that function.

The Course Themes: Computing for Social Good and Android App Development
------------------------------------------------------------------------

* This semester, we are trying an experiment of adding themes to the
  course, just as we have themes in 151 and 161.
* Drawing upon surveys of prospective and past CSC 207 students, and
  with some of my input, my research students decided upon two general
  areas to include: Computing for Social Good and Android App Development.
* Feedback also suggested that some students were worried that these
  additional topics would take away from the core of the course. 
    * We've worked hard to make the intrusion minimal
    * In many ways, I think these topics help strengthen the core
      topics of the course - Certainly, they encourage you to develop
      skills that will serve you well in the long run, such as
      communication and working with a code base.
* To keep things managable, we've chosen a fairly narrow focus.  We will
  be working with the open-source crowdmapping application called
  Ushahidi.
    * We will use an Ushahidi installation as our source of data for
      our algorithms and data structures.
    * Toward the end of the semester, you will build an Ushahidi
      installation for a community member.
* Stay tuned for ruther details.

ADTs and Data Structures
------------------------

* A key theme of this course is the design of abstract data types (ADTs)
  and data structures.
* Both relate to the organization of data.
* As the name suggests, an ADT in an abstraction - think of it as 
  specifying what operations you can perform on the data.
* In constrast, a data structure specifies how the data are actually
  arranged in memory.
* There's not a hard line between the two.  We'll often do some abstraction
  in the design of data structures and may consider some implementation
  issues as we design ADTs.

=== Steps in Design

* Decide upon the overall _philosophy_ of the ADT.
  That is, what is its primary purpose?  
> For example, we might say that a vactor is a collection of values 
> indexed by sequential integers.
* Identify some _applications_ of the ADT.  Waht problems will the
  ADT help us solve?
> Vectors might be useful if we assign identification numbers to people
> and want to look them up by identification number.
* Identify the _primary procedures_ (procedures, methods, subroutines,
  whatever you want to call them).
    * Create a new vector 
        * perhaps of fixed size
        * perhaps with a default value
    * Set the value at a particular index
    * Get the value at a particular index
    * Delete a vector you've created
* Figure out a way to _lay out the ADT_ in memory  
    * We might use a sequential chunk of memory with pointers to the
      individual elements
    * We might use a sequence of structures that contain a value and
      a link to the next structure.  (We often call such structures
      pairs, nodes, or cons cells.)
* Decide how to _implement_ the ADT using this layout
    * You can write the algorithms for each function in pseuodocode or
      real code
* Evaluate the _efficiency_ of the implementation
    * How much time will each of the functions take?
    * How much space does the implementation use?  (Sometimes we ask
      about the overhead of bookkeeping data to data stored.)
    * You may consider each in terms of a typical use case
* Evaluate _other aspects_ of the implementation

An Exercise: Lists
------------------

* You've now encountered lists in at least two classes, as well as in
  real life.  So let's apply these principles to the design and
  implementation of lists.
* We will not finish this exercise today.  But it's going to be a
  starting point.
