// Determine if a letter is an uppercase or a lowercase

class Char {
    public static void main(String[] args) {

        char ch = '8';

        if (ch >= 'A' && ch <= 'Z') {
            System.out.println(ch + " is an uppercase letter");
        } else if (ch >= 'a' && ch <= 'z') {
            System.out.println(ch + " is a lowercase letter");
        } else if (ch >= '0' && ch <= '9') {
            System.out.println(ch + " is a numeric character");
        }
    }
}