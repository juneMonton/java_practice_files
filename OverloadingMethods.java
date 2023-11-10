import java.util.*;

public class OverloadingMethods {
    // Global Variables

    public static void main(String[] args) {
        System.out.println(add(5, 2));
        System.out.println(add(5, 4, 2));
        System.out.println(add(5.2, 2.3, 2));

    }

    static int add(int num1, int num2) {
        return num1 + num2;
    }

    static int add(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }

    static double add(double num1, double num2, double num3) {
        return num1 + num2 + num3;
    }

}

/*
 * 
 * ----NOTES-----
 * 
 * Overloading Methods
 * same method name but different parameters
 * 
 */
