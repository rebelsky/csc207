/** 
 * Some explorations of sorting.
 */
public class Worried<T extends Comparable<T>> {
    public static <T extends Comparable<T>> T smaller(T v1, T v2) {
	if (v1.compareTo(v2) < 0) {
	    return v1;
	} else {
	    return v2;
	} // if (v2 is smaller than v1)
    } // smaller(T,T)
    
} // Worried<T>
