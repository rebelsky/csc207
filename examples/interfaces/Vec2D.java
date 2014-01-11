package taojava.labs.interfaces;

/**
 * A simple representation of vectors in two space.
 *
 * @author CSC152 2005F
 * @author Samuel A. Rebelsky
 * @version 1.0
 */
public class Vec2D
{
  // +--------------+--------------------------------------------
  // | Class Fields |
  // +--------------+

  // +--------+--------------------------------------------------
  // | Fields |
  // +--------+

  /** 
   * The xcoordinate of the terminating point of the vector.
   * Can be any double.
   */
  double xcoord;

  /** 
   * The ycoordinate of the terminating point of the vector.
   * Can be any double.
   */
  double ycoord;

  // +--------------+--------------------------------------------
  // | Constructors |
  // +--------------+

  /**
   * Create a vector from the origin to the point
   * (originalx,originaly).
   */
  public Vec2D(double originalx, double originaly)
  {
    this.xcoord = originalx; 
    this.ycoord = originaly;
  } // Vec2D(double,double)

  // +---------+-------------------------------------------------
  // | Methods |
  // +---------+

  /**
   * Determine the length of this vector.
   */
  public double length()
  {
    return Math.sqrt(this.xcoord*this.xcoord + this.ycoord*this.ycoord);
  } // length()

  /**
   * Convert the vector to a string for ease of printing.
   */
  public String toString()
  {
    return "("
      + Double.toString(this.xcoord)
      + ","
      + Double.toString(this.ycoord)
      + ")";
  } // toString()

  /**
   * Add another vector to this vector.
   */
  public Vec2D add(Vec2D operand)
  {
    // The result has an xcoord of the sum of the two xcoords
    // and a ycoord of the sum of the two ycoords.
    return new Vec2D(this.xcoord+operand.xcoord, 
		     this.ycoord+operand.ycoord);
  } // add(Vec2D)


  // +---------------+-------------------------------------------
  // | Class Methods |
  // +---------------+

  /**
   * Add two vectors.
   */
  public static Vec2D sum(Vec2D left, Vec2D right)
  {
    double newx = left.xcoord + right.xcoord;
    double newy = left.ycoord + right.ycoord;
    return new Vec2D(newx, newy);
  } // sum(Vec2D, Vec2D)

  /**
   * Create a new vector using radius and theta.
   */
  public static Vec2D polar(double radius, double theta)
  {
    // We can determine x and y using cosine and sine
    double x = radius * Math.cos(theta);
    double y = radius * Math.sin(theta);
    return new Vec2D(x,y);
  } // polar(double,double)
} // class Vec2D
