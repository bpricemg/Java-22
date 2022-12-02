/**
 * Adds two integers together
 */

class Add {
    public static void main(String[] args) {
        int first = 7;
        int second = 4;

        System.out.println("The sum is " + addTwoInts(first, second));
    }

    /**
     * addTwoInts() will take in two integers as a parameter and
     * return an integer back
     */
    public static int addTwoInts(int i, int j) {
        return i + j;
    }
}