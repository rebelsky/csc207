import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 * A simple interactive experiment.  Reads a JSON string, parses it,
 * and then prints it out in multiple ways.
 */
public class JSONInteractiveExpt
{
  public static void main(String[] args)
    throws Exception
  {
    PrintWriter pen = new PrintWriter(System.out, true);
    BufferedReader eyes = new BufferedReader(new InputStreamReader(System.in));
    pen.print("Enter JSON: ");
    pen.flush();
    Object thing = JSON.parse(eyes);
    pen.println("toString(): " + thing);
    pen.println("toJSONString(): " + JSON.toJSONString(thing));
  } // main(String[])
} // JSONInteractiveExpt
