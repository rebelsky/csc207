package edu.grinnell.csc207.util;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Some quick and dirty tests of the fraction
 * class.
 */
public class FractionTest {
    @Test
    public void test() {
	assertEquals("1/2", new Fraction(1,2).toString());
    } // test

}
