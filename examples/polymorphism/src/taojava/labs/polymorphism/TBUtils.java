package taojava.labs.polymorphism;

import java.io.PrintWriter;

/**
 * Utilities for textblocks.
 *
 * @author Samuel A. Rebelsky
 * @version 1.0 of September 2005
 */
public class TBUtils
{
  // +----------------+----------------------------------------------------
  // | Static Methods |
  // +----------------+

  /**
   * Print a textblock to the specified destination.
   */
  public static void print(PrintWriter pen, TextBlock block)
  {
    for (int i = 0; i < block.height(); i++) {
      try {
        pen.println(block.row(i));
      } 
      catch (Exception e) {
        pen.println();
      }
    } // for
  }  // print(PrintWriter, TextBlock)

} // class TBUtils
