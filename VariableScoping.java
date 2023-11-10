import java.util.*;

public class VariableScoping {
    // Global Variables
    static String section = "A";
    static int num = 100;

    public static void main(String[] args) {
        String greetings = "Whats up";

        greet();// this can't be called because the greetings was declared in the main method
                // and not in the greet method

        greetAgain();// this will work because the greetings is declared inside the greetAgain method
        saySection();
        AddNumnbers();

    }

    static void greet() {
        System.out.println(greetings);
    }

    static void greetAgain() {
        String greetings = "Whats up";// local variable
        System.out.println(greetings);
    }

    static void saySection() {
        System.out.println(section);// section variable can still be accessed here because section is a Global
                                    // variable as it was declared in the class

    }

    static void AddNumbers() {
        System.out.println(num + num);
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
