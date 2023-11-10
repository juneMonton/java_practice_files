import java.util.*;

public class Return {
    // Global Variables

    public static void main(String[] args) {

        int product =add(5, 2);
        System.out.println(product);

        System.out.println(isLegalAge(15));

    }

    static int add(int num1, int num2) {
        return num1 + num2;
    }

    static int subtract(int num1, int num2) {
        return num1 - num2;
    }

    static int product(int num1, int num2) {
        return num1 * num2;
    }

    static int quotient(int num1, int num2) {
        return num1 / num2;
    }

    static boolean isLegalAge(int age){
        if(age>=18)return true;
        else return false;
    }
}

/*
 * 
 * ----NOTES-----
 * 
 * Return keyword is used to return a value from the method. it is used when a
 * method has a result
 * 
 * Return Type
 * The type of the value that will be returned, return type are same as the
 * datatypes
 * 
 * void returns Nothing
 * int returns integers
 * String returns strings
 * 
 * ----SYNTAX----
 * 
 * modifiers returntype methodName(arguments){
 * 
 * 
 * return value;
 * }
 * 
 * 
 * 
 */
