import java.util.Iterator;

/**
 * Doubly linked lists.
 */
public class DoublyLinkedList<T> implements ListOf<T> {

    // FIELDS

    // CONSTRUCTORS
    /**
     * Create a new linked list.
     */
    public DoublyLinkedList() {
    } // DoublyLinkedList

    // ITERABLE METHODS
    @Override
    public Iterator<T> iterator() {
        return null;    // STUB
    } // iterator()

    // LISTOF METHODS
    public void insert(T val, Cursor<T> c) throws Exception {
        throw new UnsupportedOperationException("STUB");
    } // insert(T, Cursor<T>)

    public void append(T val) throws Exception {
        throw new UnsupportedOperationException("STUB");
    } // append(T)

    public void prepend(T val) throws Exception {
        throw new UnsupportedOperationException("STUB");
    } // prepend(T)

    public void delete(Cursor<T> c) throws Exception {
        throw new UnsupportedOperationException("STUB");
    } // delete(Cursor<T>)

    public Cursor<T> front() throws Exception {
        throw new UnsupportedOperationException("STUB");
    } // front()

    public void advance(Cursor<T> c) throws Exception {
        throw new UnsupportedOperationException("STUB");
    } // advance(Cursor<T>)

    public void retreat(Cursor<T> c) throws Exception {
        throw new UnsupportedOperationException("STUB");
    } // retreat(Cursor<T>)

    public T get(Cursor<T> c) throws Exception {
        throw new UnsupportedOperationException("STUB");
    } // get

    public T getPrev(Cursor<T> c) throws Exception {
        throw new UnsupportedOperationException("STUB");
    } // getPrev(Cursor<T>)

    public boolean hasNext(Cursor<T> c) {
        return false;   // STUB
    } // hasNext

    public boolean hasPrev(Cursor<T> c) {
        return false;   // STUB
    } // hasPrev

    public void swap(Cursor<T> c1, Cursor<T> c2) throws Exception {
        throw new UnsupportedOperationException("STUB");
    } // swap(Cursor<T>, Cursor<T>)

    public boolean search(Cursor<T> c, Predicate<T> pred) throws Exception {
        throw new UnsupportedOperationException("STUB");
    } // search(Cursor<T>, Predicate<T>)
     
    public ListOf<T> select(Predicate<T> pred) throws Exception {
        throw new UnsupportedOperationException("STUB");
    } // select(Predicate<T>)
     
    public ListOf<T> subList(Cursor<T> start, Cursor<T> end) throws Exception {
        throw new UnsupportedOperationException("STUB");
    } // subList(Cursor<T>, Cursor<T>)

    public boolean precedes(Cursor<T> c1, Cursor<T> c2) throws Exception {
        throw new UnsupportedOperationException("STUB");
    } // precedes(Cursor<T>, Cursor<T>)
} // class DoublyLinkedList

/**
 * Nodes in the list.
 */
class Node<T> {
    T val;
    Node<T> next;
    Node<T> prev;

    /**
     * Create a new node.
     */
    public Node(T val) {
        this.val = val;
        this.next = null;
        this.prev = null;
    } // Node(T)
} // Node<T>

/**
 * Cursors in the list.
 */
class DoublyLinkedListCursor<T> implements Cursor<T> {
    Node<T> pos;

    /**
     * Create a new cursor that points to a node.
     */
    public DoublyLinkedListCursor(Node<T> pos) {
        this.pos = pos;
    } // DoublyLinkedListCursor<T>
} // DoublyLinkedListCursor<T>

