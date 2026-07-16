package com.example;

import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {
    @Test
    public void testAddition() {

        Calculator calculator = new Calculator();

        int result = calculator.add(10, 5);

        assertEquals(15, result);
    }

    @Test
    public void testSubtraction() {

        Calculator calculator = new Calculator();

        int result = calculator.subtract(10, 5);

        assertEquals(5, result);
    }

    @Test
    public void testMultiplication() {

        Calculator calculator = new Calculator();

        int result = calculator.multiply(4, 3);

        assertEquals(12, result);
    }

    @Test
    public void testDivision() {

        Calculator calculator = new Calculator();

        int result = calculator.divide(20, 5);

        assertEquals(4, result);
    }
}
