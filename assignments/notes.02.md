Notes on HW2
============

*Since the graders lack both the time and the experience to provide 
detailed comments on your assignments, I have picked one assignment
to critique.*

Part A: Java as Imperative Language
-----------------------------------

    public class TwoA
    {
    
In the future, please include comments that describe the purpose of your procedures.
    
      public static boolean isMultiple (int a, int b)
      {
        if (b == 0) //0 is a multiple of all ints
          {
            return true;
          }//if
    
The lines above are incorrect.  *Nothing*, other than zero, is a multiple 
of zero.  
    
        return (a % b == 0);

Since you want to make sure that `b` is not 0, you have two tests
to combine.  They should be combined using the appropriate
Boolean operation, as in `return ((a == b) || ((b != 0) && (a % b == 0)))`.  
    
      } //isMultiple
    
I like a space after the `//`, although it is not strictly required.
    
      public static boolean isOdd (int value)
      {
       return (value & 1) == 1; //bitwise operations
    
Your indentation looks wrong.  You need one more space at the beginning of the line.
    
      } //isOdd
    
But this is a nice, clever solution.  
    
However, the comment is garbage.  We can tell that it's a bitwise operation.
How about *explaining* the operation?  For example, "Java uses twos
complement to represent integers.  For odd positive integers, we know the
last digit is 1.  For odd negative integers, the last digit is also one.
(Remember, in twos complement, we flip the bits and add 1, so 1 flips to
0, and the add 1 brings it back to 1.)"  Why explain?  Because when you
come back to this code in a year, you'll have no idea what you were doing.

      public static int oddSumTo (int value) {
        if(TwoA.isOdd (value))

Please include a space after the `if`.

Since this is in class `TwoA`, you can just write `if (isOdd (value))`, or,
in the new style `if (isOdd(value))`.

          {
           value--;

Another incorrect indent.  Is it hard to use the reindent feature?

          }//if 
        return (value/2)*(value/2);

If value is odd, `value/2` rounds down, so you don't need to subtract 1.

      } //oddSumTo

      public static boolean isOddProd (int[] values) {
        int counter = 0;
        for(int i = 0; i < values.length; i++)

Please include a space after the `for`.

          {
            if (isOdd(values[i]))
              {
                counter ++;
              }
            if (counter == 2)
              {
                return true;
              }

Since counter will only become 2 when the previous test holds, you
should put this test within the body of the  prior test.  You can then
express if more concisely as `if (counter++) return true`

Internal explanations are nice.  For example, after counter, you could
write "a count of the number of odd values".  If you inserted my complex
instruction, you'd also want something like "if we've already seen an
odd value".  I'd also put one at the end saying something like "We've seen
fewer than two odd values, so no pair of elements have an odd product."

          }
        return false;
      } //isOddProd

      public static boolean allDistinct (int[] values) 
      {
        for(int i=0; i<values.length; i++)
          {
            for(int j=0; j<values.length; j++)
              {
                if (values[i] == values[j] && i!=j)

I prefer to see you parenthesize subexpressions for clarity, as
in `if ((values[i] == values[j]) && (i != j))`

                  {
                    return false;
                  }
              }
          }

Please comment your end braces.

You could cut the number of comparisons in half by starting `j` at
`i+1` rather than at 0.

        return true;
      } //allDistinct

      public static int[] 
        reverseInts (int[] values) 
      {
        int temp; 
        int length = values.length; 
        for (int i=0; i<(length/2); i++)
          {
            temp = values[i];
            values[i] = values[length - i -1];
            values[length - i -1] = temp;

If you are swapping values often enough, it would help to write
  a `swap` procedure.  Writing such a procedure would also clarify
  this code.

          }
        return values;
      } //reverseInts

    }

Please comment your end braces.

