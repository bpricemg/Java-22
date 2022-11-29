// Print the number of hashes provided by the user
import java.util.Scanner;

class Loop1 {
    public static void main(String[] args) {
        // Get a positive integer from the user
        Scanner input = new Scanner(System.in);
        int n;
        do {
            System.out.print("Positive nteger, please: ");
            n = input.nextInt();
        } while(n < 0);
        
        // Print the hashes
        for (int i = 0; i < n; i++) {
            System.out.print("#");
        }

        System.out.println();
    }
}