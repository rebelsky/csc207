import java.io.PrintWriter;

/**
 * A simple set of experiments to make sure that our amazing LinkedList
 * class works fine.
 */
public class Experiment {

     /**
      * Print a list of objects.
      */
     public static <T> void printList(PrintWriter pen, LinkedList<T> list) {
         for (T val : list) {
             pen.print(val);
             pen.print(" ");
         } // for
         pen.println();
         pen.flush();
     } // printList(PrintWriter, LinkedList<Object>)

     public static void main(String[] args) throws Exception {
         // Set up output
         PrintWriter pen = new PrintWriter(System.out, true);

         // Create some lists
         LinkedList<String> strings = new LinkedList<String>();
         LinkedList<Integer> numbers = new LinkedList<Integer>();

         // Prepend a few elements
         numbers.prepend(42);
         numbers.prepend(77);
         numbers.prepend(11);
         printList(pen, numbers);

         // Append a few elements
         numbers.append(1);
         numbers.append(2);
         numbers.append(3);
         printList(pen, numbers);
         
         // Delete the first element
         pen.println("Deleting first");
         Cursor c = numbers.front();
         numbers.delete(c);
         printList(pen, numbers);
         
         // Delete the third element
         pen.println("Deleting third");
         Cursor d = numbers.front();
         numbers.advance(d);
         numbers.advance(d);
         numbers.delete(d);
         printList(pen, numbers);
         
         // And we're done
         pen.close();
     } // main(String[])
} // class Experiment
