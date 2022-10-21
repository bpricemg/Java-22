// Determines if the day number is a weekday or a weekend

import java.util.Scanner;

class Week {
    public static void main(String[] args) {
        // Start a scanner
        Scanner input = new Scanner(System.in);

        // Get the day number from the user
        System.out.print("Day number (0 through 6): ");
        int day = input.nextInt();

        // If a weekend
        if (day == 0 || day == 6) {
            System.out.println("Weekend!");
        }

        // Else if a weekday
        else if (day > 0 && day < 6) {
            System.out.println("Weekday :(");
        }

        // Else, error
        else {
            System.out.println("Error");
        }
    }
}