// Print a block of hashes provided by the user
import java.util.Scanner;

class Loop4 {
    public static void main(String[] args) {
        // Get a positive integer from the user
        Scanner input = new Scanner(System.in);
        int n;
        do {
            System.out.print("Positive integer, please: ");

            // Be sure that the user provides an integer 
            // so the program doesn't crash
            while(!input.hasNextInt()) {
                input.next();
                System.out.print("Positive integer, please: ");
            }
            
            n = input.nextInt();
        } while(n < 0);
        
        // Print the hashes
        // Print n number of rows
        for (int i = 0; i < n; i++) {
            // Print n number of columns
            for (int j = 0; j < n; j++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }
}