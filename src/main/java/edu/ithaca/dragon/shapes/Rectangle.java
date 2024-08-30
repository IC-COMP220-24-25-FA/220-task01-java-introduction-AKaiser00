package edu.ithaca.dragon.shapes;

public class Rectangle {
    
    private double length;
    private double width;

    /**
     * @throws IllegalArgumentException if length or width is not a positive number
     */
    public Rectangle(double length, double width){
        if (length <= 0 || width <= 0){
            throw new IllegalArgumentException("length and width must be a positive number");
        }
        this.length = length;
        this.width = width;
    }

    /**
     * @return the area of the rectangle
     */
    public double calcArea(){
        return length * width;
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
        return length;
    }
    
    /**
     * @return width of the rectangle
     */
    public double getWidth(){
        return width;
    }
}
