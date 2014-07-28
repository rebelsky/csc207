#include <stdio.h>

/**
 * Print out quart to liter conversion.
 * Taken from quarts.c lab done in CSC161 
 */
int 
main ()
{
  int gallons = 0;
  int quarts = 0;
  int pints = 1;
  
  int totalQuarts = (gallons * 4) + quarts + (pints / 2.0);
  double liters= totalQuarts/1.056710;
  printf ("Total Liters is %lf.\n", liters);
 
  return 0;
} // main(String[])
