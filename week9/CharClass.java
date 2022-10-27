// Determine if a letter is an uppercase or a lowercase

import java.util.Scanner;

class CharClass {
    public static void main(String[] args) {

        // Get user input
        Scanner input = new Scanner(System.in);
        System.out.print("Character, please: ");
        String c = input.nextLine();

        // Check to see if the user only inputs a single character
        // Quit the program if they do
        if (c.length() != 1) {
            System.out.println("Please input a single character. Try again.");
            System.exit(1);
        }

        // Convert the single character string to a character
        char ch = c.charAt(0);
    

        if (Character.isUpperCase(ch)) {
            System.out.println(ch + " is an uppercase letter");
        } else if (Character.isLowerCase(ch)) {
            System.out.println(ch + " is a lowercase letter");
        } else if (Character.isDigit(ch)) {
            System.out.println(ch + " is a numeric character");
        }
    }
}