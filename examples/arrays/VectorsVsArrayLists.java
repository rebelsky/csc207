/**
 * A quick hack to explore the relationship between vectors and array
 * lists.
 */

import java.io.PrintWriter;
import java.util.Vector;
import java.util.ArrayList;

public class VectorsVsArrayLists
{
  public static void
  main (String[] args)
  {
    PrintWriter pen = new PrintWriter (System.out, true);
    Vector<Integer> v = new Vector<Integer> ();
    v.setSize (10);
    v.set (5, new Integer(5));
    v.set (2, new Integer(5));
    v.set (8, new Integer(5));

    pen.println("v: " + v);

    v.remove(new Integer(5));
    pen.println("After removal");
    pen.println("v: " + v);
   
    ArrayList<Integer> al = new ArrayList<Integer> ();
    for (int i = 0; i < 10; i++)
      {
        al.add(new Integer (i % 3));
      } // for
    pen.println ("al: " + al);
    al.remove(new Integer(2));
    pen.println ("After removing the first instance of 2");
    pen.println ("al: " + al);

    pen.close();
  } // main
} // class VVAL
