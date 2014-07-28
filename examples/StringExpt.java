/**
 * A few quick experiments with strings.
 */

import java.io.PrintWriter;

public class StringExpt
{
  public static void 
  main (String[] args)
      throws Exception
  {
    PrintWriter pen = new PrintWriter (System.out, true);
    StringBuffer buf = new StringBuffer ("Hello");
    pen.println (buf);
    String str = buf.toString();
    buf.append (".");
    pen.println ("buf: " + buf);
    pen.println ("str: " + str);
  } // main (String[]
} // class StringExpt