Unit Tests for Part A
---------------------

    import static org.junit.Assert.*;

    import org.junit.Test;

    public class TestTwoA {
      @Test 
      public void
        test_isMultiple ()
      {
        for (int i = -1000; i < 1000; i += 10)
          {
            for (int j = -1000; j < 1000; j += 10)
              {
                assertEquals("isMulitiple " + (i*j) + j, true, TwoA.isMultiple(i*j, j));

You've misspelled "multiple".  (I do the same thing once in a while.)

If you're just asserting that it's true, you should use `assertTrue`.

The line is more than eighty chararacters wide.

I'm not sure there's a great benefit to using multiples of 10.  It would
  be good to see you use different increments.

In spite of those criticisms, I do like that you've been careful to
  try to make it a useful comment.

But it would be nice to see a comma or something between the `i*j` and
  the `j`.

              }
          }

Please comment your end braces.

        for (int i = -1000; i < 1000; i += 10)

You really like 10, don't you?  Try other increments once in a while.

          {
            assertEquals("is Multiple test 2", false, TwoA.isMultiple(i+1, 2));
          }
      }//isMultiple test

      @Test public void
        test_isOdd ()
      {
        for (int i = -10000; i < 10000; i += 10)
          {
            assertEquals("isOdd test " + i, false, TwoA.isOdd(i));
          }
        for (int j = -10001; j < 9999; j += 10)
          {
            assertEquals("isOdd test 2", true, TwoA.isOdd(j));
          }
      }//isOdd test

      @Test public void
        test_oddSumTo ()
      {
        int sum = 0; int numAdded = 1; for (int i = 0; i < 1000; i+=2)
          {
            assertEquals("oddSumTo test " + i, sum, TwoA.oddSumTo(i));
            assertEquals("oddSumTo test " + i, sum, TwoA.oddSumTo(i+1));

Your label for this test is incorrect.

            sum += numAdded; 
            numAdded += 2;
          }
      }//oddSumTo test

I'd prefer that the ending braces for methods have a comment that
  matches the method name.

      @Test
      public void 
        test_isOddProd ()
      {
        //three odd
        assertEquals("isOddProd test", true, TwoA.isOddProd(new int[] {3241, 45423, 7}));
        //two odd, two even
        assertEquals("isOddProd test", true, TwoA.isOddProd(new int[] {1, 2, 3, 4}));
        //three odd, five even
        assertEquals("isOddProd test", true, TwoA.isOddProd(new int[] {59837, 4902, 0, 3247, 28937432, 492, 42 ,1763}));
        //four odd
        assertEquals("isOddProd test", true, TwoA.isOddProd(new int[] {7541, 628420981, 5, 903}));
        //one odd, three even
        assertEquals("isOddProd test", false, TwoA.isOddProd(new int[] {523, 90582, 356, 84}));
        //six even
        assertEquals("isOddProd test", false, TwoA.isOddProd(new int[] {50, 902, 592, 50820598, 424, 34}));
     
All of these lines are too long to be readable.

You don't have useful test names.  Why don't you use the comments as your 
  test names?

You have no tests in which the second odd number is in the last position.  
  you should know from your experience in 161 that loops often miss the
  first or last position.

I'd like to see you be more systematic in your testing.  You do a nice
  job with the loops in the earlier tests, why not here?

You have not tested the empty array.  You should *always* make sure
  that the code works correctly on the empty array.

          }//isOddProd test

The indentation is wrong.
      
      @Test
      public void
        test_allDistinct ()
      {
        assertEquals("allDistinct test 1", true, TwoA.allDistinct(new int[] {563, -2432, 61, 742, -523}));
        assertEquals("allDistinct test 2", true, TwoA.allDistinct(new int[] {5, 50, 500, 5000}));
        assertEquals("allDistinct test 3", true, TwoA.allDistinct(new int[] {9999999, 9999998, 9223373, 9223372}));
        assertEquals("allDistinct test 4", true, TwoA.allDistinct(new int[] {0, 598, -598}));
        assertEquals("allDistinct test 5", false, TwoA.allDistinct(new int[] {0, 324, -52, 25, 6, 0}));
        assertEquals("allDistinct test 6", false, TwoA.allDistinct(new int[] {52, 52, -52, 92, 53, 1256445, 52}));
      }//allDistinct test

At least these names are distinct, if not necessarily informative.

Again `assertTrue` and `assertFalse` would make these shorter.

The lines are very long.  (The PDF generator needed to shrink the font
size to make them fit.)  Please stop at 80 characters.

You have not tested the empty array.  You should *always* make sure
  that the code works correctly on the empty array.

And, as in the previous problem, you should make sure it handles the first
  and last elements.  And you should find a way to be more systematic
  in your resting.

Since your code is somewhat repetitious, this might be a good opportunity 
  for a helper procedure
    
      @Test 
      public void
        test_reverseInts ()
      {
        //4 positive
        assertArrayEquals("reverseInts test 1", new int[] {23, 8764, 43, 2}, TwoA.reverseInts(new int[] {2, 43, 8764, 23}));

I'm not sure what the sign of the values has to do with reversing arrays.
        
        // 3 positive, 2 negative
        assertArrayEquals("reverseInts test 2", new int[]{34, -423, 877564, 63, -5432}, TwoA.reverseInts(new int[] {-5432, 63, 877564, -423, 34}));
        
        // 5 negative 
        assertArrayEquals("reverseInts test 3", new int[] {-86, -544, -65, -5426, -54387, -470, -661}, TwoA.reverseInts(new int[] {-661, -470, -54387, -5426, -65, -544, -86}));
        
        //10 numbers 
        assertArrayEquals("reverseInts test 4", new int[] {-8, 2, -2875, 854, 7654, 15, 3, 74, 39, 5542}, TwoA.reverseInts(new int[] {5542, 39, 74, 3, 15, 7654, 854, -2875, 2, -8}));
        
        //4 negative
        assertArrayEquals("reverseInts test 5", new int[] {21, 84384, -876, 28, 24444, 543, 35, 2, -5, 4, 3, -54387, -470, -661}, TwoA.reverseInts(new int[] {-661, -470, -54387, 3, 4, -5, 2, 35, 543, 24444, 28, -876, 84384, 21}));
        
        // 2 numbers 
        assertArrayEquals("reverseInts test 6", new int []{98, 89}, TwoA.reverseInts(new int[] {89, 98}));
        
      }//reverseInts test

Most of the issues from the previous test apply here.  You need to
test the empty array.  You should be more systematic in your testing.
And you need to avoid very long lines.

    }

