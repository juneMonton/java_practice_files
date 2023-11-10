import java.util.*;

public class Methods {
    public static void main(String[] args) { // Methods will only run in the main class
        sayHi();
        sayHello();
    }

    // creating methods
    /*
     * Syntax
     * 
     * modifiers returntype methodName(){
     * 
     * (do anything here)
     * }
     */
    static void sayHello() {
        System.out.println("Hello");
    }

    static void sayHi() {
        System.out.println("Hi");
    }

}