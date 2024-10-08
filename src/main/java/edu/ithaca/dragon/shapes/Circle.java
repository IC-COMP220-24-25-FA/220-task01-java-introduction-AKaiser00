package edu.ithaca.dragon.shapes;

public class Circle implements Shape {
    
    private double radius;

    /**
     * @throws IllegalArgumentException if radius is not a positive number
     */
    public Circle(double radius){
        if (radius <= 0){
            throw new IllegalArgumentException("radius must be a positive number");
        }
        else{
            this.radius = radius;
        }
    }

    /**
     * @return the area of this circle
     */
    public double calcArea(){
        return Math.PI * Math.pow(radius, 2);
    }

    /**
     * @post doubles the size of this circle
     */
    public void doubleSize(){
        radius = radius * Math.sqrt(2);
    }

    /**
     * @return the longest straight line that can be drawn within this circle
     */
    public double longestLineWithin(){
        return radius * 2;
    }

    /**
     * @return the radius of this circle
     */
    public double getRadius(){
        return radius;
    }

    public String toString(){
        return "Circle: Radius = " + radius;
    }
}
