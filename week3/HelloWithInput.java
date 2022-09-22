
// Says hello to a user
import java.util.Scanner;

class HelloWithInput {
    public static void main(String[] args) {
        // Start a Scanner
        Scanner input = new Scanner(System.in);
        
        // Get the user's name
        System.out.print("Name: ");
        String name = input.nextLine();

        // Say hello
        System.out.println("hello, " + name);
    }
}