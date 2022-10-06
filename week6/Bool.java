// Determine if a number is positive

import java.util.Scanner;

class Bool {
    public static void main(String[] args) {
        // Get an integer from the user
        Scanner input = new Scanner(System.in);
        System.out.print("Number: ");
        int number = input.nextInt();

        // Determine if it's positive, print the result
        if (number > 0) {
            System.out.println(number + " is positive!");
        } else if (number < 0) {
            System.out.println(number + " is negative.");
        } else {
            System.out.println(number + " is neither positive or negative");
        }
    }
}