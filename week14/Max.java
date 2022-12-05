/**
 * Find the maximum between two numbers
 */

class Max {
    public static void main(String[] args) {
        double i = 2.1;
        double j = 2.1;

        // The method call
        double k = maxNumber(i, j);

        System.out.println("The max is " + k);
    }

    /**
     * maxNumber() is a method that returns the maximum
     * of two doubles
     */
    public static double maxNumber(double i, double j) {
        // If i is greater than j
        if (i > j) {
            return i;
        }

        // Otherwise, j is largest
        return j;
            
    }
}