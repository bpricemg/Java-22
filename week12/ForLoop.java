// Test out different for loops

import java.util.concurrent.TimeUnit;

class ForLoop {
    public static void main(String[] args) {
        // Print "Welcome to Java" 5 times
        // Note* i starts at 0 and i++ increases the value of i by 1
        for (int i = 0; i < 5; i++) {
            System.out.println("Welcome to Java");
        }

        System.out.println();

        // Print the even numbers up to 20
        // Note* i += 2 increments by 2
        for (int i = 0; i <= 20; i += 2) {
            System.out.println(i);
        }

        System.out.println();

        // For loop that counts down
        // Note* i-- subtracts 1 from the current value of i
        for (int i = 10; i > 0 ;i--) {
            System.out.println(i);

            // Sleep for one second
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Blast off!");
    }
}