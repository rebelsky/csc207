import java.util.ListIterator;

/**
 * Lists have cursors/iterators, which fall between elements (or before
 * the first element or after the last element).
 */
public interface ListOfStrings extends Iterable<String> {
    // Adding Elements
    
    /**
     * Insert an element at the location of the cursor (between two
     * elements).
     *
     * @pre
     *   lit must be associated with the list and in the list.
     *
     * @throws Exception
     *   If the precondition is not met.
     * @throws Exception
     *   If there is no memory to expand the list.
     *
     * @post
     *   The previous elemetn to the iterator remains the same
     *   str is immediately after the iterator
     *   The element that previously followed the iterator follows str
     *   And writing postconditions is a PITN
     */
    public void insert(String str, StringListIterator lit) throws Exception;

    /**
     * Add an element to the end of the list.  (Creates a one-element
     * list if the list is empty.)
     *
     * @throws Exception
     *   If there is no memory to expand the list.
     */
    public void append(String str) throws Exception;

    /**
     * Add an element to the front of the list.  (Creates a one-element
     * list if the list is empty.)
     *
     * @throws Exception
     *   If there is no memory to expand the list.
     */
    public void prepend(String str) throws Exception;

    // Removing Elements
    /**
     * Delete the element immediately after the iterator.
     *
     * @post
     *    The remaining elements retain their order.
     * @post
     *    The iterator is at the position
     *    The successor of the element immediately before the iterator
     *      is the successor of the now-deleted element.
     */
    public void delete(StringListIterator lit) throws Exception;

    // Iterating Lists
    /**
     * Get a standard interator at the front of the list.
     */
    @Override
    public ListIterator<String> iterator();

    /**
     * Get an iterator right before the front of the list.
     *
     * @throws Exception
     *   If the list is empty.
     */
    public StringListIterator front() throws Exception;

    /**
     * Advance to the next position between elements
     *
     * @pre
     *   The list has a next element.
     * @throws Exception
     *   If there is no next element.
     */
    public void advance(StringListIterator it) throws Exception;

    /**
     * Get the element immediately following this iterator.
     *
     * @pre
     *   it is valid and associated with this list.
     * @throws Exception
     *   If the preconditions are not met.
     */
    public String get(StringListIterator it) throws Exception;

    /**
     * Get the element immediately before this iterator.
     */
    public String getPrev(StringListIterator it) throws Exception;

    /**
     * Determine if it's safe to advance to the next position.
     *
     * @pre
     *   pos is valid and associated with the list.
     */
    public boolean hasNext(StringListIterator it) throws Exception;

    // Other operations

    /**
     * Swap the elements at the positions the corresopnd to it1 and it2.
     *
     * @pre
     *   Both it1 and it2 are valid and associated with this list.
     *   v1 = get(it1), v2 = get(it2)
     * @post
     *   it1 and it2 are unchanged.
     *   v1 = get(it2), v2 = get(it1)
     */
    public void swap(StringListIterator it1, StringListIterator it2)
            throws Exception;

    /**
     * Search for a value, moving the iterator to that value.
     *
     * @return true, if the value was found
     * @return false, if the value was not found
     *
     * @post If the value is not found, the iterator has not moved.
     * @post IF the value is found, get(it) is value
     */
    public boolean search(StringListIterator it, String val) throws Exception;

    /** 
     * Grab a sublist.  (Detailed discussion not included.)
     *
     * @pre
     *    Valid iterators.
     *    start precedes end.
     * @throws Exception
     *    If the iterators are invalid.
     */
    public ListOfStrings subList(StringListIterator start, StringListIterator end)
            throws Exception;

    /**
     * Determine if one iterator precedes another iterator.
     */
    public boolean precedes(StringListIterator it1, StringListIterator it2)
           throws Exception;
} // interface ListOfStrings
