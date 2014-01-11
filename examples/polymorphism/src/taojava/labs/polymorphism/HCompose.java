package taojava.labs.polymorphism;

/**
 * The horizontal composition of two text blocks.
 *
 * @author Samuel A. Rebelsky
 * @version 1.0 of September 2005
 */
public class HCompose
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
   * The left portion of the composition.
   */
  TextBlock left;

  /**
   * The right portion of the composition.
   */
  TextBlock right;

  // +--------------+------------------------------------------------------
  // | Constructors |
  // +--------------+

  /**
   * Build a new block by composing _left and _right side by side.
   */
  public HCompose(TextBlock _left, TextBlock _right)
  {
    this.left = _left;
    this.right = _right;
  } // HCompose(String)

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
    int lh = this.left.height();
    int rh = this.right.height();
    int h = Math.max(lh,rh);

    if ((i < 0) || (i >= h)) {
      throw new Exception("Invalid row " + i);
    }
    String result;
    if (i < lh) {
      result = this.left.row(i);
    }
    else {
      result = spaces(this.left.width());
    }
    if (i < rh) {
      result = result.concat(this.right.row(i));
    }
    else {
      result = result.concat(spaces(this.right.width()));
    }
    return result;
  } // row(int)

  /**
   * Determine how many rows are in the block.
   */
  public int height()
  {
    // The height is the greater of the heights of the left and right
    // blocks.
    return Math.max(this.left.height(), this.right.height());
  } // height()

  /**
   * Determine how many columns are in the block.
   */
  public int width()
  {
    // The number of columns is the width of the left plus the
    // width of the right.
    return this.left.width() + this.right.width();
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

} // class HCompose
