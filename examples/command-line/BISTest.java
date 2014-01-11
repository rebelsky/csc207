import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;
import org.junit.Test;

/**
 * BISR's tests for Quicksort. Code based on earlier code from the sorting
 * laboratories.
 */
public class BISTest {
    // +-----------+-------------------------------------------------------
    // | Constants |
    // +-----------+

    /**
     * The number of randomized arrays we build.
     */
    public static final int NUM_RANDOM_ARRAYS = 20;

    /**
     * The number of permutations we do per randomized array.
     */
    public static final int NUM_PERMUTATIONS = 50;

    /**
     * The minimum size of a random array.
     */
    public static final int MIN_RANDOM_ARRAY_SIZE = 10;

    /**
     * The maximum size of a random array.
     */
    public static final int MAX_RANDOM_ARRAY_SIZE = 128;

    // +---------------+---------------------------------------------------
    // | Static Fields |
    // +---------------+

    /**
     * A random number generator for use in permutations and such.
     */
    static Random generator = new Random();

    /**
     * The sorter we use for integers.
     */
    static Sorter<Integer> isorter = new BuiltinSorter<Integer>();

    /**
     * The order we use for integers.
     */
    static Comparator<Integer> iorder = StandardIntegerComparator.comparator;

    // +-------+-----------------------------------------------------------
    // | Tests |
    // +-------+

    /**
     * Make sure that it works correctly on some already sorted arrays.
     */
    @Test
    public void testSorted() {
	// Empty array
	checkSort(new Integer[] {}, isorter, iorder);
	// Singleton array
	checkSort(new Integer[] { 0 }, isorter, iorder);
	// Two-element arrays
	checkSort(new Integer[] { 0, 1 }, isorter, iorder);
	checkSort(new Integer[] { 0, 0 }, isorter, iorder);
	// Three-element arrays
	checkSort(new Integer[] { 0, 0, 0 }, isorter, iorder);
	checkSort(new Integer[] { 0, 0, 1 }, isorter, iorder);
	checkSort(new Integer[] { 0, 1, 1 }, isorter, iorder);
	// Four-element arrays
	checkSort(new Integer[] { 0, 0, 0, 0 }, isorter, iorder);
	checkSort(new Integer[] { 0, 0, 0, 1 }, isorter, iorder);
	checkSort(new Integer[] { 0, 0, 1, 1 }, isorter, iorder);
	checkSort(new Integer[] { 0, 1, 1, 1 }, isorter, iorder);
    } // testSorted()

    /**
     * Make sure that some larger, predesigned, arrays sort correctly.
     */
    @Test
    public void testVarious() {
	// Mostly the same value
	permutationTests(new Integer[] { 0, 0, 0, 0, 0, 0, 1, 2, 3, 4 },
		isorter, iorder, 20);
	// Only two different values
	permutationTests(new Integer[] { 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1,
		1, 1, 1 }, isorter, iorder, 20);

	// Three different values
	permutationTests(new Integer[] { 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 5, 5, 5,
		5, 5 }, isorter, iorder, 20);
    } // testVarious()

    /**
     * Lots of randomized tests.
     */
    public void testRandomized() {
	for (int i = 0; i < NUM_RANDOM_ARRAYS; i++) {
	    Integer[] sorted = randomSortedInts(1 + generator.nextInt(1
		    + MAX_RANDOM_ARRAY_SIZE - MIN_RANDOM_ARRAY_SIZE));
	    permutationTests(sorted, isorter, iorder, NUM_PERMUTATIONS);
	} // for
    } // testRandomized

    // +-----------+-------------------------------------------------------
    // | Utilities |
    // +-----------+

    /**
     * Check the results of sorting an already sorted array.
     */
    public static <T> void checkSort(T[] sorted, Sorter<T> sorter, 
            Comparator<T> order) {
	checkSort(sorted, sorted.clone(), sorter, order);
    } // checkSort(T[])

    /**
     * Check the results of sorting.
     * 
     * @param unsorted
     *            the array to sort
     * @param expected
     *            the sorted version of that array
     * @param sorter
     *            the object used to do the sorting
     * @param order
     *            the order in which elements should appear
     */
    public static <T> void checkSort(T[] unsorted, T[] expected,
	    Sorter<T> sorter, Comparator<T> order) {
	T[] result = unsorted.clone();
	sorter.sort(result, order);
	if (!Arrays.equals(result, expected)) {
	    System.err.println("Original: " + Arrays.toString(unsorted));
	    System.err.println("Result:   " + Arrays.toString(result));
	    System.err.println("Expected: " + Arrays.toString(expected));
	    fail("Did not sort correctly.");
	} // if not equal
    } // checkResults(T[], T[], Sorter<T>, Comparator<T>)

    /**
     * "Randomly" permute an array in place.
     */
    public static <T> T[] permute(T[] values) {
	for (int i = 0; i < values.length; i++) {
	    swap(values, i, generator.nextInt(values.length));
	} // for
	return values;
    } // permute(T)

    /**
     * Generate a "random" sorted array of integers of size n.
     */
    public static Integer[] randomSortedInts(int n) {
	if (n == 0) {
	    return new Integer[0];
	}
	Integer[] values = new Integer[n];
	// Start with a negative number so that we have a mix
	values[0] = generator.nextInt(10) - n;
	// Add remaining values. We use a random increment between
	// 0 and 3 so that there are some duplicates and some gaps.
	for (int i = 1; i < n; i++) {
	    values[i] = values[i - 1] + generator.nextInt(4);
	} // for
	return values;
    } // randomSortedInts

    /**
     * Swap two elements in an array.
     * 
     * @param values
     *            the array
     * @param i
     *            one of the indices
     * @param j
     *            another index
     * @pre 0 <= i,j < values.length
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
     * A simple test using one permutation of an already sorted array.
     * 
     * @param sorted A sorted array of values
     * @param order The order used to generate that sorted array.
     */
    public static <T> void permutationTest(T[] sorted, Sorter<T> sorter,
            Comparator<T> order) {
	// Create a permuted version of the array.
	T[] values = sorted.clone();
	permute(values);

	// Check the results.
	checkSort(values, sorted, sorter, order);
    } // permutationExperiment(PrintWriter, Sorter<T>, Comparator<T>)

    /**
     * Do some number of permutation tests.
     */
    public static <T> void permutationTests(T[] sorted, Sorter<T> sorter,
            Comparator<T> order, int n) {
	for (int i = 0; i < n; i++) {
	    permutationTest(sorted, sorter, order);
	} // for
    } // permutationTests(T[], Sorter<T>, Comparator<T>, int)

} // BISTest
