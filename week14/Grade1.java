// Print out a student's grade as a letter

import java.util.Scanner;

class Grade1 {
    public static void main(String[] args) {
        // Ask the user for their number grade
        Scanner input = new Scanner(System.in);
        System.out.print("Number grade: ");
        int grade = input.nextInt();

        // Print out the letter grade by calling printLetterGrade()
        printLetterGrade(grade);
    }

    /** A method that prints the letter grade given a number grade */
    public static void printLetterGrade(int score) {
        if (score >= 90) {
            System.out.println("Your letter grade is an A");
        } else if (score >= 80) {
            System.out.println("Your letter grade is a B");
        } else if (score >= 70) {
            System.out.println("Your letter grade is a C");
        } else if (score >= 60) {
            System.out.println("Your letter grade is a D");
        } else {
            System.out.println("Your letter grade is an F");
        }
    }
}