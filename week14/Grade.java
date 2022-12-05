// Print out a student's grade as a letter

import java.util.Scanner;

class Grade {
    public static void main(String[] args) {
        // Test gradeToLetter()
        //System.out.println("An 85% is a " + gradeToLetter(85));
        //System.out.println("A 93% is a " + gradeToLetter(93));
        //System.out.println("A 76% is a " + gradeToLetter(76));
        //System.out.println("A 62% is a " + gradeToLetter(62));
        //System.out.println("A 50% is a " + gradeToLetter(50));

        // Ask the user for their number grade
        Scanner input = new Scanner(System.in);
        System.out.print("Number grade: ");
        int grade = input.nextInt();

        // Print out the letter grade by calling gradeToLetter()
        System.out.println("Your letter grade is a(n) " + gradeToLetter(grade));
    }

    /** A method that returns the letter grade given a number grade */
    public static char gradeToLetter(int score) {
        if (score >= 90) {
            return 'A';
        } else if (score >= 80) {
            return 'B';
        } else if (score >= 70) {
            return 'C';
        } else if (score >= 60) {
            return 'D';
        } else {
            return 'F';
        }
    }
}