package edu.ithaca.dragon.practice;

import java.util.List;

public class FunctionPractice {

    /**
     * @return the largest of the 3 numbers
     * @throws IllegalArgumentException if any of the numbers is negative
     */
    public static int largestOfThree(int first, int second, int third){
        if (first < 0 || second < 0 || third < 0){
            throw new IllegalArgumentException("Numbers cannot be negative");
        }
        else {
            if (first >= second && first >= third){
               return first;
            }
            else if (second >= first && second >= third){
                return second;
            }
            else{
                return third;
            }
        }
    }
    
    /**
     * @return the final price at register of the given item after discount and tax applied
     */
    public static double calcSalePrice(double originalPrice, double discountPercent, double salesTax){
        discountPercent = discountPercent / 100;
        salesTax = salesTax / 100;
        double priceDiscounted = originalPrice - (discountPercent * originalPrice);
        double finalPrice = priceDiscounted + (salesTax * priceDiscounted);
        return finalPrice;
    }

    /**
     * @return true if the data collected shows the dog is good, false if bad dog today
     * Dog is always good if more than 9 years old or is 1 year old
     * Dog is bad if shoes have been chewed less than 4 days ago
     * Dog is bad if not fetched the paper
     */
    public static boolean isGoodDog(int yearsOld, int daysSinceShoesChewed, boolean fetchedThePaperToday){
        if (yearsOld >= 10 || yearsOld == 1){
            return true;
        }
        else if (daysSinceShoesChewed < 4 || !fetchedThePaperToday){
            return false;
        }
        else {
            return true;
        }
    }

    /**
     * @return the index of the largest number in the list, or -1 if the list is empty.
     * If the largest number occurs more than once, return the index of the first occurence.
     */
    public static int findFirstLargest(List<Integer> numbers){
        if (numbers.size() == 0){
            return -1;
        }
        int largestNum = numbers.get(numbers.size()-1);
        int largestNumIndex = numbers.size()-1;
        for (int i = numbers.size()-2; i >= 0; i--){
            if (numbers.get(i) >= largestNum){
                largestNum = numbers.get(i);
                largestNumIndex = i;
            }
        }
        return largestNumIndex;
    }

    /**
     * @return the index of the largest number in the list, or -1 if the list is empty.
     * If the largest number occurs more than once, return the index of the last occurence.
     */
    public static int findLastLargest(List<Integer> numbers){
        if (numbers.size() == 0){
            return -1;
        }
        int largestNum = numbers.get(0);
        int largestNumIndex = 0;
        for (int i = 0; i <= numbers.size()-1; i++){
            if (numbers.get(i) >= largestNum){
                largestNum = numbers.get(i);
                largestNumIndex = i;
            }
        }
        return largestNumIndex;
    }

    /**
     * @return the string that has contains the most occurences of the given letter, or null if the list is empty.
     * If the letter occurs the same amount in multiple strings, return the string in the earliest index
     * If the letter does not show up in any strings, will return the first string in the list (has most occurences at 0, and is first)
     */
    public static String findFirstMostOccurencesOfLetter(List<String> words, char letter){
        throw new RuntimeException("Not Implemented");
    }


}
