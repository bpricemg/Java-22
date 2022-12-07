class Careful1 {
    public static void main(String[] args) {
        // Initilize x
        int x = 1;

        // Print the current value
        System.out.println("The value of x is " + x);

        // Method call to increment
        x = increment(x);

        // The value after the call
        System.out.println("The value of x is " + x);
    }

    /** A method that increments a value by 1 */
    public static int increment(int n) {
        n++;

        System.out.println("The value of x in the method is " + n);

        return n;
    }
}