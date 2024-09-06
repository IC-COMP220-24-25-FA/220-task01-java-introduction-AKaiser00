package edu.ithaca.dragon.shapes;

public class Triangle implements Shape{

    private double sideA;
    private double sideB;
    private double sideC;
    private double largestSide;

    /**
     * @throws IllegalArgumentException if any of the sides are not positive numbers
     * @throws IllegalArgumentException if the largest side is larger than the other two sides combined (triangle cannot be made)
     */
    public Triangle(double sideAIn, double sideBIn, double sideCIn){
        if (sideAIn <= 0 || sideBIn <= 0 || sideCIn <= 0){
            throw new IllegalArgumentException("All sides must be positive");
        }

        if (sideAIn >= sideBIn && sideAIn >= sideCIn){
            largestSide = sideAIn;
            if (largestSide >= (sideBIn + sideCIn)){
                throw new IllegalArgumentException("Largest side is larger than other two sides combined. Unable to make triangle.");
            }
        }
        else if (sideBIn >= sideAIn && sideBIn >= sideCIn){
            largestSide = sideBIn;
            if (largestSide >= (sideAIn + sideCIn)){
                throw new IllegalArgumentException("Largest side is larger than other two sides combined. Unable to make triangle.");
            }
        }
        else {
            largestSide = sideCIn;
            if (largestSide >= (sideAIn + sideBIn)){
                throw new IllegalArgumentException("Largest side is larger than other two sides combined. Unable to make triangle.");
            }
        }

        sideA = sideAIn;
        sideB = sideBIn;
        sideC = sideCIn;
    }

    /**
     * @return the area of the triangle
     */
    public double calcArea(){
        double semiPeri = (sideA + sideB + sideC) / 2;
        return Math.sqrt(semiPeri * (semiPeri - sideA) * (semiPeri - sideB) * (semiPeri - sideC));
    }

    /**
     * @post doubles the size of the triangle
     */
    public void doubleSize(){
        sideA = Math.sqrt(2) * sideA;
        sideB = Math.sqrt(2) * sideB;
        sideC = Math.sqrt(2) * sideC;
    }

    /**
     * @return the longest straight line that can be drawn in the triangle
     */
    public double longestLineWithin(){
        return largestSide;
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

    public String toString(){{
        return "Triangle: Side A = " + sideA + ", Side B = " + sideB + ", Side C = " + sideC;
    }}
}