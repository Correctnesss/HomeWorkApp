package Training3.lesson1;

public class HomeWork1<T> {


    private T[] nums;


    public HomeWork1(T... nums) { //varargs
        this.nums = nums;
    }


    public T[] getNums() {
        return nums;
    }

    public void swap(int a, int b) {
        T s = nums[a];
        T c = nums[b];
        nums[a] = c;
        nums[b] = s;
    }

}
