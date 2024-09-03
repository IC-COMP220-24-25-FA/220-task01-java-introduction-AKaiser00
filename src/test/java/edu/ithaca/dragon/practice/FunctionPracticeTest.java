package edu.ithaca.dragon.practice;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

public class FunctionPracticeTest {

    @Test
    public void largestOfThreeTest(){
        // Tests to make sure that it finds largest from each position
        assertEquals(5, FunctionPractice.largestOfThree(4, 5, 2));
        assertEquals(5, FunctionPractice.largestOfThree(5, 4, 2));
        assertEquals(5, FunctionPractice.largestOfThree(4, 2, 5));
        // Test to make sure that it finds largest when all positions have same value
        assertEquals(5, FunctionPractice.largestOfThree(5, 5, 5));

        // Test to make sure it throws an exception when all numbers are negative
        assertThrows(IllegalArgumentException.class, () -> FunctionPractice.largestOfThree(-1, -1, -1));
        // Test to make sure it throws an exception when at least one of the numbers are negative
        assertThrows(IllegalArgumentException.class, () -> FunctionPractice.largestOfThree(5, -1, 3));
        assertThrows(IllegalArgumentException.class, () -> FunctionPractice.largestOfThree(5, 3, -1));
    }

    @Test
    public void calcSalePriceTest(){
        assertEquals(84, FunctionPractice.calcSalePrice(100, 20, 5));
        assertEquals(0, FunctionPractice.calcSalePrice(100, 100, 8));
        assertEquals(50, FunctionPractice.calcSalePrice(50, 0, 0));
        assertEquals(75, FunctionPractice.calcSalePrice(60, 0, 25));
        assertEquals(0, FunctionPractice.calcSalePrice(0, 20.32, 5.32));
    }

    @Test
    public void isGoodDogTest(){
        assertTrue(FunctionPractice.isGoodDog(8, 4, true));
        assertTrue(FunctionPractice.isGoodDog(10, 0, false));
        assertTrue(FunctionPractice.isGoodDog(1, 0, false));
        
        assertFalse(FunctionPractice.isGoodDog(4, 0, true));
        assertFalse(FunctionPractice.isGoodDog(6, 4, false));
        assertFalse(FunctionPractice.isGoodDog(5, 2, true));
    }
}
