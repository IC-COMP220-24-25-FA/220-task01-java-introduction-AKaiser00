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
        length = length * Math.sqrt(2);
        width = width * Math.sqrt(2);
    }

    /**
     * @return the longest straight line that can be drawn in the rectangle
     */
    public double longestLineWithin(){
        double length_sq = Math.pow(length, 2);
        double width_sq = Math.pow(width, 2);
        return Math.sqrt(length_sq + width_sq);
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

    public String toString(){
        return "Rectangle: Length = " + length + ", Width = " + width;
    }
}
