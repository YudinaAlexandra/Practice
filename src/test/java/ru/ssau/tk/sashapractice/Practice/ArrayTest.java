package ru.ssau.tk.sashapractice.Practice;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ArrayTest {
    @Test
    public void testNewArray() {
        assertEquals(Array.newArray(5)[4], 5.0);
        assertEquals(Array.newArray(8)[0], 1.0);
    }
    @Test
    public void testNewArrayOneTwo() {
        assertEquals(Array.newArrayOneTwo(5)[2], 1.0);
        assertEquals(Array.newArrayOneTwo(5)[0], 2.0);
        assertEquals(Array.newArrayOneTwo(5)[4], 2.0);
    }
}