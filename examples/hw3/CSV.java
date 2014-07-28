import java.util.ArrayList;

/**
 * A simple attempt to parse CSV strings, done live in class.
 */
public class CSV
{
  /**
   * Parse a CSV string into its component parts.
   */
  public static String[] parse(String str)
      throws Exception
  {
    /*
     * Strategy: Iterate the characters.  When I hit a comma,
     *   end the current string.  When I hit a quote, note that
     *   and start special processing.  Stop at the end.
     */

    // Set up something to collect the parts of the CSV.
    ArrayList<String> result = new ArrayList<String>();

    // Set up a buffer for the current part of the CSV.
    StringBuffer buf = new StringBuffer();

    // Are we currently within a quoted section?
    boolean inQuotes = false;

    int strlen = str.length();
    for (int i = 0; i < strlen; i++)
      {
        char ch = str.charAt(i);
        switch (ch)
          {
            // Commas usually signal the end of the string
            case ',':
              if (! inQuotes)
                {
                  result.add(buf.toString());
                  buf = new StringBuffer();
                } // if (! inQuotes)
              else // if (inQuotes)
                {
                  // Commas that appear within quotation marks are kept
                  buf.append(',');
                } // if (inQuotes)
              break;
            // Quotation marks can start an entry or be within
            // an entry
            case '"':
              if (! inQuotes)
                {
                  // Opening quotes should only happen at the start
                  // of an entry.
                  if (buf.length() != 0)
                    {
                      throw new Exception("Invalid quotation mark at " + i);
                    } // if invalid quotation
                  // Normal case: We're now in a quoted section
                  inQuotes = true;
                } // if (! inQuotes)
              else // if (inQuotes)
                {
                  // Quotes must be followed by a quotation mark (") or
                  // by a comma.
                  if (i == (strlen - 1)) {
                    // Do nothing, at end of string
                  }
                  else if (str.charAt(i+1) == '"')
                    {
                      buf.append('"');
                      i++;
                    } // if the next character is a quotation mark
                  else if (str.charAt(i+1) == ',')
                    {
                      // Done with the entry
                      inQuotes = false;
                    }
                  // If the next character is neither comma nor qm
                  else 
                    {
                      throw new Exception("Invalid quotation mark at " + i);
                    } // if the quote is followed by something invalid
                } // if (inQuotes)
              break;
            default:
              buf.append(ch);
              break;
          } // switch
      } // for

    // There should be one thing left to add
    if (inQuotes)
      {
        throw new Exception("Failed to end quoted entry");
      }
    result.add(buf.toString());
 
    // Convert the ArrayList to an appropriate array.  Hack!  I hate Java.
    return result.toArray(new String[] { });
  } // parse(String)
} // class CSV
