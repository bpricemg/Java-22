// Converts Fahrenheit to Celcius
class Fahrenheit {
    public static void main(String[] args) {
        // Starting F value
        double f = 212;

        // Convert with formula
        // Subtract 32 then multiply by 5 / 9
        double c = (f - 32) * (5 / 9.0);

        // Print the C value
        System.out.println("The Celsius equivalent to " + f + " Fahrenheit is " + c + ".");
    }
}