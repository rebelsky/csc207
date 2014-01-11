import java.io.PrintWriter;

import java.util.Arrays;

/**
 * Sort the integers given on the command line.
 */
public class ISort {
    public static void main(String[] args) {
        // Prepare output.
        PrintWriter pen = new PrintWriter(System.out,true);
 
        // Set up a new sorter of the appropriate type.
        Sorter<Integer> sorter = new BuiltinSorter<Integer>();

        // Convert the strings to integers.
        Integer[] vals = new Integer[args.length];
        for (int i = 0; i < args.length; i++) {
            vals[i] = new Integer(args[i]);
        } // for
 
        // Do the actual work.
        sorter.sort(vals, StandardIntegerComparator.comparator);

        // And print the results.
        pen.println(Arrays.toString(vals));
    } // sort(String[])
} // ISort
