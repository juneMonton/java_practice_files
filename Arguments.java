import java.util.*;

public class Arguments {
    // Global Variables

    public static void main(String[] args) {

        print("Hello");
        print("Hi There");

        String x = "David";// This is a local variable
        print("Hello," + x);// x can be accessed since it is a called inside the same method

        add(5, 10);

        greet("June", 33);

    }

    static void print(String word) {// inside the parethesis we can put the arguments or parameters

        System.out.println(word);
    }

    static void add(int num1, int num2) {
        System.out.println(num1 + num2);
    }

    static void greet(String name, int age) {// you can mix data types when adding parameters
        System.out.println("Hello, " + name);
        System.out.println("You are, " + age + " Years Old.");
    }

}

/*
 * 
 * ----NOTES-----
 * 
 * Global Variables-are variables declared within a class, it can be accessed
 * within the whole class
 * 
 * Local Variables-are variables declared inside a method, condition, loops and
 * any other block of code, it can only be accessible within that block of code
 * 
 * 
 */
