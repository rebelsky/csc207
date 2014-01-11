package edu.grinnell.csc207.util;

import java.math.BigInteger;

/**
 * A simple implementation of fractions.
 * 
 * @author Samuel A. Rebelsky
 * @author YOUR NAME HERE
 * @author CSC207 2013F
 * @version 0.1 of September 2013
 */
public class Fraction {
    // +------------------+---------------------------------------------
    // | Design Decisions |
    // +------------------+

    /*
     * Fractions are immutable. Once you've created one, it stays that way.
     * 
     * Fractions are arbitrary precision.
     * 
     * Denominators are always positive. Therefore, negative fractions are
     * represented with a negative numerator. Similarly, if a fraction has a
     * negative numerator, it is negative.
     * 
     * Fractions are stored in simplified form.
     */

    private static BigInteger NEGATIVE_ONE = BigInteger.valueOf(-1);

    // +--------+-------------------------------------------------------
    // | Fields |
    // +--------+

    /** The numerator of the fraction. Can be positive, zero or negative. */
    BigInteger numerator;

    /** The denominator of the fraction. Must be positive. */
    BigInteger denominator;

    // +--------------+-------------------------------------------------
    // | Constructors |
    // +--------------+

    /**
     * Create a new fraction equivalent to numerator/denominator.
     */
    public Fraction(BigInteger numerator, BigInteger denominator) throws Exception {
	if (this.denominator.signum() == 0) {
	    throw new Exception("Zero is an invalid denominator");
	}
	this.numerator = numerator;
	this.denominator = denominator;
	this.cleanup();
    } // Fraction(BigInteger, BigInteger)

    public Fraction(int numerator, int denominator) {
	// I have two ints.
	// I need two BigIntegers
	// How do I go from the ints to BigIntegers?
	// Hint: Read the documentation for Integer and BigInteger
	// A really inefficient strategy:
	// Convert each int to a string
	// Convert each string to a BigInteger
	// this.numerator = new BigInteger(Integer.toString(_num));
	// this.denominator = new BigInteger(Integer.toString(_denom));
	this.numerator = BigInteger.valueOf(numerator);
	this.denominator = BigInteger.valueOf(denominator);
    } // Fraction(int, int)

    // +-------------------------+--------------------------------------
    // | Standard Object Methods |
    // +-------------------------+

    /**
     * Convert this fraction to a string for ease of printing.
     */
    public String toString() {
	// Lump together the string represention of the numerator,
	// a slash, and the string representation of the denominator
	// return
	// this.numerator.toString().concat("/").concat(this.denominator.toString());
	return this.numerator + "/" + this.denominator;
    } // toString()

    // +-----------------+----------------------------------------------
    // | Private Methods |
    // +-----------------+

    private void cleanup() {
	if (this.denominator.signum() < 0) {
	    this.denominator = this.denominator.abs();
	    this.numerator = this.numerator.multiply(NEGATIVE_ONE);
	}
	this.simplify();
    }
    
    private void simplify() {
	// STUB
    } // simplify()

    // +---------+------------------------------------------------------
    // | Methods |
    // +---------+

    /**
     * Add another faction to this fraction.
     */
    public Fraction add(Fraction addend) {
	BigInteger resultNumerator;
	BigInteger resultDenominator;

	// The denominator of the result is the
	// product of this object's denominator
	// and addMe's denominator
	resultDenominator = this.denominator.multiply(addend.denominator);
	// The numerator is more complicated
	resultNumerator = (this.numerator.multiply(addend.denominator))
		.add(addend.numerator.multiply(this.denominator));

	this.simplify();
	
	// Return the computed value
	try {
	    return new Fraction(resultNumerator, resultDenominator);
	} catch (Exception e) {
	    return this;
	}
    } // add(Fraction)

    /**
     * Approximate this fraction as a double.
     */
    public double doubleValue() {
	return this.numerator.doubleValue() / this.denominator.doubleValue();
    } // doubleValue()

} // class Fraction
