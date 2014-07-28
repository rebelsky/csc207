/**
 * The puppetmaster for this lab.  Runs some of our sample programs.
 *
 */
public class CTVT
{
  /**
   * Print out quart to liter conversion.
   * Taken from quarts.c lab done in CSC161 
   */
  public static void 
    main (String[] args) 
  {
    int gallons = 0;
    int quarts = 0;
    int pints = 1;
    
    double totalQuarts = (gallons * 4) + quarts + (pints / 2.0);
    double liters= totalQuarts/1.056710;
    System.out.println ("Total Liters is " + (liters));
    
  } // main(String[])
} // class CTVT
