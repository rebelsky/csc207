/**
 * Experiments with our CSV class.
 */

import java.io.PrintWriter;

public class CSVExpt
{
  /**
   * Conduct one experiment.
   */
  public static void expt(PrintWriter pen, String str)
  {
    pen.println("Parsing [" + str + "]");
    try
      {
        String[] pieces = CSV.parse(str);
        for (int i = 0; i < pieces.length; i++)
          pen.println("Piece " + i + ": ["+ pieces[i] + "]");
        pen.println();
      } // try
    catch (Exception e)
      {
        pen.println("Failed to parse because " + e.toString());
      } // catch (Exception)
   } // expt(PrintWriter, String)

   /**
    * Conduct a few experiments.
    */
   public static void main(String[] args)
       throws Exception
   {
     PrintWriter pen = new PrintWriter(System.out, true);
     
     // All of these should succeed.
     expt(pen, "a,b,c");
     expt(pen, "a,\"b,c\",c");
     expt(pen, "a,\"b,c\"\"d\",c");
     expt(pen, "a,\"b,c\"\"d\",c");
     expt(pen, "a,\"b,c\"\"d\",\"c\"");

     // All of these should fail
     expt(pen, "a,\"b"); // Won't fail.  Whoops.
     expt(pen, "a,b\"c\",d"); 
     pen.close();
   } // main(String[])



} // class CSVExpt
