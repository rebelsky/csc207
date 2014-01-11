import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * Linked lists.
 */
public class LinkedList<T> implements ListOf<T> {

    // FIELDS

    /**
     * The front of the list.  Set to null for the empty list.
     */
    Node<T> front;

    /**
     * The back of the list.  Set to null for the empty list.
     */
    Node<T> back;
    
    /**
     * The dummy node!  Yay!
     */
    Node<T> dummy;

    /**
     * The number of mutations.
     */
    long mutations;

    // CONSTRUCTORS
    /**
     * Create a new linked list.
     */
    public LinkedList() {
	this.dummy = new Node(null,null);
        this.front = dummy;
        this.back = dummy;
        this.mutations = 0;
    } // LinkedList

    // Internal methods
    boolean isEmpty() {
        return (this.front == this.dummy);
    } // isEmpty

    // ITERABLE METHODS
    @Override
    public Iterator<T> iterator() {
        return new LinkedListIterator<T>(this);
    } // iterator()

    // LISTOF METHODS
    public void insert(T val, Cursor c) throws Exception {
        throw new UnsupportedOperationException("STUB");
    } // insert(T, Cursor)

    public void append(T val) throws Exception {
        // Special case: Empty list
        if (this.isEmpty()) {
            this.front = new Node<T>(val, null);
            this.back = this.front;
            this.dummy.next = this.front;
        }
        // Normal case: Nonempty list
        else {
            this.back.next = new Node<T>(val, null);
            this.back = this.back.next;
        }
    } // append(T)

    public void prepend(T val) throws Exception {
        // Special case: Empty list
        if (this.isEmpty()) {
            this.front = new Node<T>(val, null);
            this.back = this.front;
        }
        // Normal case: Nonempty list
        else {
            this.front = new Node<T>(val, this.front);
        } 
        this.dummy.next = this.front;
    } // prepend(T)

    public void delete(Cursor c) throws Exception {
	LinkedListCursor<T> llc = (LinkedListCursor<T>) c;
        llc.prev.next = llc.prev.next.next;
    } // delete(Cursor)

    public Cursor front() throws Exception {
	return new LinkedListCursor<T>(this.dummy);
    } // front()

    public void advance(Cursor c) throws Exception {
	LinkedListCursor<T> llc = (LinkedListCursor<T>) c;
	llc.prev = llc.prev.next;
    } // advance(Cursor)

    public void retreat(Cursor c) throws Exception {
        throw new UnsupportedOperationException("STUB");
    } // retreat(Cursor)

    public T get(Cursor c) throws Exception {
	LinkedListCursor<T> llc = (LinkedListCursor<T>) c;
	return llc.prev.next.val;
    } // get

    public T getPrev(Cursor c) throws Exception {
        throw new UnsupportedOperationException("STUB");
    } // getPrev(Cursor)

    public boolean hasNext(Cursor c) {
        return false;   // STUB
    } // hasNext

    public boolean hasPrev(Cursor c) {
        return false;   // STUB
    } // hasPrev

    public void swap(Cursor c1, Cursor c2) throws Exception {
        throw new UnsupportedOperationException("STUB");
    } // swap(Cursor, Cursor)

    public boolean search(Cursor c, Predicate<T> pred) throws Exception {
        throw new UnsupportedOperationException("STUB");
    } // search(Cursor, Predicate<T>)
     
    public ListOf<T> subList(Cursor start, Cursor end) throws Exception {
        throw new UnsupportedOperationException("STUB");
    } // subList(Cursor, Cursor)

    public boolean precedes(Cursor c1, Cursor c2) throws Exception {
        throw new UnsupportedOperationException("STUB");
    } // precedes(Cursor, Cursor)
} // class LinkedList

/**
 * Nodes in the list.
 */
class Node<T> {
    T val;
    Node<T> next;

    /**
     * Create a new node.
     */
    public Node(T val, Node<T> next) {
        this.val = val;
        this.next = next;
    } // Node(T, Node<T>)
} // Node<T>

/**
 * Cursors in the list.
 */
class LinkedListCursor<T> implements Cursor {
    Node<T> prev;

    /**
     * Create a new cursor that points to a node.
     */
    public LinkedListCursor(Node<T> pos) {
        this.prev = pos;
    } // LinkedListCursor
} // LinkedListCursor<T>

/**
 * Iterators in the list.
 */
class LinkedListIterator<T> implements Iterator<T> {
    Node<T> pos;
    LinkedList<T> list;

    /**
     * Create a new iterator at the front of the list.
     */
    public LinkedListIterator(LinkedList<T> list) {
        this.pos = list.front;
        this.list = list;
    } // LinkedListIterator(Node<T>)

    public T next() throws NoSuchElementException {
        if (this.pos == null) {
            throw new NoSuchElementException("at end of list");
        }
        T val = this.pos.val;
        this.pos = this.pos.next;
        return val;
    } // next()

    public boolean hasNext() {
        return this.pos != null;
    } // hasNext()

    public void remove() throws UnsupportedOperationException {
         throw new UnsupportedOperationException("No way, no how");
    } // remove()
} // LinkedListIterator<T>
