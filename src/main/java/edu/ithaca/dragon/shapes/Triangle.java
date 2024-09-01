package edu.ithaca.dragon.shapes;

public class Triangle{

    private double sideA;
    private double sideB;
    private double sideC;

    /**
     * @throws IllegalArgumentException if any of the sides are not positive numbers
     */
    public Triangle(double sideAIn, double sideBIn, double sideCIn){
        sideA = sideAIn;
        sideB = sideBIn;
        sideC = sideCIn;
    }

    /**
     * @return the area of the triangle
     */
    public double calcArea(){
        throw new RuntimeException("Not implemented yet");
    }

    /**
     * @post doubles the size of the triangle
     */
    public void doubleSize(){
        throw new RuntimeException("Not implemented yet");
    }

    /**
     * @return the longest straight line that can be drawn in the triangle
     */
    public double longestLineWithin(){
        throw new RuntimeException("Not implemented yet");
    }

    /**
     * @return sideA of the triangle
     */
    public double getSideA(){
        return sideA;
    }

    /**
     * @return sideB of the triangle
     */
    public double getSideB(){
        return sideB;
    }

    /**
     * @return sideC of the triangle
     */
    public double getSideC(){
        return sideC;
    }
}