// Calculate sales tax in Massachusetts

import java.util.Scanner;

class SalesTax {
    public static void main(String[] args) {
        // Start a scanner
        Scanner input = new Scanner(System.in);
        
        // Ask user for subtotal of taxable items
        System.out.print("Subtotal: $");
        double subtotal = input.nextDouble();

        // Find the sales tax (6.25%)
        double tax = subtotal * .0625;
        double total = subtotal + tax;

        // Print the total
        System.out.println("The total with MA sales tax is $" + total);
    }
}

