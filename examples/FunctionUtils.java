/**
 * Some utilities for working with functions that are not yet implemented.
 */
public class FunctionUtils {
    /**
     * Given unary functions f and g, build the unary function f o g.  That
     * is, build the function (lambda (x) (f (g x))).
     * ...
     */
    public static <A,B,C> UnaryFunction<A,C> compose(final UnaryFunction<B,C> f,
            final UnaryFunction<A,B> g) {
        return new UnaryFunction<A,C>() {
            public C apply(A arg) throws Exception {
                return f.apply(g.apply(arg));
            } // apply
        }; // new UnaryFunction
    } // compose(UnaryFunction, UnaryFunction)
    
    /**
     * Given unary function f and binary function g, build the binary function 
     * f o g.  That is, build the function (lambda (x y) (f (g x y))).
     */
    public static <A,B,C,D> BinaryFunction<A,B,D> compose(final UnaryFunction<C,D> f,
            final BinaryFunction<A,B,C> g) {
        return new BinaryFunction<A,B,D>() {
            public D apply(A left, B right) throws Exception {
                return f.apply(g.apply(left, right));
            } // apply
        }; // new BinaryFunction
    } // compose(Function)
    
    /**
     * Given a binary function, f, and two unary functions, g and h, build the
     * function (lambda (x,y) (f (g x) (h y)))
     */
    public static <A,B,C,D,E> BinaryFunction<A,C,E> compose(final BinaryFunction<B,D,E> f,
            final UnaryFunction<A,B> g, final UnaryFunction<C,D> h) {
        return new BinaryFunction<A,C,E>() {
            public E apply(A left, C right) throws Exception {
               return f.apply(g.apply(left), h.apply(right));
            } // apply
        }; // new BinaryFunction
    } // compose(Function)
    
    /**
     * Build a new function by filling in the left argument of f.
     */
    public static <A,B,C> UnaryFunction<B,C> leftSection(
            final BinaryFunction<A,B,C> f, final A left) {
        return new UnaryFunction<B,C>() {
            public C apply(B arg) throws Exception {
                return f.apply(left, arg);
            } // apply
        }; // new UnaryFunction
    } // leftSection
    
    /**
     * Build a new function by filling in the right argument of f.
     */
    public static <A,B,C> UnaryFunction<A,C> rightSection(
            final BinaryFunction<A,B,C> f, final B right) {
        return new UnaryFunction<A,C>() {
            public C apply(A arg) throws Exception {
                return f.apply(arg, right);
            } // apply
        }; // new UnaryFunction
    } // rightSection
 
    /**
     * Map a unary function over an array.
     *
     * @post
     *   For each i, 0 <= i < vals.length
     *     results[i] = fun.apply(vals[i])
     */
    @SuppressWarnings("unchecked")
    public static <Input,Output> Output[] map(UnaryFunction<Input,Output> fun, Input[] vals) throws Exception {
         Output[] results = (Output[]) new Object[vals.length];
         for (int i = 0; i < vals.length; i++) {
             results[i] = fun.apply(vals[i]);
         } // for
         return results;
    } // map

    /**
     * Map a binary function over two arrays.
     *
     * @pre
     *   left.length == right.length
     * @post
     *   For each i, 0 <= i < vals.length
     *     results[i] = fun.apply(left[i], right[i])
     */
    @SuppressWarnings("unchecked")
    public static <Left,Right,Output> Output[] map(BinaryFunction<Left,Right,Output> fun, Left[] left,
            Right[] right) throws Exception {
         Output[] results = (Output[]) new Object[left.length];
         for (int i = 0; i < left.length; i++) {
             results[i] = fun.apply(left[i], right[i]);
         } // for
         return results;
    } // map
} // class FunctionUtils
