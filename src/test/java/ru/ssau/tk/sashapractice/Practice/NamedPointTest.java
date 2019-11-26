package ru.ssau.tk.sashapractice.Practice;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class NamedPointTest {
    NamedPoint firstPoint = new NamedPoint(1,2,3);
    NamedPoint secondPoint = new NamedPoint(1,2,3,"Points");
    NamedPoint thirdPoint = new NamedPoint(0,0,0,"Origin");
    @Test
    public void testGetName(){
        assertNull(firstPoint.getName());
        assertEquals(secondPoint.getName(),"Points");
        assertEquals(thirdPoint.getName(),"Origin");
    }
    @Test
    public void testSetName() {
        firstPoint.setName("First");
        assertEquals(firstPoint.getName(), "First");
        secondPoint.setName("Second");
        assertEquals(secondPoint.getName(), "Second");
        thirdPoint.setName(null);
        assertNull(thirdPoint.getName());
    }
    @Test
    public void oneConstructor() {
        assertEquals(firstPoint.x, 1);
        assertEquals(firstPoint.y, 2);
        assertEquals(firstPoint.z, 3);
    }
    @Test
    public void twoConstructor(){
        assertEquals(secondPoint.x,1);
        assertEquals(secondPoint.y,2);
        assertEquals(secondPoint.getName(), "Points");
    }
    @Test
    public void threeConstructor(){
        assertEquals(thirdPoint.x, 0);
        assertEquals(thirdPoint.z,0);
        assertEquals(thirdPoint.getName(), "Origin");
    }
}