// Test printf()

class Printf {
    public static void main(String[] args) {
        int n = 12;
        String day = "Monday";
        double temp = 64.45673265;

        System.out.printf("Today is %s and there are %d students present\n", day, n);
        System.out.printf("The temperature today is %f\n", temp);
        System.out.printf("The temperature today is %.7f\n", temp);
    }
}