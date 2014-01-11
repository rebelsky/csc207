import java.util.ListIterator;
import java.util.NoSuchElementException;

/**
 * Lists of Strings implemented as Arrays.
 */
public class LOSA implements ListOfStrings {
    // DESIGN
    /*
     * What happens when arrays fill?  Do we expand or throw an exception?
     */
    
    // FIELDS
    /**
     * The values in the list.
     */
    String[] values;
    
    /**
     * The number of values stored in the list.
     */
    int size;
    
    /**
     * The number of times the list has been mutated
     */
    long mutations = 0;
    
    // CONSTRUCTORS
    /** 
     * Create a new, empty list of strings with a default capacity.
     */
    public LOSA() {
	this(16);
    } // LOSA
    
    /**
     * Create new, empty list of strings that can hold up to N strings.
     */
    public LOSA(int capacity) {
	this.values = new String[capacity];
	size = 0;
    } // LOSA
    
    /**
     * Create a new list of strings that contains the values in init and
     * has a capacity of capacity.
     * 
     * NOTE: TN says that we should improve this crappy design.
     * 
     * @param init
     */
    public LOSA(int capacity, String[] init) {
	this(capacity);
	try {
	    for (int i = 0; i < init.length; i++) {
		this.append(init[i]);
	    } // for
	} catch (Exception e) {
	    // This should never happen.
	}
    } // LOSA(int, String[])
    
    // METHODS
    
    @Override
    public void insert(String str, StringListIterator lit) throws Exception {
	// Question: Is this "replace" or "shove into this position in the list"?
	// The latter.
        ArrayStringListIterator asli = (ArrayStringListIterator) lit;
        // Step 1: Verify that there's room
        if (this.size >= this.values.length) {
            throw new Exception("Out of memory");
        }
        // Step 2: Shove the other strings to the right one
        for (int i = this.size; i > asli.pos; i--) {
            this.values[i] = this.values[i-1];
        }
        // Step 3: Put the value in the newly freed space
        this.values[asli.pos] = str;
        // Step 4: Increase the size
        ++this.size;
        ++this.mutations;
    } //insert

    @Override
    public void append(String str) throws Exception {
	// Add the element at the position given by size
	this.values[this.size] = str;
	// Increment size
	this.size++;
    }

    @Override
    public void prepend(String str) throws Exception {
	// Check preconditions
        // Shift everything to the right one space
	for (int i = this.size; i > 0; i--) {
	    this.values[i] = this.values[i-1];
	}
	// Put at the front
	this.values[0] = str;
	// Increase the size
	this.size++;
	this.mutations++;
    }

    @Override
    public void delete(StringListIterator lit) throws Exception {
        throw new Exception("Unimplemented");
    }

    @Override
    public ListIterator<String> iterator() {
        return new LOSAIterator(this);
    } // iterator()

    @Override
    public StringListIterator front() throws Exception {
        return new ArrayStringListIterator(this);
    }

    @Override
    public void advance(StringListIterator it) throws Exception {
	// Question: Can we advance if there's capacity, but there's
	// nothing there.  No.
	// Question: If we know this is invalid, should we bother to 
	// throw the exception?  No.  Let the client suffer.
	((ArrayStringListIterator) it).pos++;
      }

    @Override
    public String get(StringListIterator it) throws Exception {
	// Question: Why did Sam insert the following line, rather
	// than using it directly?
        ArrayStringListIterator realit = (ArrayStringListIterator) it;
        // Validate
        if (realit.mutations != this.mutations) {
            // throw new Exception("Invalid iterator");
        }
        // Question: Why use realit.pos rather than just realit (or it)
        return this.values[realit.pos];
    }

    @Override
    public String getPrev(StringListIterator it) throws Exception {
        throw new Exception("Unimplemented");
    }

    @Override
    public boolean hasNext(StringListIterator it) throws Exception {
        return (((ArrayStringListIterator) it).pos + 1 < this.size);
    } // hasNext(StringListIterator)
    

    @Override
    public void swap(StringListIterator it1, StringListIterator it2) 
            throws Exception {
        throw new Exception("Unimplemented");
    }

    @Override
    public boolean search(StringListIterator it, String val) 
            throws Exception{
        throw new Exception("Unimplemented");
    }

    @Override
    public ListOfStrings subList(StringListIterator start, StringListIterator end)
            throws Exception {
        throw new Exception("Unimplemented");
    }

    @Override
    public boolean precedes(StringListIterator it1, StringListIterator it2) 
            throws Exception {
        throw new Exception("Unimplemented");
    }
    
    public String toString() {
	if (this.size == 0) {
	    return "{}";
	}
	else {
	    String result = "{" + this.values[0];
	    for (int i = 1; i < this.size; i++) {
		result += "," + this.values[i];
	    } // for
	    return result + "}";
	}
    } // toString
} // LOSA

/**
 * Iterators
 */
class ArrayStringListIterator implements StringListIterator {
    // FIELDS
    /** 
     * The position in the array.
     */
    int pos;
    
    /** The number of mutations at the start. */
    long mutations;
    
    /** The underlying list. */
    LOSA list;

    // Constructor
    public ArrayStringListIterator(LOSA list) {
	this.pos = 0;
	this.mutations = list.mutations;
	this.list = list;
    } // ArrayStringListIterator()
} //

/**
 * Traditional iterators
 */
class LOSAIterator implements ListIterator<String> {
    // Fields

    /**
     * The underlying iterator (not a standard Java iterator).
     */
    ArrayStringListIterator it;

    /**
     * The list we are iterating.
     */
    LOSA list;

    /**
     * Create a new iterator.
     */
    public LOSAIterator(LOSA list) {
        this.list = list;
        try {
            this.it = (ArrayStringListIterator) list.front();
        } catch (Exception e) { 
        }
    } // LOSAIterator

    // ITERATOR METHODS
    @Override
    public void add(String str) {
        try {
             this.list.insert(str, this.it);
        } catch (Exception e) {
        }
    } // add

    @Override
    public boolean hasNext() {
	return this.it.pos < this.list.size;
    } // hasNext()

    @Override
    public boolean hasPrevious() {
        return this.it.pos > 0;
    } // hasPrevious()

    @Override
    public String next() throws NoSuchElementException {
         if (! this.hasNext()) {
             throw new NoSuchElementException("At end of list");
         }
         try {
             String result = list.get(it);
             list.advance(it);
             return result;
         } catch (Exception e) {
             return null;
         }
    } // next()

    @Override
    public int nextIndex() {
        return this.it.pos + 1;
    } // nextIndex();

    @Override
    public String previous() throws NoSuchElementException {
        if (! this.hasPrevious()) {
            throw new NoSuchElementException("At front of list");
        }
        it.pos--;
        try {
            return list.get(it);
        } catch (Exception e) {
            return null;
        }
    } // previous()

    @Override
    public int previousIndex() {
        return this.it.pos - 1;
    } // nextIndex();

    @Override
    public void remove() {
         try {
             this.list.delete(this.it);
         } catch (Exception e) {
         }
    } // remove()

    @Override
    public void set(String str) {
        this.list.values[this.it.pos] = str;
    } // set(String)
} // LOSAIterator
