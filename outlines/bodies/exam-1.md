General Issues
--------------

* Generally less good than I would have hoped.
* Formatting is important.
* The form of your tarballs is important.

Problem 1: Testing
------------------

Here are some of the things I expected:

* Systematic tests: Using loops to build a variety of related arrays
  whose average you should know.
* Broad categories:
    * Positive numbers.
    * Negative numbers.
    * Positive and negative numbers.
        * With a positive average.
        * With a negative average.
* Edge cases: Rounding
    * Rounding up for negative sums.
    * Rounding down for positive sums.
    * Not just rounding of half cases.
* Edge cases: Extreme values
    * Multiple copies of `Long.MAX_VALUE` 
    * Multiple copies of `Long.MIN_VALUE`
    * Average of those values.
    * Near those values.

Additional issues:

* If you're writing repetitious code, why aren't you writing helpers?
* Separate sets of tests probably belong in separate procedures.  It
  makes it easier to see multiple issues.

Problem 2: Average
------------------

* **No `double`s!**
* If you have a running average and a running remainder, can the remainder
  overflow?

Problem 3: Stringify
--------------------

* It might have been helpful to write a helper that does the conversion
  in memory, before writing to the file.

* What do you see as the difference between

         String line = infile.readLine();
         while (line != null)
           {
             ...
             line = infile.readLine();
           } // while

  and

         String line;
         while ((line = infile.readLine()) != null)
           {
             ...
           } // while

* What do you see as the difference between

         ch = line.charAt(i);
         if (ch == '\t')
           ...
         else if (ch == '\n')
           ...
         else if (ch == '\\')
           ...
         else if (ch == '\"')
           ...
         else
           ...

  and

         switch (ch = line.charAt(i)
           {
             case '\t':
               ...;
               break;
             case '\n':
               ...;
               break;
             case '\\':
               ...;
               break;
             case '\"';
               ...;
               break;
             default:
               ...;
               break;
           } // switch

Problem 4
---------

* Some of you used `String.replace`.  I thought the problem was pretty
  clear that that approach was not permitted.
* Some of you used (approximately)

        int i = 0;
        while (i < contents.size-pattern.length())
          {
            if (this.matchesAt(i, pattern))
              {
                this.remove(i, i + pattern.length());
                this.prepend(i, replacement);
                i += pattern.length();
              } // if match at position i
            else // if no match at position if
              {
                i++;
              } // if no match at position i
          } // while

* This solution is potentially quadratic in the size of the input
  (e.g., `"aaaaaa".replace("a","b")`)

Makeup
------

Although I said that I was not going to allow a makeup exam, there were
enough problems on problems 2 and 4 that I will allow you to make those
problems up for partial credit.
