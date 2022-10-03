import java.util.Scanner;

class ModCalculator {
    public static void main(String[] args) {
        // Start a scanner
        Scanner input = new Scanner(System.in);

        // Get first number
        System.out.print("Integer: ");
        int first = input.nextInt();

        // Get second (or mod) number
        System.out.print("Another integer: ");
        int second = input.nextInt();

        // Calculate the remainder
        int remainder = first % second;

        // Print the answer
        System.out.println("The remainder when dividing " + first + " by " + second + " is " + remainder + ".");
    }
}