Please comment your end braces     
    
Part B: Averaging
-----------------

    public class TwoB {
      /**
       * Compute the average of two integers.  Rounds toward zero if the 
       * average is not a whole number.  
       */
      public static int
        average (int left, int right)
      {
        if ((left % 2 == 1) && (right % 2 ==1))
          {
           return (left /2 + right /2 + 1);

This computation is incorrect.  For exmaple, -3 and 3 are both odd.  -3/2 + 3/2 + 1 = 1.  The average of -3 and 3
is not 1.

Also bad formatting.  Use "left/2" or "left / 2".

          }
        else
          return (left /2 + right/2);

Inconsistent formatting.

      } // average(int,int)

      /**
       * An alternate approach to averaging.
       */
      public int 
        average (int a, int b)
      {
        return (int) ((double) a / 2) + ((double) b / 2);
      } // average(int,int)

Yech.  `double` values approximate.  Never, ever, use them when you
want precise results.

    } // class TwoB

Part C: Designing Objects
-------------------------

    public class Rational
    {
      
      //Constructors

Thank you for labeling the section.  I'd prefer if you tried to use the
full-line separators that I use, because it makes it much easier to
find the section.

      /**
       * Create a new object of type rationals.  (Constructor)
       */
      public static Rational 

As you've now learned, you only need to write `Rational` once.

      Rational (int num, int denom)
      {
        return null; //STUB

No `return` needed in constructors.

      }//Rational
   
It would be nice to have a constructor that creates a rational from an
`int` or an `Integer` or a `BigInteger` (or all of them).

It might be nice to have a constructor that creates a rational from a
`double`, although that's more of a PITN to write.

      /**
       * Add two Rationals togther to create a new Rationals object (Constructor)
       */
      public static void 
      add (Rational a, Rational b)
      {
        return; //STUB
      }//add

Not really an object-oriented model.  You'd probably want to say "Add
  another rational to this value to create a new rational.

And if you're creating a rational, the return type should be `Rational`,
  not `void`.
    
      /**
       * Subtract two Rationals together to create a new Rationals object (Constructor)
       */

That comment is wider than 80 characters.

Your grammar is interesting.  "Subtract two Rationals together."  Really?

      public static void 
      subtract (Rational a, Rational b)
      {
        return; //STUB
      }//subtract
      
      /**
       * Multiply two Rationals together to create a new Rationals object (Constructor)
       */
      public static void 
      multiply (Rational a, Rational b)
      {
        return; //STUB
      }//mult
      
      /**
       * Divide two Rationals to create a new Rationals object. (Constructor)
       */
      public static void 
      divide (Rational a, Rational b)
      {
        return; //STUB
      }//div
      
It would also be nice to be able to add an integer, subtract an 
integer, multiply by an integer, and divide by an integer.  (In one
or all of the forms of integers.)

      //Observers
      /**
       * Return the numerator of the rational. (Observer)
       */
      public int 
      getNum ()
      {
        return 0; //STUB
      }//getNum
      
      /**
       * Return the denominator of the rational. (Observer)
       */
      public int getDenom ()
      {
        return 0; //STUB
      }//getDenom
      
      /**
       * Return a decimal approximation of the rational. (Observer)
       */
      public double getDecApprox ()

You might call this `doubleValue` so that it matches the similar 
method in Integer and such.

      {
        return 0; //STUB
      }//getDecApprox
      
      /**
       * Compare two rationals and returns true if the Rational on
       * which this method was called is larger than the Rational a. (Observer)
       */

Good.  We normally say something like "this object" rather than the 
longer "the Rational on which this method was called."

Common practice is to create a `compareTo` method that, like
`strcmp` in C, returns a negative number for "less than",
zero for "equal to", and a positive number for "greater than".

      public boolean 
      isLargerThan (Rational a)
      {
        return false;//STUB
      }//isLargerThan
      
      /**
       * Compare the Rational a with the Rational on which the method
       * was called. Returns true if the two rationals have the same
       * simplified value and false if they do not. (Observer)
       */
      public boolean isEqualTo (Rational a)
      {
        return false; //STUB 
      }//isEqualTo

In Java, we tend to use `equals` for this method.      

It's also good to have the standard `toString` and `hashCode` methods.
      
      //Mutators
      
I'm not sure that it's a good idea to mutate Rationals at all.  Rationals
  seem like things that should have fixed values, like Integers.
      
      /**
       * Change the numerator of a Rational. (Mutator)
       */
      public void 
      changeNumerator (int newNum)
      {
        return; //STUB
      }//changeNum

`setNumerator` would be better.  

      /**
       * Change the denominator of a Rational. (Mutator)
       */
      public void 
      changeDenominator (int newDenom)
      {
        return; //STUB
      }//changeDenom
      
      /**
       * Add another Rational to the rational on which the method was called (Mutator)
       */
      public void 
      add (Rational a)
      {
        return; //STUB
      }//add (Rationals a)

Vague explanation.  Most people think of `add` as creating a new
value, not changing the underlying value.  Perhaps `addTo` or
`incrementBy`.
      
I'm eliding the remaining mutators b/c I don't think this is a case
in which we need mutators.

    }

Please comment your end braces.    
