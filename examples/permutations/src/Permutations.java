import java.io.PrintWriter;
import java.util.Arrays;

/**
 * Some fun activities with permtuations.
 */
public class Permutations {

    /**
     * Print all permutations of values.
     */
    public static <T> void printPermutations(PrintWriter pen, T[] values) {
        printPermutations(pen, values, values.length);
    } // printPermutations(T[])

    /**
     * Print all permutations of the first n elements of values.  (Print
     * the unpermuted parts, too.)
     *
     * @post values is unmodified
     * @post the permutations have been printed
     */
    public static <T> void printPermutations(PrintWriter pen, T[] values,
            int n) {
        // Base case: No values to permute
        if (n <= 0) {
            pen.println(Arrays.toString(values));
        } else {
            // Put all possible values in the last cell
            for (int i = 0; i < n; i++) {
                swap(values, n-1, i);
                // And then permute the remaining values
                printPermutations(pen, values, n-1);
                // Restore the array
                swap(values, n-1, i);
            } // for
        } // if (n > 0)
    } // printPermutations

    /**
     * Swap the values in positions i and j of vec.
     *
     * @pre 0 <= i,j < value.length
     * @pre a = values[i]
     * @pre b = values[j]
     * @post values[i] = b
     * @post values[j] = a
     */
    public static <T> void swap(T[] values, int i, int j) {
        T tmp = values[i];
        values[i] = values[j];
        values[j] = tmp;
    } // swap(T[], int, int)

    /**
     * An example.
     */
    public static void main(String[] args) {
        PrintWriter pen = new PrintWriter(System.out, true);
        printPermutations(pen, new String[] { "a", "b", "c", "d" });
        pen.close();
    } // main
} // class Permutations
