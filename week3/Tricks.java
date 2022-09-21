class Tricks {
    public static void main(String[] args) {
        // Compute a power. Note* Math.pow() always returns a double
        double number = Math.pow(2, 3);

        // Display the result
        System.out.println(number);

        // Increase the value of the number by 3
        number = number + 3;
        System.out.println(number);

        // Increase the vlue of the number by 2
        number += 2;
        System.out.println(number);

        number -= 3; // Subtracted 3 from the number
        number /= 2; // Divided the number by 2
        number %= 4; // Remainder when number divded by 4

        System.out.println(number);
    }
}