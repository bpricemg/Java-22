// Get a positive number from the user

import java.util.Scanner;

class Positive {
    public static void main(String[] args) {
        // Start a scanner
        Scanner input = new Scanner(System.in);

        // Get a positive integer from the user
        int answer;
        do {
            System.out.print("Positive integer, please: ");
            answer = input.nextInt();
        } while (answer <= 0);

        // Confirm the user's choice
        System.out.printf("You chose the number %d\n", answer);
    }

}