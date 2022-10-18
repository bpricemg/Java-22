// A program to determine if a number is divisible by 2 and/or 3

import java.util.Scanner;

class Divisible {
    public static void main(String[] args) {
        // Start a scanner
        Scanner input = new Scanner(System.in);

        // Get an int from the user
        System.out.print("Input an integer, please: ");
        int answer = input.nextInt();

        // If divisible by 2 and 3
        if (answer % 2 == 0 && answer % 3 == 0) {
            System.out.println(answer + " is divisible by both 2 and 3");
        } 

        // Else if divisible by 2 or 3
        else if (answer % 2 == 0 || answer % 3 == 0) {
            System.out.println(answer + " is divisible by either 2 or 3, but not both");
        }

        // Else - it's not divisible by either 2 or 3
        else {
            System.out.println(answer + " is not divisible by 2 or 3");
        }
    }
}