// An addition quiz for an elementary school student
// Keep asking until user gets the correct answer

import java.util.Scanner;

class AdditionQuiz2 {
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

            // Trying to get an int, if we don't skip over the error and try again
            // We can run into an issue if the user types space separated characters
            try {
                answer = input.nextInt();
            } catch (Exception e) {
                input.next(); // Advance the cursor to get ready to read they next try
            }

            // If they are incorrect
            if (random1 + random2 != answer) {
                System.out.println("Incorrect. Try again.\n");
            }
        } while(random1 + random2 != answer);

        
        // Congratulate the user
        System.out.println("Correct :)");
        
    }
}