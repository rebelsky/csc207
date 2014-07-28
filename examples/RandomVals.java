import java.io.PrintWriter;

/**
 * Print out a sequence of random values.  Intended mostly to generate
 * lists for the final.
 */
public class RandomVals
{
  public static void main(String[] args)
  {
    PrintWriter pen = new PrintWriter(System.out, true);

    for (int i = 0; i < 100; i++)
      {
        pen.format("%5.4f ", Math.random());
      } // for
  } // main(String[])
} // class RandomVals
