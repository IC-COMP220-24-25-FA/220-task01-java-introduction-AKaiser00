package edu.ithaca.dragon.shapes;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class RectangleTest {

    @Test
    public void sampleTestThatPasses(){
        assertEquals("This test should pass", "This test should pass");
        assertTrue(8>5);
        assertFalse(8<5);
    }

    @Test
    public void constructorGettersTest(){
        Rectangle myRectangle = new Rectangle(10, 10);
        assertEquals(10, myRectangle.getLength());
        assertEquals(10, myRectangle.getWidth());

        myRectangle = new Rectangle(9.5, 11);
        assertEquals(9.5, myRectangle.getLength());
        assertEquals(11, myRectangle.getWidth());
    }

    @Test
    public void testConstructorError(){
        assertThrows(IllegalArgumentException.class, () -> new Rectangle(0, 10));
        assertThrows(IllegalArgumentException.class, () -> new Rectangle(3, -1));
    }

    @Test
    public void calcAreaTest(){
        Rectangle myRectangle = new Rectangle(10, 10);
        assertEquals(100, myRectangle.calcArea());

        myRectangle = new Rectangle(5.5, 7.5);
        assertEquals(41.25, myRectangle.calcArea(), 0.00001);
    }

    @Test
    public void doubleSizeTest(){
        Rectangle myRectangle = new Rectangle(10, 10);
        myRectangle.doubleSize();
        assertEquals(200, myRectangle.calcArea(), 0.0001);

        myRectangle = new Rectangle(5.5, 7.5);
        myRectangle.doubleSize();
        assertEquals(82.5, myRectangle.calcArea(), 0.0001);
    }
}
