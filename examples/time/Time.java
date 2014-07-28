/**
 * A quick example of class design.
 */
public class Time
{
  // +-------+-------------------------------------------------------------
  // | Notes |
  // +-------+

  /*
    These times are immutable.
   */

  // +--------------+------------------------------------------------------
  // | Constructors |
  // +--------------+

  /**
   * Create a new time, specifying all of the fields.
   */
  public Time (TimeZone tz, 
               int year, int month, int day, 
               int hour, int minute, int second)
  {
    // STUB
  } // Time (TimeZone, ..... )

  /**
   * Create a new time, using a standard string description of the
   * time.
   */
  public Time (String str)
  {
    // STUB
  } // Time (String)


  // +-------------------------+-------------------------------------------
  // | Additional Constructors |
  // +-------------------------+

  /**
   * Create a time representing the current time (aka "now!")
   */
  public static Time 
  now()
  {
    return null;
  } // now()

  // +-----------+---------------------------------------------------------
  // | Observers |
  // +-----------+

  /**
   * Get the hour of the day (24-hour model) for this time in its
   * primary timezone.
   */
  public int 
  getHour ()
  {
    return 0; // STUB
  } // getHour ()

  /**
   * Get the hour of the day (24-hour model) for this time in 
   * the specified timezone.
   */
  public int
  getHour (TimeZone tz)
  {
    return 0; // STUB
  } // getHour (TimeZone)

  /**
   * Get the number of seconds until another time.  Returns a
   * positive number if the other time is in the future and a
   * negative number if the other time is in the past.
   */
  public int
  secondsUntil (Time other)
  {
    return 0; // STUB
  } // secondsUntil (Time)

  // +----------+----------------------------------------------------------
  // | Mutators |
  // +----------+

} // class Time
