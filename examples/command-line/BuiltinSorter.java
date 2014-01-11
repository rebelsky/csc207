import java.util.Arrays;
import java.util.Comparator;

/**
 * Sort using the built in sorter.
 *
 * @author Samuel A. Rebelsky
 */
public class BuiltinSorter<T> implements Sorter<T> {

   @Override
   public void sort(T[] vals, Comparator<T> order) {
       Arrays.sort(vals, order);
   } // sort(T[], Comparator<T>)
} // BuiltInSorter<T>
