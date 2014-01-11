/**
 * A simple interface for things that act like numbers in that they
 * can be added and subtracted and multiplied and divided.
 */
public interface Numeric<Param,Result> {
    /**
     * Add something to this.
     */
    public Result add(Param val);

    /**
     * Subtract something from this.
     */
    public Result subtract(Param val);

    /**
     * Multiply this by something.
     */
    public Result multiply(Param val);

    /**
     * Divide this by something.
     */
    public Result divide(Param val);
} // interface Numeric<Param,Result>
