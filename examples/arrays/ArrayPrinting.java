/**
 * A short illustration of printing arrays.
 */

import java.io.PrintWriter;
import java.util.Arrays;

public class ArrayPrinting
{
  // +------+--------------------------------------------------------------
  // | Main |
  // +------+

  public static void 
  main (String[] args)
      throws Exception
  {
    PrintWriter pen = new PrintWriter (System.out, true);
    int[] littlevals = new int[] { 1, 2, 3 };
    Integer[] bigvals = new Integer[] { new Integer (4),
                                        new Integer (5),
                                        new Integer (6) };
    String[] names = { "Sam", "Will", "Jon", "Dan" };

    // Print out our arrays.
    pen.println ("bigvals: " + Arrays.toString(bigvals));
    pen.println ("littlevals: " + Arrays.toString(littlevals));
    pen.println ("names: " + Arrays.toString(names));
    pen.println ("bigvals: " + bigvals.toString());

    pen.close ();
  } // main (String[])
} // class BoxingExpt
