package com.example;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorAAATest {
    private Calculator calculator;

    @Before
    public void setup() {

        System.out.println("Before Test");

        calculator = new Calculator();
    }

    @After
    public void teardown() {

        System.out.println("After Test");

        calculator = null;
    }

    @Test
    public void testAddition() {

        // Arrange
        int a = 10;
        int b = 20;

        // Act
        int result = calculator.add(a, b);

        // Assert
        assertEquals(30, result);
    }

    @Test
    public void testMultiplication() {

        // Arrange
        int a = 5;
        int b = 6;

        // Act
        int result = calculator.multiply(a, b);

        // Assert
        assertEquals(30, result);
    }
}
