import java.util.*;

public class SummationPractice {
    // Global Variables

    public static void main(String[] args) {
        int numbers[] = { 1, 2, 3, 4, 5 };
        int result = summation(numbers);
        System.out.println(result);

    }

    static int summation(int numbers[]) {
        int sum = 0;
        for (int number : numbers) {
            sum = sum + number;
        }
        return sum;
    }

}

/*
 * 
 * ----INSTRUCTIONS-----
 * 
 * Create a program that has a method named summation it needs to accept an
 * array of integers then return the sum of the given array
 * 
 * PS: Display the SUM outside of the method
 * 
 */
