// An addition quiz for an elementary school student
// Keep asking until user gets the correct answer

import java.util.Scanner;

class AdditionQuiz3 {
    public static void main(String[] args) {
        // Create two random numbers
        int random1 = (int) (Math.random() * 10);
        int random2 = (int) (Math.random() * 10);

        // Start a scanner
        Scanner input = new Scanner(System.in);

        // Ask the user what the answer is (the answer can never be -1)
        int answer = -1;
        do {
            System.out.print("What is " + random1 + " + " + random2 + "? ");

            // Protect the program from recieving input that is not an integer
            while (!input.hasNextInt()) {
                System.out.println("Please enter an integer for an answer.\n");
                input.next();
                System.out.print("What is " + random1 + " + " + random2 + "? ");
            }

            // Collect the integer from the user's input
            answer = input.nextInt();

            // If they are incorrect
            if (random1 + random2 != answer) {
                System.out.println("Incorrect. Try again.\n");
            }
        } while (random1 + random2 != answer);

        // Congratulate the user
        System.out.println("Correct :)");

    }
}