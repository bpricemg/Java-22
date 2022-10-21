// Determines if the day number is a weekday or a weekend

import java.util.Scanner;

class Switch {
    public static void main(String[] args) {
        // Start a scanner
        Scanner input = new Scanner(System.in);

        // Get the day number from the user
        System.out.print("Day number (0 through 6): ");
        int day = input.nextInt();

        // Switch
        switch(day) {
            case 0: 
            case 6:
                System.out.println("Weekend!");
                break;
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Weekday :(");
                break;
            default:
                System.out.println("Error");
        }
    }
}