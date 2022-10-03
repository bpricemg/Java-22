import java.util.Scanner;

class Chomp {
    public static void main(String[] args) {
        // Start a scanner
        Scanner input = new Scanner(System.in);

        // Get an integer from the user
        System.out.print("Integer, please: ");
        int number = input.nextInt();

        // Access the last digit of the number that was input
        int lastDigit = number % 10;
        System.out.println("The last digit is " + lastDigit + ".");

        // Chomp off the last digit
        // number - (number - lastDigit) / 10
        number = number / 10; // Leverages the idea that an int / int = int
        System.out.println("The number after removing the last digit is " + number);

    }
}