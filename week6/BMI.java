
/**
 * A BMI Calculator
 * 
 * https://www.cdc.gov/healthyweight/assessing/bmi/adult_bmi/english_bmi_calculator/bmi_calculator.html
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
        // System.out.println(bmi);
        
        // Round to one decimal

        // System.out.println(bmi);

        // Print the result
        // If below 18.5
        if (bmi < 18.5) {
            // Print "Underweight"
            System.out.println("Underweight");
        }
        // If between 18.5 and 24.9
        else if (bmi >= 18.5 && bmi < 25) {
            // Print "Healthy Weight"
            System.out.println("Healthy Weight");
        }
        // If between 25.0 and 29.9
        else if (bmi >= 25 && bmi < 30) {
            // Print "Overweight"
            System.out.println("Overweight");
        }
        // If greater than or equal to 30
        else {
            // Print "Obesity"
            System.out.println("Obesity");
        }
    }
}