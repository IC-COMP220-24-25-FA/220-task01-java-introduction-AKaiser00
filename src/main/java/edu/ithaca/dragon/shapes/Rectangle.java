package edu.ithaca.dragon.shapes;

public class Rectangle {
    
    private double length;
    private double width;

    /**
     * @throws IllegalArgumentException if length or width is not a positive number
     */
    public Rectangle(double length, double width){

    }

    /**
     * @return the area of the rectangle
     */
    public double calcArea(){
       throw new RuntimeException("Not implemented yet");
    }

    /**
     * @post doubles the size of the rectangle
     */
    public void doubleSize(){
        throw new RuntimeException("Not implemented yet");
    }

    /**
     * @return the longest straight line that can be drawn in the rectangle
     */
    public double longestLineWithin(){
        throw new RuntimeException("Not implemented yet");
    }
    
    /**
     * @return length of the rectangle
     */
    public double getLength(){
        throw new RuntimeException("Not implemented yet");
    }
    
    /**
     * @return width of the rectangle
     */
    public double getWidth(){
        throw new RuntimeException("Not implemented yet");
    }
}
