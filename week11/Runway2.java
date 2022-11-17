import java.util.Scanner;

public class Runway2 {
    public static void main(String[] ags) {
        // Create scanner
        Scanner input = new Scanner(System.in);

        // Enter the speed
        double v; // Initialized outside of the do-while loop for proper scope
        do {
            // Prompts the user for the input
            System.out.print("Enter the speed (in meters/second): ");

            // Protects the program from crashing if the user doesn't provide a double
            while (!input.hasNextDouble()) {
                System.out.println("Try again.\n");
                input.next();
                System.out.print("Enter the speed (in meters/second): ");
            }

            // Reads the double from the user
            v = input.nextDouble();
        } while (v < 0); // Reprompts if negative (ensures a postive input)

        // Enter the acceleration
        double a; // Initialized outside of the do-while loop for proper scope
        do {
            // Prompts the user for the input
            System.out.print("Enter the acceleration (in meters/second squared): ");

            // Protects the program from crashing if the user doesn't provide a double
            while (!input.hasNextDouble()) {
                System.out.println("Try again.\n");
                input.next();
                System.out.print("Enter the acceleration (in meters/second squared): ");
            }

            // Reads the double from the user
            a = input.nextDouble();
        } while (a < 0); // Reprompts if negative (ensures a postive input)

        // Print result
        double runwayLength = Math.pow(v, 2) / (2 * a);
        System.out.println("The minimum runway length for this airplane is " + runwayLength + " meters");
    }
}