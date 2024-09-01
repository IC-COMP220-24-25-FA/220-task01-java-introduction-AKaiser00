package edu.ithaca.dragon.shapes;

import java.util.Scanner;
import java.text.DecimalFormat;

public class ShapeMain {
    
    public static void main(String[] args){
        //Make a list of 5 randomly-sized rectangles and print their area and the largest line that can be drawn through them
        //Allow the user to choose one, double the size of that one, and print them all again
        //Use a loop to repeat the process 5 times

        Scanner myScanner = new Scanner(System.in);
        DecimalFormat decForm = new DecimalFormat("0.000");

        double randomLength;
        double randomWidth;

        for (int i=0; i<5; i++){
            Rectangle[] recList = new Rectangle[5];
            if (i > 0){
                System.out.println("\n");
            }
            for (int j=0; j<5; j++){
                randomLength = (Math.random() * 100) + 1;
                randomWidth = (Math.random() * 100) + 1;
                recList[j] = new Rectangle(randomLength, randomWidth);
            }
            System.out.println("\nBelow is a list of 5 randomly generated Rectangles");
            for (int k=0; k<5; k++){
                System.out.println("Rectangle " + k + ": Area = " + decForm.format(recList[k].calcArea()) + ", Longest Line = " + decForm.format(recList[k].longestLineWithin()));
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
            recList[rectangleChoice].doubleSize();
            System.out.println("\nBelow is the list of rectangles, with the one you chose doubled in size.");
            for (int k=0; k<5; k++){
                System.out.println("Rectangle " + k + ": Area = " + decForm.format(recList[k].calcArea()) + " Longest Line = " + decForm.format(recList[k].longestLineWithin()));
            }
        }
        myScanner.close();
    }
}
