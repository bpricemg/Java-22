// Determine if a number is even

import java.util.Scanner;

class Even {
    public static void main(String[] args) {
        // Get an integer from the user
        Scanner input = new Scanner(System.in);
        System.out.print("Number: ");
        int number = input.nextInt();

        // Check if number is even, print result
        // A number is even if the remainder when dividing by 2 is 0
        if (number % 2 == 0) {
            System.out.println(number + " is even!");
        } else {
            System.out.println(number + " is odd!");
        }

    }
}