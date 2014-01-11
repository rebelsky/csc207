package taojava.labs.polymorphism;

import java.io.PrintWriter;
import java.io.InputStreamReader;
import java.io.BufferedReader;

/**
 * A series of experiments for the layout classes.
 *
 * @author Samuel A. Rebelsky
 * @version 1.0 of September 2005
 */
public class Experiments
{
  // +-------------+-------------------------------------------------------
  // | Experiments |
  // +-------------+

  public static void expt1(PrintWriter pen, BufferedReader eyes) {
      pen.println("Experiment 1: A single line.");
      TBUtils.print(pen, new TextLine("Hello"));
      pen.println("");
  } // expt1(PrintWriter, BufferedReader)

  public static void expt2(PrintWriter pen, BufferedReader eyes) {
      pen.println("Experiment 2: A boxed line.");
      TBUtils.print(pen, new BoxedBlock(new TextLine("Hello")));
      pen.println("");
  } // expt2(PrintWriter, BufferedReader)


  public static void expt3(PrintWriter pen, BufferedReader eyes) {
      pen.println("Experment 3: Vertical composition");
      TBUtils.print(pen, new VCompose(new BoxedBlock(new TextLine("Hello")),
	      new TextLine("Goodbye"));
	      )
  } // expt3(PrintWriter, BufferedReader)

  // +------+--------------------------------------------------------------
  // | Main |
  // +------+

  public static void main(String[] args) throws Exception {
    // Prepare for input and output
    PrintWriter pen = new PrintWriter(System.out, true);
    BufferedReader eyes = new BufferedReader(new InputStreamReader(System.in));

    // Conduct the experiments
    expt1(pen, eyes);
    expt2(pen, eyes);

  } // main(String[])

} // class Tester
