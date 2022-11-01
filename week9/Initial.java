// Save a user's initials

import java.util.Scanner;

class Initial {
    public static void main(String[] args) {
        // Start a scanner
        Scanner input = new Scanner(System.in);

        // Prompt the user for their first initial
        System.out.print("First initial: ");

        String initial = input.nextLine(); // Note* must save user input as a String

        // Be sure the user only provided a single character
        if (initial.length() != 1) {
            // Print an error
            System.out.println("Error - input a single character");

            // Quit the program
            System.exit(1);
        }

        // Save the single element String as as a character
        char firstInitial = initial.charAt(0);

        // If character is not a letter
        if (!Character.isLetter(firstInitial)) {
            // Print error
            System.out.println("Error - input a letter");

            // Quit
            System.exit(2);
        }

        // Make sure the letter is saved as a captial letter
        firstInitial = Character.toUpperCase(firstInitial);

        // Print a confirmation
        System.out.println("Your first initial has been saved as " + firstInitial);
    }
}