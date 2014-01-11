import java.math.BigInteger;
import java.io.PrintWriter;

/**
 * A quick exploration of comparison.
 *
 * @author Samuel A. Rebelsky
 */
public class CompareExpt {
    public static void main(String[] args) {
        PrintWriter pen = new PrintWriter(System.out, true);
        BigInteger maxint = BigInteger.valueOf(Integer.MAX_VALUE);
        BigInteger two = BigInteger.valueOf(2);
        BigInteger x = maxint.add(maxint);
        BigInteger y = x.add(x);
        BigInteger result = y.subtract(x);
        pen.println(result + ".intValue() = " +  result.intValue());
        pen.close();
    } // main(String[])
} // class CompareExpt
