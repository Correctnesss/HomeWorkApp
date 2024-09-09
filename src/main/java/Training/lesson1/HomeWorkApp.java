package Training.lesson1;

public class HomeWorkApp {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }

    public static void printThreeWords() {
        System.out.println("2:"+"Orange");
        System.out.println("Banana");
        System.out.println("Apple");
        System.out.println();
    }

    public static void checkSumSign() {
        int a = 11;
        int b = 11;
        if (a + b < 0) {
            System.out.println("3:"+"Сумма отрицательная");
        } else if (a + b > 0){
            System.out.println("3:"+"Сумма положительная");
        } else {
            System.out.println("3:"+"Сумма равна нулю");
        }
        System.out.println();
    }
    public static void printColor(){
        int value = 109;
        if (value <=0){
            System.out.println("4:"+"Красный");
        } else if (value > 0 & value <= 100){
            System.out.println("4:"+"Желтый");
        } else {
            System.out.println("4:"+"Зеленый");
        }
        System.out.println();
    }
    public static void compareNumbers(){
        int a = 2111;
        int b = 1323;
        if (a >= b){
            System.out.println("5:"+ "a>=b");
        } else {
            System.out.println("5:"+ "a<b");
        }
    }
}