class Message {
    public static void main(String[] args) {
        print10x("Hello, world");

        print10x("It is very warm outside today :(");
    }

    public static void print10x(String message) {
        for (int i = 0; i < 10; i++) {
            System.out.println(message);
        }
        
    }
}