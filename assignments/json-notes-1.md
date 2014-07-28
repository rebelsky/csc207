Selected Notes on Phase 1 of the JSON Project
=============================================

*In reviewing phase 1 of the projects, I noted a variety of problems
both large and small.  I've tried to provide most of the advice here,
in both "general notes" form and in comments on student code.*

Formatting Rant
---------------

Some of you turned in atrociously formatted code, and it's not a new thing.
I saw some code that used three different styles at different places.  I
saw some code in which subsequent sections of code had different indentations.
I saw two similar actions formatted very differently.  I saw portions of 
the code with not indentation whatsoever.

I'm not sure what more I can do to be more clear that I consider formatting
essential - I've commented on it after both examinations, your graders mark
it on the homework, I've even taken off for bad formatting.  So, I'm going
a step further.

There are two kinds of formatting that can/should happen in your code.
Some should be done by the formatter, using the current course style.
Some needs to be done "by hand", as it were.  The first should be easy;
the second requires more effort.

Many of the errors I noted above have to do with students not even
bothering to use the built-in Eclipse formatter.  And that's sheer
laziness.  Hence, *I am likely to immediately give a zero to any code I
receive from you that does not show evidence that you reformatted the
code using the current class style when you submitted it.*  That is,
I will use Eclipse to run the current class style on your code.  If the
formatting changes, that's evidence that you did not apply the formatter,
and you get a zero.

I am likely to be more lenient for the formatting issues that require
additional effort on your part - including good comments; commenting
right braces; choosing appropriate variable names, making sure that the
documentation matches the code; following the conventions for naming
classes, variables, and such; and so on and so forth.

Using Other Code
----------------

You should feel free to reference my sample code as you move forward.

You may continue to reference code you find on the Web.

You may look at each other's code.  In fact, you should probably look at
each other's tests.

However, **make sure to cite any code you refer to, even if you don't
copy it directly**.

A Few General Issues
--------------------

1. You should come up with a good name for your project.

2. You should also come up with an appropriate name for your package.  edu.grinnell.teamname.json would be one possibility.

3. You will need to add a README and a LICENSE and such.

4. Make sure to use Javadoc for classes, interfaces, fields, methods, and such.

5. Please put @author tags in your introductory Javadoc (top of interfaces and classes).

6. For development and testing (and perhaps even for utility), you might
find it useful to separate your `parse` method into a separate method for
each type.

7. Some of you did no error checking whatsoever.  Even if you don't do
complete error checking, or issue useful error messages, it can be useful
to do some error checking.  Why?  Because it can help you debug your code.

8. Most of you need more internal comments.

9. If you use wrapper classes, make them *useful* wrapper classes.  That is,
people need to be able to access the underlying data without just grabbing
the field.  In particular, a `JSONArray` should let you get and set values by
index and a `JSONObject` should let you get (and maybe set) the fields of
the object.

Strategies for Keeping Track of the Input
-----------------------------------------

Most of you had trouble with a key concept: When you parse a value, you
need to return not just the value you parsed but also somehow indicate
what characters you consumed to parse that value.  Many of the solutions
I saw were ad-hoc and therefore incorrect.  Here are some reasonable
strategies (although I think the last is a bit inelegant, and difficult
to implement well).

Keep both string and index in an object you pass around. (EB and AG,
with some updates and suggestions from SR.)

<pre>
/**
 * Context for a parsing routine.
 */
class ParseContext
{
  /**
   * The string we're parsing.
   */
  String input;

  /**
   * The position in the string.
   */
  int index;
} // class ParseContext
...
  /**
   * Extract and return the next JSON value from the string.
   *
   * @post The index has advanced beyond that value.
   */
  public Object parse(ParseContext json)
...
</pre>

Use a queue of characters (HC, TD, MH, and CT).

<pre>
  public static JSONArray parseArray(Queue<Character> charQueue)
</pre>

Use a `BufferedReader` (EC, EM, SM)

<pre>
  /**
   * parse JSON string to java Object
   * 
   * @param String
   * @return Object
   * @pre string is formated JSON code
   * @post the JSON string has been translated into a java object
   * @throws Exception
   */
  public Object parse(String str)
    throws Exception
  {
    BufferedReader text = new BufferedReader(new StringReader(str));
    return this.parse(text);
  }// Object parse(String str)

  /**
   * parse JSON buffer to java Object
   * 
   * @param buffer
   * @return Object
   * @pre buffer is formated JSON code
   * @post the JSON string has been translated into a java object
   * @throws Exception
   */
  public Object parse(BufferedReader buffer)
    throws Exception
