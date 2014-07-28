CSC207.01 2014S, Class 12: Exceptional Programming
==================================================

_Overview_

* Preliminaries.
    * Admin.
    * Questions.
* Quick recap.
* Lab.

Preliminaries
-------------

### Admin

* When physicists do math ...
* Reminder: Homework assignments get sent to the graders
  <grader-207@cs.grinnell.edu>, not to me.
* At yesterday's review session, I went over possible solutions
  to the CSV and calculator problems.
    * Lacking other questions, I will use review sessions to write
      homework solutions "live", as it were.
* I'll reserve a few minutes for questions on the homework.
* Extra credit: 
    * CS Table Today: NP Completeness
    * CS Extra next Week: Stone on Red/Black Trees
    * More?

### Upcoming Work

* Readings for Monday: References and Autoboxing/Autounboxing.
    * Not yet written.
    * Probably available Saturday.
* Today's writeup, Exercise 11
    * Subject: CSC 207 Writeup 8: Exceptions (YOUR NAME)
    * Due Monday.
* Work on Homework 4!

### Questions

A Quick Recap
-------------

* Utility procedures fail
    * Old model: Crash the program
    * C model: Return special value

        foo = malloc (100 * sizeof(mystruct));
        if (foo == null)
           ...
    * Java model: Two return mechanisms, normal and exceptional
        * Client of utility procedure MUST deal with the exception
* Your world when programming
    * You write utility code, so you must report to your caller
        `throws Exception` - can fail
        `throw new Exception(...)` - fail
    * You call other procedures, you must deal with potential exceptions
        `try { code that may fail } catch (Exception e) { ... }`
        `throws Exceptions`
* You can use different kinds of exceptions to signal kinds of errors

    public class DivergentSeriesException extends Exception
    {
      public DivergentSeriesException ()
      {
        super();
      } // 

      public DivergentSeriesException (String str)
      {
        super(str);
      } // 
    }

* Once we write that garbage, we can say `throw new DivergentSeriesException("Earnest says 'No!'");

   try 
     {
       doStringTheory();
     }
   catch (DivergentSeriesException dse)
     {
       System.out.println("Physicists don't believe series diverge.");
     }
   catch (Exception e)
     {
       System.out.println("Please switch universes.");
     } 
     
Lab
---

How do I test the quadratic root?

> Make some quadratics whose roots you know.  For example (x-3)(x+2) = x^2-x-6.
  The smaller root is -2.

What does assertEquals look like for doubles?

    public static void assertEquals(java.lang.String message,
                                    double expected,
                                    double actual,
                                    double delta)

How do I make an inputstreamreader?

    BufferedReader eyes =
        new BufferedReader(new InputStreamReader(System.in));

How do I convert a string to a double?

    double d = Double.parseDouble(str);

Recent technical interview question

* You have a list of 1000 elements, containing all but one of the values 0 ... 1000
  How do you find the missing value?




