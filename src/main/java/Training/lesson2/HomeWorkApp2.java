package Training.lesson2;

public class HomeWorkApp2 {
    public static void main(String[] args) {
        String stringHomeWork = "StringHomeWork";
        int quantity = 0;

        System.out.println(within10and20(3, 10));
        System.out.println(isPositiveOrNegative(-1000));
        System.out.println(isNegative(-65));
        PrintWordNTimes(stringHomeWork, quantity);
        System.out.println(leapYear(20));
    }


    public static boolean within10and20(int x1, int x2) {
        return (10 <= x1 + x2) && (x1 + x2 <= 20);
    }

    public static String isPositiveOrNegative(int a) {
        if (a >= 0) {
            return "Число положительное";
        }
        return "Число отрицательное";
    }

    public static boolean isNegative(int x) {
        return x < 0;
    }

    public static void PrintWordNTimes(String word, int times) {
        for (int i = 0; i < times; i++) {
            System.out.println(word);
        }
    }

    public static boolean leapYear(int year) {
        return year % 4 == 0 & year % 100 != 0 || year % 400 == 0;
    }
}





