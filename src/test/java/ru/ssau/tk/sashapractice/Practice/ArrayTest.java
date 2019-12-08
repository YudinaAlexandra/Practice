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
    @Test
    public void testOddNumbeArray(){
        assertEquals(Array.oddNumberArray(5)[1],3.0);
        assertEquals(Array.oddNumberArray(5)[2],5.0);
        assertEquals(Array.oddNumberArray(5)[4],9.0);
    }
    @Test
    public void testEvenNumberArray(){
        assertEquals(Array.evenNumberArray(5)[0],10.0);
        assertEquals(Array.evenNumberArray(5)[2],6.0);
        assertEquals(Array.evenNumberArray(5)[4],2.0);
    }
    @Test
    public void testFibonacciNumberArray(){
        assertEquals(Array.fibonacciNumberArray(5)[0], 1);
        assertEquals(Array.fibonacciNumberArray(5)[1], 1);
        assertEquals(Array.fibonacciNumberArray(5)[2], 2);
    }
    @Test
    public void  testIndexSquareArray(){
        assertEquals(Array.indexSquareArray(5)[1],1);
        assertEquals(Array.indexSquareArray(5)[2],4);
        assertEquals(Array.indexSquareArray(5)[3],9);
    }
}