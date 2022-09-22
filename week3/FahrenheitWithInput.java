
// Converts Fahrenheit to Celcius
import java.util.Scanner;

class FahrenheitWithInput {
    public static void main(String[] args) {
        // Ask the user for the Fahrenheit temp
        System.out.print("Fahrenheit: ");

        // Get the users input and save it
        Scanner input = new Scanner(System.in);
        double f = input.nextDouble();

        // Convert with formula
        // Subtract 32 then multiply by 5 / 9
        double c = (f - 32) * (5 / 9.0);

        // Print the C value
        System.out.println("The Celsius equivalent to " + f + " Fahrenheit is " + c + ".");
    }
}