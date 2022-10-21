// Determine if a year is a leap year

import java.util.Scanner;

class LeapYear {
    public static void main(String[] args) {
        // Start a scanner
        Scanner input = new Scanner(System.in);

        // Get the year from the user
        System.out.print("Year: ");
        int year = input.nextInt();

        // Determine if a leap year
        // https://learn.microsoft.com/en-us/office/troubleshoot/excel/determine-a-leap-year
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println("Leap year");
        } else {
            System.out.println("Not a leap year");
        }
    }
}