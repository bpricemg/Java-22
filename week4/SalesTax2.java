// Calculate sales tax in Massachusetts

import java.util.Scanner;

class SalesTax2 {
    public static void main(String[] args) {
        // Start a scanner
        Scanner input = new Scanner(System.in);

        // Ask user for subtotal of taxable items
        System.out.print("Subtotal: $");
        double subtotal = input.nextDouble();

        // Find the sales tax (6.25%)
        double tax = subtotal * .0625;
        double total = subtotal + tax;

        // Round the total to dollars and cents
        total = Math.round(total * 100) / 100.0;

        // Print the total
        System.out.println("The total with MA sales tax is $" + total);
    }


