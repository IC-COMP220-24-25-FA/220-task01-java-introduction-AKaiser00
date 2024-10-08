package edu.ithaca.dragon.shapes;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class TriangleTest{

    @Test
    public void sampleTestThatPasses(){
        assertEquals("This test should pass", "This test should pass");
        assertTrue(8>5);
        assertFalse(8<5);
    }

    @Test
    public void constructorGettersTest(){
        Triangle myTriangle = new Triangle(3, 4, 5);
        assertEquals(3, myTriangle.getSideA());
        assertEquals(4, myTriangle.getSideB());
        assertEquals(5, myTriangle.getSideC());

        myTriangle = new Triangle(4, 2.5, 3.5);
        assertEquals(4, myTriangle.getSideA());
        assertEquals(2.5, myTriangle.getSideB(), 0.000001);
        assertEquals(3.5, myTriangle.getSideC(), 0.000001);
    }

    @Test
    public void constructorExceptionThrowTest(){
        assertThrows(IllegalArgumentException.class, () -> new Triangle(3, 2, -1));
        assertThrows(IllegalArgumentException.class, () -> new Triangle(5, 0, 10));
        assertThrows(IllegalArgumentException.class, () -> new Triangle(-2.5, 2, 5));

        assertThrows(IllegalArgumentException.class, () -> new Triangle(10, 2, 5));
        assertThrows(IllegalArgumentException.class, () -> new Triangle(3, 2, 6));
    }

    @Test
    public void calcAreaTest(){
        Triangle myTriangle = new Triangle(3, 4, 5);
        assertEquals(6, myTriangle.calcArea());

        myTriangle = new Triangle(6.5, 6.5, 6.5);
        assertEquals(18.295, myTriangle.calcArea(), 0.001);

        myTriangle = new Triangle(12, 10.25, 5.5);
        assertEquals(28.104, myTriangle.calcArea(), 0.001);
    }

    @Test
    public void doubleSizeTest(){
        Triangle myTriangle = new Triangle(3, 4, 5);
        myTriangle.doubleSize();
        assertEquals(12, myTriangle.calcArea(), 0.000001);

        myTriangle = new Triangle(6.5, 6.5, 6.5);
        myTriangle.doubleSize();
        assertEquals(36.58958, myTriangle.calcArea(), 0.0001);

        myTriangle = new Triangle(12, 10.25, 5.5);
        myTriangle.doubleSize();
        assertEquals(56.2074, myTriangle.calcArea(), 0.001);
    }

    @Test
    public void longestLineWithinTest(){
        Triangle myTriangle = new Triangle(3, 4, 5);
        assertEquals(5, myTriangle.longestLineWithin());

        myTriangle = new Triangle(6.5, 6.5, 6.5);
        assertEquals(6.5, myTriangle.longestLineWithin());

        myTriangle = new Triangle(10.75, 7, 4);
        assertEquals(10.75, myTriangle.longestLineWithin());
    }
}