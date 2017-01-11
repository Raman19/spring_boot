package com.allstate.models;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MathTest {
    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void ShouldSquareAnInteger () throws Exception {
        int result = Maths.square(4);
        assertEquals(16, result);
        assertEquals(25, Maths.square(5));
    }

    @Test
    public void ShouldReturnFactorial () throws Exception {
        int result = Maths.factorial(4);
        assertEquals(24, result);
        assertEquals(120, Maths.factorial(5));
    }

    @Test
    public void ShouldReturnFibbonaciOfInteger () throws Exception {
        int result = Maths.fibonacci(4);
        assertEquals(3, result);
        assertEquals(5, Maths.fibonacci(5));
    }

}