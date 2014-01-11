import java.util.ListIterator;

public class Experiment {

    /**
     * A hacky experiment for checking whether iterators work.
     * @param it
     */
    public static void iterate(ListOfStrings lst, StringListIterator it)
    		throws Exception {
	System.out.println(lst.get(it));
	while (lst.hasNext(it)) {
	    lst.advance(it);
	    System.out.println(lst.get(it));
	} // while
    } // iterate

    /**
     * @param args
     */
    public static void main(String[] args) throws Exception {
	ListOfStrings stuff = new LOSA();
	stuff.append("duck");
	stuff.append("walks");
	stuff.prepend("the");
	stuff.append("across");

        System.out.println("*** Printing the list");
	System.out.println(stuff.toString());

        System.out.println("*** Printing the list with iterate");
	StringListIterator it = stuff.front();
	iterate(stuff,it);

	// Test our new insert
        System.out.println("*** Inserting after the first element");
	it = stuff.front();
	stuff.advance(it);
	stuff.insert("yellow", it);

        System.out.println("*** Printing updated list");
	System.out.println(stuff.toString());

        System.out.println("*** Iterating remainder of list");
	iterate(stuff,it);

        // Test traditional iteration
        System.out.println("*** Iterating with a ListIterator");
        ListIterator<String> lis = stuff.iterator();
        while (lis.hasNext()) {
            System.out.println(lis.next());
        } // while

        // Alternate iteration
        System.out.println("*** Iterating with a for: loop");
        for (String str : stuff) {
            System.out.println(str);
        } // for

	// What happens when we advance it too far?
        System.out.println("*** Advancing too far");
	stuff.advance(it);
	stuff.advance(it);
	stuff.insert("whatever", it);
	System.out.println(stuff.toString());
	System.out.println(stuff.get(it));
    } // main

}
