/**
 * A short illustration of boxing and unboxing in Java.
 */

import java.io.PrintWriter;
import java.util.Arrays;

public class BoxingExpt
{
  // +----------------+----------------------------------------------------
  // | Static Methods |
  // +----------------+

  /**
   * Add brackets around a string.
   */
  public static String
  bracket (String str)
  {
    return "[" + str + "]";
  } // bracket

  /**
   * Add parentheses around a stringified object.
   */
  public static String
  parenthesize (Object o)
  {
    return "(" + o.toString() + ")";
  } // parenthesize (Object)


  /**
   * Square an Integer.
   */
  public static Integer 
  square (Integer x)
  {
    int val = x.intValue (); 
    return new Integer (val * val);
  } // square (Integer)

  /**
   * Square an int.
   */
  public static int
  sqr (int x)
  {
    return x * x;
  } // sqr

  /**
   * Square an Integer, using boxing/unboxing.
   */
  public static Integer
  sq (Integer x)
  {
    return x * x;
  } // sq (Integer)

  /**
   * Sum an array of ints.
   */
  public static int
  littleSum (int[] values)
  {
    int sum = 0;
    for (int i = 0; i < values.length; i++)
      {
        sum += values[i];
      } // for
    return sum;
  } // littleSum (int[])

  /**
   * Sum an array of Integers.
   */
  public static Integer
  bigSum (Integer[] values)
  {
    int sum = 0;
    for (int i = 0; i < values.length; i++)
      {
        sum += values[i].intValue();
      } // for
    return new Integer (sum);
  } // bigSum (Integer[])

  // +------+--------------------------------------------------------------
  // | Main |
  // +------+

  public static void 
  main (String[] args)
      throws Exception
  {
    PrintWriter pen = new PrintWriter (System.out, true);
    Integer bigi = new Integer(5);
    int littlei = 3;
    String str = "Hello";
    int[] littlevals = new int[] { 1, 2, 3 };
    Integer[] bigvals = new Integer[] { new Integer (4),
                                        new Integer (5),
                                        new Integer (6) };

    // Print out our original values.
    pen.println ("bigi: " + bigi);
    pen.println ("littlei: " + littlei);
    pen.println ("str: " + str);
    pen.println ("bigvals: " + bigvals);
    pen.println ("littlevals: " + littlevals);
    pen.println ();

    // Examples, set 1: Normal calling
    pen.println ("square (bigi): " + square (bigi));
    pen.println ("sqr (littlei): " + sqr (littlei));
    pen.println ();

    // Examples, set 2: Fun with strings
    // pen.println ("bracket (str): " + bracket (str));
    // pen.println ("bracket (bigi): " + bracket (bigi));
    // pen.println ("bracket (littlei): " + bracket (littlei));
    // pen.println ();

    // Examples, set 3: Boxing/unboxing (or vice versa)
    // pen.println ("square (littlei): " + square (littlei));
    // pen.println ("sqr (bigi): " + sqr (bigi));
    // pen.println ();

    // Examples, set 4: More boxing/unboxing
    // pen.println ("sq (bigi): " + sq (bigi));
    // pen.println ("sq (littlei): " + sq (littlei));

    // Examples, set 5, More fun with strings
    // pen.println ("parenthesize (str): " + parenthesize (str));
    // pen.println ("parenthesize (bigi): " + parenthesize (bigi));
    // pen.println ("parenthesize (littlei): " + parenthesize (littlei));

    // Examples, set 6, Boxing/unboxing of arrays (?)
    // pen.println ("bigSum (bigvals): " + bigSum (bigvals));
    // pen.println ("littleSum (littlevals): " + littleSum (littlevals));
    // pen.println ("littleSum (bigvals): " + littleSum (bigvals));
    // pen.println ("bigSum (littlevals): " + bigSum (littlevals));


    pen.close ();
  } // main (String[])
} // class BoxingExpt
