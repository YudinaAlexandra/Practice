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
    @Test
    public void testQuadraticEquationArray() {
        double[] oneQuadraticEquationArray = Array.quadraticEquationArray(1, -2, -3);
        assertEquals(oneQuadraticEquationArray[0], -1, 0.0001);
        assertEquals(oneQuadraticEquationArray[1], 3, 0.0001);
        double[] twoQuadraticEquationArray = Array.quadraticEquationArray(0, -2, -5);
        assertEquals(twoQuadraticEquationArray[0], -5.0 / 2, 0.0001);
        assertEquals(Array.quadraticEquationArray(0, 0, 5).length, 0);
        double[] treeQuadraticEquationArray = Array.quadraticEquationArray(-9, 6, -1);
        assertEquals(treeQuadraticEquationArray[0], 1.0 / 3, 0.0001);
        assertEquals(Array.quadraticEquationArray(7, -1, 2).length, 0);
    }
    @Test
    public void testNotDivisibleByThreeArray(){
     assertEquals(Array.notDivisibleByThreeArray(10)[0],1);
     assertEquals(Array.notDivisibleByThreeArray(10)[1],2);
     assertEquals(Array.notDivisibleByThreeArray(10)[2],4);
    }
    @Test
    public void testArithmeticProgressionArray(){
        assertEquals(Array.arithmeticProgressionArray(5,1,1)[1],2);
        assertEquals(Array.arithmeticProgressionArray(5,1,3)[1], 4);
        assertEquals(Array.arithmeticProgressionArray(5,7,0)[1], 7);
    }
    @Test
    public void testGeometryProgressionArray(){
        assertEquals(Array.geometryProgressionArray(5,1,2)[1], 2);
        assertEquals(Array.geometryProgressionArray(5,5,3)[1], 15);
        assertEquals(Array.geometryProgressionArray(5,1,0.1)[1], 0.1);
    }
    @Test
    public void testSymmetricArray(){
        assertEquals(Array.symmetricArray(7)[1], 2);
        assertEquals(Array.symmetricArray(7)[3], 4);
        assertEquals(Array.symmetricArray(7)[6], 1);
    }
    @Test
    public void testOppositeArray(){
        double[] array = new double[]{-1.2, 2.5, -3.8, 4.2};
        Array.oppositeArray(array);
        assertEquals(array[0], 1.2, 0.0001);
        assertEquals(array[1], -2.5, 0.0001);
        assertEquals(array[2], 3.8, 0.0001);
        assertEquals(array[3], -4.2, 0.0001);
    }
    @Test
    public void testContainedInArray() {
        double[] array = new double[]{1.2, 2.5, 3.8};
        double firstNumber = 2.5;
        double secondNumber = 26.9;
        assertTrue(Array.containedInArray(array, firstNumber));
        assertFalse(Array.containedInArray(array, secondNumber));
    }
}