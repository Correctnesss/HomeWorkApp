package Training3.lesson1;

import java.util.Arrays;

public class HomeWorkApp1 {
    public static void main(String[] args) {
        HomeWork1<Integer> intStats = new HomeWork1<Integer>(1, 2, 3, 4, 5, 6);
        intStats.swap(1, 2);
        System.out.println(Arrays.toString(intStats.getNums()));
    }


}
