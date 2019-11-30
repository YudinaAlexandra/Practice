package ru.ssau.tk.sashapractice.Practice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SqrtOperationTest {
    SqrtOperation func = new SqrtOperation();

    @Test
    public void testApply() {
        assertEquals(func.apply(0), 0, 0.0001);
        assertEquals(func.apply(74), Math.sqrt(74), 0.0001);
        assertEquals(func.apply(Double.NEGATIVE_INFINITY), Double.NaN, 0.0001);
        assertEquals(func.apply(Double.POSITIVE_INFINITY), Double.POSITIVE_INFINITY, 0.0001);
        assertEquals(func.apply(Double.NaN), Double.NaN, 0.0001);
    }

    @Test
    public void testApplyTriple() {
        assertEquals(func.applyTriple(0), 0, 0.0001);
        assertEquals(func.applyTriple(74), Math.sqrt(Math.sqrt(Math.sqrt(74))), 0.0001);
        assertEquals(func.applyTriple(Double.NEGATIVE_INFINITY), Double.NaN, 0.0001);
        assertEquals(func.applyTriple(Double.POSITIVE_INFINITY), Double.POSITIVE_INFINITY, 0.0001);
        assertEquals(func.applyTriple(Double.NaN), Double.NaN, 0.0001);
    }

}