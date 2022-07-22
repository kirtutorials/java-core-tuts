import java.util.Scanner;

public class FunctionDefinitions {
    /**
     * function - set of instructions can be re-used
     * priciple - divive and conquer
     *  - Marriage Event ->
     *      - split the Main Event into subtask
     *      - we can improve re-usablity
     *
     * Function/method has two parts
     *  1. definitions
     *  2. usage: calling/invoking
     *
     *
     *  Object - properties + behavaiours
     *  dog = eyes[2] + barking(),
     *
     *
     */

    static int x = 200;

    public static void main(String[] args) {
        // variable declaration
        int a;
        int b;

        while(true) {
            System.out.println("Enter A and B values: ");
            Scanner input =  new Scanner(System.in);
            a = input.nextInt();
            b = input.nextInt();

            addition(a, b);
            addition(a, b, 5); // y = mx +dy  + c
            subtraction(a, b);
            multiplication(a, b);
            division(a, b);
//            System.out.println(x);
            scopeDefinition();
        }
    }

    // declaration of function
    private static void addition(int a, int b) {
        System.out.println("Addition of a and b: " + ( a + b));
    }

    private static void addition(int a, int b, int c) {
        System.out.println("Addition of a and b: " + ( a + b + c));
    }

    private static void subtraction(int a, int b) {
        System.out.println("subtraction of a and b: " + ( a - b));
    }

    private static void multiplication(int a, int b) {
        System.out.println("multiplication of a and b: " + ( a * b));
    }

    private static void division(int a, int b) {
        System.out.println("division of a and b: " + ( a / b));
    }

    private static void scopeDefinition() {
        int x = 100;
        System.out.println("Local Scope: " + x);
    }
}

