// Compare strings

import java.util.Scanner;

class Compare {
    public static void main(String[] args) {
        // Get two strings from the user
        Scanner input = new Scanner(System.in);

        System.out.print("String, please: ");
        String s1 = input.nextLine();

        System.out.print("Another string, please: ");
        String s2 = input.nextLine();

        // Determine if they are the same
        if (s1.equals(s2)) {
            System.out.println("These strings are the same!");
        }

        // Exluding case, determine if they are the same
        if (s1.equalsIgnoreCase(s2)) {
            System.out.println("These strings are the same when ignoring the case!");
        }

        // Compare to 
        if (s1.compareTo(s2) < 0) {
            System.out.println("The first is before the second in the dictionary");
        } else if (s1.compareTo(s2) > 0) {
            System.out.println("The first is after the second in the dictionary");
        } else {
            System.out.println("The first and second strings are the same!");
        }
    }
}