/**
 * Random number
 */

class Random {
    public static void main(String[] args) {
        // Generate a random number between 0.0 (inclusive) to 1.0 (exclusive)
        double random1 = Math.random();
        System.out.println("Here is a random number between 0.0 and 1.0: " + random1);

        // Generate a random integer between 0 and 9 (inclusive)
        int random2 = (int) (Math.random() * 10);
        System.out.println("Here is a random integer between 0 and 9: " + random2);

        // Generate a random integer between 0 and 2 (inlusive)
        int random3 = (int) (Math.random() * 10) % 3;
        System.out.println("Here is a random integer between 0 and 2: " + random3);
    }
}