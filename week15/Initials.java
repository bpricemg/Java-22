// Update initials to accept any number of names and hyphenated names

import java.util.Scanner;

class Initials {
    public static void main(String[] args) {
        // Accept the user's name with a Scanner
        Scanner input = new Scanner(System.in);

        System.out.print("Name: ");
        String name = input.nextLine();

        // Print the first char in the name
        System.out.print(name.charAt(0));

        // Loop through the rest of the name
        for (int i = 1; i < name.length(); i++) {
            // If a space or a hyphen
            if (name.charAt(i) == ' ' || name.charAt(i) == '-') {
                // Print the next character
                System.out.print(name.charAt(i + 1));
            }
        }
        // New line
        System.out.println();
    }
}