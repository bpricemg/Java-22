// An addition quiz for an elementary school student

import java.util.Scanner;

class AdditionQuiz {
    public static void main(String[] args) {
        // Create two random numbers
        int random1 = (int) (Math.random() * 10);
        int random2 = (int) (Math.random() * 10);

        // Ask the user what the answer is
        System.out.print("What is " + random1 + " + " + random2 + "? ");
        Scanner input = new Scanner(System.in);
        int answer = input.nextInt();

        // If they are correct
        if (random1 + random2 == answer) {
            // Congratulate the user
            System.out.println("Correct :)");
        }
        // If they are incorrect
        else {
            // Provide the correct answer
            System.out.println("Sorry, you are incorrect. The correct answer is " + (random1 + random2) + ".");
        }
    }
}