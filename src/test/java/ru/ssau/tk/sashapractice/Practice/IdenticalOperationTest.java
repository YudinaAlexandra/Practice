package ru.ssau.tk.sashapractice.Practice;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class IdenticalOperationTest {
    IdenticalOperation func=new IdenticalOperation();
    @Test
    public void testApply() {
        assertEquals(func.apply(112),112,0.0001);
        assertEquals(func.apply(74),74,0.0001);
        assertEquals(func.apply(Double.NEGATIVE_INFINITY),Double.NEGATIVE_INFINITY,0.0001);
        assertEquals(func.apply(Double.POSITIVE_INFINITY),Double.POSITIVE_INFINITY,0.0001);
        assertEquals(func.apply(Double.NaN),Double.NaN,0.0001);
    }
    @Test
    public void testApplyTriple() {
        assertEquals(func.applyTriple(112),112,0.0001);
        assertEquals(func.applyTriple(74),74,0.0001);
        assertEquals(func.applyTriple(Double.NEGATIVE_INFINITY),Double.NEGATIVE_INFINITY,0.0001);
        assertEquals(func.applyTriple(Double.POSITIVE_INFINITY),Double.POSITIVE_INFINITY,0.0001);
        assertEquals(func.applyTriple(Double.NaN),Double.NaN,0.0001);
    }

}