</pre>

For each object, store the number of characters in the string
representation of the object.  (SZ) [I'm not sure of the utility]

<pre>
/**
 * An interface of each JSONValue
 */
public interface JSONValue
{
  ...
  /**
   * Get the number of characters used in the original representation of
   * the JSONValue
   */
  public int size();
  ...
} // interface JSonObject
</pre>

Have a helper method return both the object and the number of characters
consumed. (No one, yet.)

<pre>
/**
 * Data returned from parse.
 */
class ParseData
{
  /**
   * The value we return.
   */
  Object value;

  /**
   * The number of characters consumed.
   */
  int sourceLen;
} // ParseData
</pre>

Make the string and the index into the array global.  (It doesn't make
sense to have only the index global.) [I don't think anyone tried this.
I don't particularly like it, but it could work if you create a new Parser
object each time you want to parse.]

<pre>
  /**
   * The input string.
   */
  String str;

  /**
   * The current position in the input string.  Assumes that we are
   * only parsing one string at a time.
   */
  int i;

  ...

  /**
   * Parse starting at the current position.
   */
  public Object parse()
</pre>

Identify the beginning and end of each component. (GN)

* You cannot just look for the first ending symbol (e.g., if you've seen
  an open brace, you can't just stop at the first close brace).
* This approach requires that you actually run through the string, keeping
  track of the nesting (e.g., by pushing and popping symbols).
* This strategy is likely to lead to a non-linear parse method.
  
More Student Code
-----------------

### Example 1

<pre>
  /**
   * Given a JSON string return a JSONArray object.
   *
   * @param str
   * @return JSONArray
   * @throws Exception
   *           when str is not correct JSON syntax
   */
  public static JSONArray parseArray(Queue<Character> charQueue)
    throws Exception
</pre>

* Make sure your documentation matches your code.

### Example 2

A portion of object parsing code.

<pre>
            JSONString key = parse(str);
            i += key.size();
            if (str.charAt(i) != ':')
              throw new JSONException("Invalid input: Expect ':', given"
                                      + str.charAt(i));
            else
              {
                i++; // ':'
                JSONValue val = parse(str.substring(i));
                // get a JSONValue as a val
                obj.add(key, val); // add a pair
                i += val.size(); // increment i by the size of val
                if (str.charAt(i) == ',') // JSONObject has more pairs
                  i++;
</pre>

* Maybe slightly better names.  [Sam likes them, but what does he know?]
* Commenting issues
    * The // ':' doesn't make a lot of sense.  How about "Skip over
      the colon."
    * Sam prefers the style of 
        // Comment
        Code
        // Comment
        Code
    * i += key.size(); needs a comment "skip over the key"
    * i += val.size(); // increment i by the size of val - Yes, I can tell

### Example 3

<pre>
  // +--------+----------------------------------------
  // | Fields |
  // +--------+

  public ArrayList<JSONValue> elements;
</pre>

* In general, fields should not be public unless you have a really good
  reason.
* Where's the Javadoc?

### Example 4

<pre>
                case 'n':
                  if (str.substring(0, 4).compareTo("null") != 0)
                    throw new Exception(
                                            "Invalid input: JSONConstant expects null, true, or false.");
                  else
                    return new JSONConstant("null");
                case 'f':
                  if (str.substring(0, 5).compareTo("false") != 0)
                    throw new Exception(
                                            "Invalid input: JSONConstant expects null, true, or false.");
                  else
                    return new JSONConstant("false");
                case 't':
                  if (str.substring(0, 4).compareTo("true") != 0)
                    throw new Exception(
                                            "Invalid input: JSONConstant expects null, true, or false.");
                  else
                    return new JSONConstant("true");
                default:
                  throw new Exception(
                                          "Invalid input: JSONConstant expects null, true, or false.");
</pre>

* Awful formatting: Wraps.  Hard to read. Random extra spaces.
* Code is repetitious.

### Example 5

      static public ArrayList<Object> parseArray(String str)
        throws ParsingException
      {
        try
          {
            if (str.charAt(0) == '[' && str.charAt(str.length() - 1) == ']')
              {
                Stack<Character> s = new Stack<>();
                ArrayList<Object> result = new ArrayList<>();
                int commaPlace = 0;
                for (int i = 1; i &lt; str.length() - 1; i++)
                  {
                    if (str.charAt(i) == ',' && s.isEmpty())
                      {
                        result.add(parse(str.substring(commaPlace + 1, i)));
                        commaPlace = i;
                      } // if
                    else if (str.charAt(i) == '\"' && str.charAt(i - 1) == '\\')
                      {
                        continue;
                      } // else if
                    trackBrackets(str.charAt(i), s);
                  } // for
                if (commaPlace != 0)
                  result.add(parse(str.substring(commaPlace + 1, str.length() - 1)));
                return result;
              } // if
            throw new ParsingException(str);
          } // try
        catch (Exception e)
          {
            throw new ParsingException(str);
          } // catch
      } // parseArray(String)

* Small efficiency issue: Don't call `charAt(i)` multiple times.
* try/catch/throw is a bit weird.  Why have the try/catch clause.
* I don't understand why they are doing the quotation/backslash test.
     * It could be pointless.
     * It definitely needs a comment to explain what it's doing.
     * Many programmers find `continue` difficult to follow.
* More detail on which if is being ended.
* Could make tracing code a bit easier with

        // Make sure that the array has the proper form.
        if (str.charAt(0) != '[' || str.charAt(str.length() - 1) != ']')
          throw new ParsingException(str);

* Sam likes tests parenthesized.

        if ((str.charAt(0) != '[') || (str.charAt(str.length() - 1) != ']'))

* Needs many more internal comments or some explanation of the overall
  process.
* Some very long lines.
* Logical flaw in `if (str.charAt(i) == '\"' && str.charAt(i - 1) == '\\')`
     * `\\"` - Means that it will incorrectly parse "\\"

### Example 6

     public static ArrayList<Object> parseArray(String str)
     {
       // Remove outside quotes
       str = parseString(str);

* What's the relationship between parsing arrays and parsing strings?
  How does it know where the array is?
* A possibly more clear version

     public static ArrayList<Object> parseArray(String str)
     {
       // Remove the [ and ]
       str = removeFirstAndLastCharacter(str);

### Example 7

<pre>
      } // if
  }//parseObject
    public static String parseString(String str)
        throws Exception
</pre>

* No blank line before `parseString`.  
* No Javadoc comment before `parseString`.
* Sam issue: Should be `// parseObject(String)`
* IDENTATION!

### Example 8
 
<pre>
  public Number parseNum(String str)
    throws Exception
  {
    /**
     * A boolean flag to check if the period exists in the string
     */
    boolean period = false;
    /**
     * A boolean flag to check if the negative sign exists in the string
     */
    boolean negate = false;
    /**
     * A boolean flag to check if e exists in the string
     */
    boolean e = false;
</pre>

* Don't Javadoc-style comments inside methods.
* In general, avoid /*-style comments.
* In C, you can write
        
        #ifdef DONT_IGNORE
           printf("This is stuff that I don't want to use right now.");
        #endif

* "A boolean flag" is pretty obvious.

    // Have we encountered a period yet?
    boolean period = false;

### Example 10

       case '[':
         {
           json.index++;
           ArrayList<Object> list = new ArrayList<Object>();
           while (json.value.charAt(json.index) != ']'
                  && json.index < (json.value.length() - 1))
             {
               list.add(parse(json));
               if (json.value.charAt(json.index) == ',')
                 json.index++;
             } // while
           json.index++;
           return list;
         } //case [

* No internal comments
* Why are there braces in a case statement?

### Example 11

<pre>
       case 'n':
         {
           if (json.value.substring(json.index, json.index + 4)
                         .equalsIgnoreCase("null"))
             {
               json.index = json.index + 4;
               return null;
             } // if null
           else
             return "Incorrect JSON";
         } // case n

       case 't':
         {
           if (json.value.substring(json.index, json.index + 4)
                         .equalsIgnoreCase("true"))
             {
               json.index = json.index + 4;
               return true;
             } // if true
           else
             return "Incorrect JSON";
         } // case t

       case 'f':
         {
           if (json.value.substring(json.index, json.index + 5)
                         .equalsIgnoreCase("false"))
             {
               json.index = json.index + 5;
               return false;
             } // if false
           else
             return "Incorrect JSON";
         } // case f
</pre>

* Incredibly repetitious.

### Example 12

<pre>
  public static String getSubstring(StringBuffer str, int i)
  {
    int nextQuote = str.indexOf(String.valueOf('"'), i + 1);
    return str.substring(i, nextQuote);
  }// getSubstring
</pre>

* Buggy!  Doesn't deal with \"
