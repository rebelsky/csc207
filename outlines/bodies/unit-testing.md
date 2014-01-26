A Brief Introduction to Unit Testing
------------------------------------

* How do you know your code works?  
* Typically, you run "experiments" on your code ("When I give this input, 
  I should get this output.  Do I?")
    * Many people call these "tests", but I try to distinguish the two.
* But experiments are not a great approach.
    * A human is doing the comparison; that's a job better suited to
      the computer.
    * You are unlikely to document your experiment (or at least your
      expected output), which means that you'll have to regenerate it latter.
    * You are likely to have to build a framework to do your experiments.
    * Looking at output by hand means that you generally won't conduct
      many experiments.
* What's alternative?  Tests.
    * A test typically checks whether a function has an expected output
      on a given input (just like an experiment, except that the computer
      does the comparison).
    * A test is represented by executable code.  Running it again is
      easy (and it's often self-documenting).
    * Tests generally have only one of two outputs: Success or 
      "expected A, got B".
* Since the computer does most of the work, and since the tests persist,
  you are comfortable writing bigger tests and running them more often.
* In courses, you can share tests, so your code gets challenged by
  multiple perspectives.
* It takes a long time to become good at writing tests.  We'll develop
  those skills across the semester.
* In Java, JUnit is one of the popular frameworks for doing this kind
  of testing.  And it's nicely integrated into Eclipse.
    * I'm not going to discuss JUnit because you'll learn more writing test
      code than watching me write test code.

An Example: Testing Exponentiation
----------------------------------

What tests would you write for a function that computes x^n, where
x and n are integers?

Test-Driven Development
-----------------------

* Unit testing is a key aspect of many agile software development
  methodologies.
* Often, unit testing is a key aspect of _test-driven development_ (TDD).
* There are two general approaches to TDD.
     * Repeatedly write a test and make your procedure meet that test
       until you can't think of any more tests to write.
     * Write a lot of tests up front and then write your procedure.
       Then write a few more to stress your particular implementation
       (or because you've learned something).
* I prefer the latter.  I find that if you write a lot of tests in advance,
  you have a better sense of what the procedure is supposed to do.

Lab: Unit Testing
-----------------

Do [the lab](../labs/unit-testing-lab.html).

Be prepared to reflect.
