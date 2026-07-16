package com.example;

import org.junit.Test;

import static org.junit.Assert.*;

public class AssertionsTest {
    @Test
    public void testAssertions() {

        // assertEquals
        assertEquals(5, 2 + 3);

        // assertNotEquals
        assertNotEquals(10, 2 + 3);

        // assertTrue
        assertTrue(10 > 5);

        // assertFalse
        assertFalse(10 < 5);

        // assertNull
        String name = null;
        assertNull(name);

        // assertNotNull
        Calculator calculator = new Calculator();
        assertNotNull(calculator);

        // assertSame
        Calculator c1 = new Calculator();
        Calculator c2 = c1;

        assertSame(c1, c2);

        // assertNotSame
        Calculator c3 = new Calculator();

        assertNotSame(c1, c3);
    }
}
