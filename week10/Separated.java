// Separate first, middle, and last name into separate strings

import java.util.Scanner;

class Separated {
    public static void main(String[] args) {
        // Prommpt the user for their full name
        Scanner input = new Scanner(System.in);
        System.out.print("Full name: ");

        // Note* input.next() only reads the next word
        String firstName = input.next();
        String middleName = input.next();
        String lastName = input.next();

        System.out.println("First name: " + firstName);
        System.out.println("Middle name: " + middleName);
        System.out.println("Last name: " + lastName);

        // We can concatenate with the + symbol
        String fullName = firstName + " " + middleName + " " + lastName;

        System.out.println("Full name: " + fullName);
        
    }
}