package practice.Ktalk;

import java.util.Arrays;

public class Star1 {
   public static void main(String[] args) {
    int[] numbers = {1, 2, 3, 4, 5};
        int evenSum = 0;
        int oddSum = 0;

        for (int number : numbers) {
            if (number % 2 == 0) {
                evenSum += number;
            } else {
                oddSum += number;
            }
        }
 
        int[] sums = {evenSum, oddSum};
        System.out.println(Arrays.toString(sums));
}}