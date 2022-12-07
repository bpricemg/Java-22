class Careful {
    public static void main(String[] args) {
        // Initilize x
        int x = 1;

        // Print the current value
        System.out.println("The value of x is " + x);

        // Method call to increment 
        increment(x); // WE ARE NOT SAVING THE UPDATED VALUE

        // The value after the call
        System.out.println("The value of x is " + x);
    }

    /** A method that increments a value by 1 */
    public static void increment(int n) {
        n++;

        System.out.println("The value of x in the method is " + n);

        // WE ARE NOT RETURNING ANYTHING
    }
}