Makeup for Examination 1
========================

There were enough issues on problems 2 and 4 that I will offer a makeup
on problems 2 and 4.  

Policies and other notes.

* You must return exam 1 to me along with the makeup problems.
* You must submit the electronic solution by 10:30 p.m. on Sunday,
  2 March 2014.  You must submit the printed versions in class on Monday,
  3 March 2014.
* I would prefer that you email me a tarball (see below).  However, 
  I will also accept an email that just contains the .java files.
* In the printed version of problem 4, only submit the code for
  `replace` and any methods that `replace` calls.  I don't need printouts
    of my own code.
* You must follow the same academic honesty policies.  
* You must submit another academic honesty statement.
* You will not get credit if you format the code incorrectly or fail
  to comment your end braces.
* You will not get partial credit on the makeup problems.  They are either
  correct or incorrect.  Correct makeup problems earn you 3/4 the value
  of the original problem.
* You may do the makeup for problem 2, the makeup for problem 4, or both.
* You may consult with me if you have any questions.

Additional issues

* I am unlikley to grade your makeup work until spring break.
* I reserve the right to change any and all policies regarding this makeup.

Replacement for Problem 2
-------------------------

*Many of the solutions failed on some fairly simple inputs and on values
near the minimum or maximum long.  Many of those solutions, failed, in
part, because people chose to use `double` rather than `long`, and
`double` values approximate.  So, it's time to try again.*

Write a Java program, <code>Average</code>, that reads long
values from standard input and computes and prints the average
of those values.

* Each number will appear in human-readable format (so you can read it
  as a string), with one number per line.
* The first line will contain the number of numbers you need to input.
* There will be no more than `Long.MAX_VALUE` input lines (not including
  the first line).  There may, however, be close to that many lines.

For example,

    $ cat data01
    3
    1
    2
    3
    $ cat data01 | java Average
    2
    $ cat data02 
    2
    -2
    1
    $ cat data02 | java Average
    0
    $ cat data00
    2147483647
    9223372036854775805
    9223372036854775805
    ...
    9223372036854775805
    $ cat data00 | java Average
    9223372036854775805

Your program should meet the following additional criteria:

* As the instructions above suggest, the program should not be in any 
  package (other than the default package).
* Your program can deal with incorrect input in any way you like 
  (including crashing).
* You may not use any numeric data type other than `int` and `long`.
  In particular, you may not use `double` or `float` or `Double` or 
  `BigDecimal` or `BigInteger`.

*Note that you should not create the file `data00`.  We have enough
trouble with the filesystem as it is.  You can simulate its behavior
with an appropriate Java program.*

Replacement for Problem 4
-------------------------

*The typical solutions to this problem involved either repeated calls to
remove` and `prepend` or `String.replace`.  The first solution is
likely to be quadratic in the size of the string.  The second violates
the intention of the problem.*

Implement `MutableString.replace` (as specified in the exam) so that it
meets the following criteria:

* The running time is linear in the larger of (1) the size of the original
  string and (2) the size of the result string.  (It's likely that you will
  need to process each character in the input string a constant number of
  times and you will need to move each character in the output string into
  the correct place.)
* You may not allocate more than two new arrays, either directly or
  indirectly.
* You must compute directly with the array of characters.  That is,
  you may not use `StringBuffer` or `String` or `StringBuilder` or
  `Vector` or `ArrayList` or anything similar.  In addition, you may
  not create another `MutableString`.

FAQ
---

_In problem 2 of exam 1 (write an average function), you wrote that my function fails on [-1, 2]. What does that mean?_

> It means that your average function gives the wrong result on the array [-1, 2] (alternately, { -1, 2 }).  That is, if I write something like


    pen.println(MathUtils.average(new long[] { -1, 2 }));

> I'll see something other than 0.

> I also saw a lot of problems on the array [-2, 1].

_What if you write "fails on seven copies of `MAX_LONG`"?_

> I made an array of seven copies of `Long.MAX_VALUE` and got an average
other than `Long.MAX_VALUE`.

_If we turn in our test revision and receive a grade lower than our original grade, will you only count the original grade and ignore the revision grade?_

> Yes.  If your test revision is incorrect, I will use your original grade.

_Can we choose to do only 1 problem for the revision?_

> Yes

_In problem 2 of the makeup, you write that we're supposed to take the
values from standard input.  But what do the sample lines you showed us
mean?_

> The instructions to `cat data01` (or whatever) show you the contents
of a file.  In Linux systems, you can take the output of one command and
use it as the input to another command.  Hence, `cat data01 | java Average`
means, in essence, "run the Average program, taking its input from `data01`".

_I was wondering how pipe works. I know that pipe takes the output of
the first command and passes it the second.  So when I do cat data01,
it passes the file to Average? Or it passes a string_

> It passes the lines of the file.  So when you read the values, the first
line will be "3", the second line will be "1", the third line will be
"2", and the last line will be "3".  Here's a sample program to help
you explore those issues.

    import java.io.PrintWriter;
    import java.io.InputStreamReader;
    import java.io.BufferedReader;
    
    /**
     * Print the lines read from standard input, prefixed by the line number.
     */
    public class PrintLines
    {
      public static void main(String[] args)
        throws Exception
      {
        // Prepare for input and output.
        PrintWriter pen = new PrintWriter(System.out, true);
        BufferedReader eyes = new BufferedReader(new InputStreamReader(System.in));
    
        // Read and print all of the lines
        String line;        // The actual line
        int i = 1;          // Line number
        while ((line = eyes.readLine()) != null)
          {
            pen.println(i + ": " + line);
            i += 1;
          } // while
      } // main(String[])
    } // class PrintLines

> Now, when we cat `data01` and pipe it through this file, we should see

    1: 3
    2: 1
    3: 2
    4: 3

_In problem 2 of the makeup, do you really intend to run experiments
where you give us about `Integer.MAX_VALUE` copies of a value near
`Long.MAX_VALUE` to see if something overflows?_

> If I believe I can run that experiment in a reasonable amount of time, 
I will run the experiment.  It's certainly easy to write.  

    import java.io.PrintWriter;
    /**
     * Print out lots and lots of ocpies of a value.
     */
    public class ManyValues
    {
      /**
       * The number of values I'm printing out.
       */
      static final long NUM_VALUES = Integer.MAX_VALUE;

      /**
       * The value that I'm printing out.
       */
      static final long VALUE = Long.MAX_VALUE - 3;

      /**
       * Do the real work.
       */
      public static void main(String[] args)
      {
        PrintWriter pen = new PrintWriter(System.out, true);
        pen.println(NUM_VALUES);
        for (long i = 0; i < NUM_VALUES; i++)
          pen.println(VALUE);
      } // main (String[]) 
    } // class ManyValues

> In any case, I will think about whether or not I expect your program to
succeed when given such input.

_What should the directory structure of the tarball look like?_

    username
      README.md                                         (optional)
      username/average
        username/average/src/
          username/average/src/Average.java
          username/average/src/AveExpt.java             (optional)
      username/replace
        username/replace/src/
          username/replace/src/MutableString.java
          username/replace/src/ReplaceExpt.java         (optional)
          username/replace/src/ReplaceTest.java         (optional)
