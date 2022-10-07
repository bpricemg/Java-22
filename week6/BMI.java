/**
 * A BMI Calculator
 */

import java.util.Scanner;

class BMI {
    public static void main(String[] args) {
        // Prompt user for the height and weight
        Scanner input = new Scanner(System.in);

        System.out.print("Height (in inches): ");
        double height = input.nextDouble();

        System.out.print("Weight (in pounds): ");
        double weight = input.nextDouble();

        // Calculate the BMI weight (lb) / [height (in)]^2 x 703
        double bmi = weight / Math.pow(height, 2) * 703;
        System.out.println(bmi);
        
        // Round to one decimal
        bmi = Math.round(bmi * 10) / 10.0;
        System.out.println(bmi);

        // Print the result
        // If below 18.5
        if (bmi < 18.5) {
            // Print "Underweight"
            
        }
        // If between 18.5 and 24.9
            // Print "Healthy Weight"
        // If between 25.0 and 29.9
            // Print "Overweight"
        // If above 30
            // Print "Obesity"
    }
}