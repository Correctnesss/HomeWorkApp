package Training3.lesson1;

public class HomeWorkApp1 {
    public static void main(String[] args) {
        HomeWork1<Integer> intStats = new HomeWork1<>(1, 2, 3, 4, 5, 6);
        Object[] array = {"aaaa", "bbb", "ccc", "dd"};
        intStats.getAvg(array, 1, 2);
        System.out.println(array);
    }


}
