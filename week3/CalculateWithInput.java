/**
 * Sample all of the native mathematical operations
 */
import java.util.Scanner;

class CalculateWithInput {
    public static void main(String[] args) {
        // Start a scanner
        Scanner input = new Scanner(System.in);
        
        // Ask the user to input an integer and save it
        System.out.print("Integer: ");
        int first = input.nextInt();

        // Ask the user for another integer and save it
        System.out.print("Another Integer: ");
        int second = input.nextInt();
        

        // Addition
        // Note**** An int plus and int is an int
        // An int plus a double is a double
        // A double plu a double is a double
        int sum = first + second;
        System.out.println(first + " plus " + second + " equals " + sum);

        // Subtraction
        int difference = first - second;
        System.out.println(first + " minus " + second + " equals " + difference);

        // Multiplication
        int product = first * second;
        System.out.println(first + " times " + second + " equals " + product);

        // Division
        // Note* an integer divided by an integer is an integer!!! This is floor
        // division
        // If we need a decimal, at least one needs to be an double
        double quotient = first / (double) second;
        System.out.println(first + " divided by " + second + " equals " + quotient);

        // Mod or Remainder
        int remainder = first % second;
        System.out.println("The remainder when " + first + " is divided by " + second + " is " + remainder);

    }
}