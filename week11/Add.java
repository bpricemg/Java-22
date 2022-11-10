// Display the sum from 0 to to a user input

import java.util.Scanner;

class Add {
    public static void main(String[] args) {
        // Ask the user for an integer
        Scanner input = new Scanner(System.in);
        System.out.print("Upper Bound: ");
        int upperBound = input.nextInt();
        
        // Initialize variables
        int count = 0;
        int sum = 0;

        // Loop over the numbers 0 to upperBound
        while (count < upperBound) {
            // Add the count to the sum
            sum += count;

            // Increase the count by 1
            count++;
        }

        // Print the sum
        System.out.println("The sum is: " + sum);
    }
}