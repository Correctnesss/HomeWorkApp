package Codewars;

public class degree5 {
    public static int multiply(int number) {
        int result = 1;
        String numberString = Integer.toString(number);
        if (number < 0) {
            for (int i = 0; i < numberString.length() - 1; i++) {
                result = result * 5;
            }
        } else {
            for (int i = 0; i < numberString.length(); i++) {
                result = result * 5;
            }
        }
        number = number * result;
        return number;
    }

    public static void main(String[] args) {
        System.out.println(multiply(3));
        System.out.println(multiply(10));
        System.out.println(multiply(200));
        System.out.println(multiply(0));
        System.out.println(multiply(-3));
    }
}
