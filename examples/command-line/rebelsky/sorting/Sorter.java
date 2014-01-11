package rebelsky.sorting; 

import java.util.Comparator;

/**
 * Things that know how to sort.
 */
public interface Sorter<T> {
    /**
     * Sort a set of values using an order to compare values.
     */
    public void sort(T[] values, Comparator<T> order);
} // interface Sorter<T>
