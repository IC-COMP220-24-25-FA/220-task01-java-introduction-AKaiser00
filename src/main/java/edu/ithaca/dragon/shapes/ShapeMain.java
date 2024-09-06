package edu.ithaca.dragon.shapes;

import java.util.Scanner;
import java.awt.Rectangle;
import java.awt.Shape;
import java.text.DecimalFormat;

import java.util.ArrayList;
import java.util.List;

public class ShapeMain {
        public static void main(String[] args){

        DecimalFormat decForm = new DecimalFormat("0.000");

        //Interface Usage
        List<Shape> myShapes = new ArrayList<Shape>();
        for (int i=0; i<10; i++){
            double rand = Math.random() * 3;
            System.out.println(rand); 
            Shape myShape;
            if (rand < 1){
                //Rectangle
                double randomLength = (Math.random() * 100) + 1;
                double randomWidth = (Math.random() * 100) + 1;
                myShape = new Rectangle(randomLength, randomWidth);
            }
            else if (rand < 2){
                //Circle
                double randomRadius = (Math.random() * 100) + 1;
                myShape = new Circle(randomRadius);
            }
            else {
                //Triangle
                double randomSideA = (Math.random() * 100) + 1;
                double randomSideB = (Math.random() * 100) + 1;
                double randomSideC = (Math.random() * 100) + 1;
                myShape = new Triangle(randomSideA, randomSideB, randomSideC);
            }
            myShapes.add(myShape);
        }
        for (int i=0; i<10; i++){
            System.out.println(myShapes.get(i));
        }
        for (int i=0; i<10; i++){
            myShapes.get(i).doubleSize();
            System.out.println(myShapes.get(i));
        }

        //Make a list of 5 randomly-sized rectangles and print their area and the largest line that can be drawn through them
        //Allow the user to choose one, double the size of that one, and print them all again
        //Use a loop to repeat the process 5 times

        Scanner myScanner = new Scanner(System.in);

        double randomLength;
        double randomWidth;

        for (int i=0; i<5; i++){
            List<Rectangle> recList = new ArrayList<Rectangle>();
            if (i > 0){
                System.out.println("\n");
            }
            for (int j=0; j<5; j++){
                randomLength = (Math.random() * 100) + 1;
                randomWidth = (Math.random() * 100) + 1;
                recList.add(new Rectangle(randomLength, randomWidth));
            }
            System.out.println("\nBelow is a list of 5 randomly generated Rectangles");
            for (int k=0; k<5; k++){
                System.out.println("Rectangle " + k + ": Area = " + decForm.format(recList.get(k).calcArea()) + ", Longest Line = " + decForm.format(recList.get(k).longestLineWithin()));
            }
            System.out.println("\nChoose a Rectangle to double its size by typing in the number correlated with it. \nIf what is typed is not an integer between 0 and 4, the selection will be Rectangle 0.");
            while (!myScanner.hasNext()){}
            int rectangleChoice = 0;
            if (myScanner.hasNextInt()){
                rectangleChoice = myScanner.nextInt();
                if (rectangleChoice <= 0 || rectangleChoice >= 4){
                    rectangleChoice = 0;
                }
            }
            else {
                String clearInput = myScanner.next();
            }
            recList.get(rectangleChoice).doubleSize();
            System.out.println("\nBelow is the list of rectangles, with the one you chose doubled in size.");
            for (int k=0; k<5; k++){
                System.out.println("Rectangle " + k + ": Area = " + decForm.format(recList.get(k).calcArea()) + " Longest Line = " + decForm.format(recList.get(k).longestLineWithin()));
            }
        }
        myScanner.close();
    }
}
