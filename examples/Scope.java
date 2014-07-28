/**
 * A quick test of Scope in Java.
 */
public class Scope
{
  public static void 
  main (String[] args)
      throws Exception
  {
    for (int i = 0; i < 10; i++) 
      {
        double x = i*2.0;
        System.out.println (x);
      } // for
    // System.out.println (i);
    for (int i = 0; i < 10; i++) 
      {
        int x = 2 * i;
        System.out.println (x);
      } // for
  } // main (String[])
} // class Scope
