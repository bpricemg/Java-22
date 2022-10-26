// Determine if a letter is an uppercase or a lowercase

import java.util.Scanner;

class CharClass {
    public static void main(String[] args) {

        // Get user input
        Scanner input = new Scanner(System.in);
        System.out.print("Character, please: ");
        char ch = input.next // :(
        

        if (Character.isUpperCase(ch)) {
            System.out.println(ch + " is an uppercase letter");
        } else if (Character.isLowerCase(ch)) {
            System.out.println(ch + " is a lowercase letter");
        } else if (Character.isDigit(ch)) {
            System.out.println(ch + " is a numeric character");
        }
    }
}