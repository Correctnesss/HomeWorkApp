package Training3.lesson1;

public class HomeWork1<T> {


    private T[] nums;


    public HomeWork1(T... nums) { //varargs
        this.nums = nums;
    }


    public <T> void getAvg(T[] array, int a, int b) {
        T s = array[a];
        T c = array[b];
        array[a] = c;
        array[b] = s;
    }

}
