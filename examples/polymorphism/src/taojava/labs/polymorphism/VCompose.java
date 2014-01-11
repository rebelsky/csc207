package taojava.labs.polymorphism;

/**
 * The vertical composition of two text blocks.
 *
 * @author Samuel A. Rebelsky
 * @version 1.0 of September 2005
 */
public class VCompose
  implements TextBlock
{
  // +--------------+------------------------------------------------------
  // | Class Fields |
  // +--------------+

  /**
   * A really big sequence of spaces.  This sequence may grow as
   * the program operates.
   */
  String lotsOfSpaces = "  ";


  // +--------+------------------------------------------------------------
  // | Fields |
  // +--------+

  /**
   * The top portion of the composition.
   */
  TextBlock top;

  /**
   * The bottom portion of the composition.
   */
  TextBlock bottom;

  // +--------------+------------------------------------------------------
  // | Constructors |
  // +--------------+

  /**
   * Build a new block by composing _top and _bottom side by side.
   */
  public VCompose(TextBlock _top, TextBlock _bottom)
  {
    this.top = _top;
    this.bottom = _bottom;
  } // VCompose(String)

  // +---------+-----------------------------------------------------------
  // | Methods |
  // +---------+

  /**
   * Get one row from the block.
   *
   * @pre
   *   0 <= i < this.height()
   * @exception Exception
   *   if the precondition is not met
   */
  public String row(int i)
    throws Exception
  {
    // Gather some basic information
    int th = this.top.height();
    int bh = this.bottom.height();
    int tw = this.top.width();
    int bw = this.bottom.width();
    int h = th + bh;

    // Determine padding
    String padtop = "";
    String padbot = "";
    if (tw > bw) {
      padbot = spaces(tw-bw);
    }
    else {
      padtop = spaces(bw-tw);
    }

    if ((i < 0) || (i >= h)) {
      throw new Exception("Invalid row " + i);
    }
    if (i < th) {
      return this.top.row(i) + padtop;
    }
    else {
      return this.bottom.row(i-th) + padbot;
    }
  } // row(int)

  /**
   * Determine how many rows are in the block.
   */
  public int height()
  {
    // The height is the sum of the heights of the top and bottom
    // blocks.
    return this.top.height() + this.bottom.height();
  } // height()

  /**
   * Determine how many columns are in the block.
   */
  public int width()
  {
    // The width is the greater of the widths of the top and bottom
    // blocks.
    return Math.max(this.top.width(), this.bottom.width());
  } // width()
 
  // +---------------+-----------------------------------------------------
  // | Class Methods |
  // +---------------+

  /**
   * Build a sequence of spaces of a specified length.
   */
  String spaces(int len)
  {
    // Make sure the collection of dashes is big enough
    while (lotsOfSpaces.length() < len) {
      lotsOfSpaces = lotsOfSpaces.concat(lotsOfSpaces);
    }
    // Extract an appropriate length substring
    return lotsOfSpaces.substring(0,len);
  } // spaces(int)

} // class VCompose
