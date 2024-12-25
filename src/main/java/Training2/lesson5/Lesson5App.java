package Training2.lesson5;

public class Lesson5App {
    public static void main(String[] args) throws InterruptedException {
        array();
        Array2 array2 = new Array2();
        array2.array2();
    }

    public static void array() {
        final int size = 10_000_000;
        final int half = size / 2;
        float[] arr = new float[size];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = 1;
        }
        long a = System.currentTimeMillis();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (float) (arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) *
                    Math.cos(0.4f + i / 2));

        }
        System.out.println("One thread time: " + (System.currentTimeMillis() - a) + " ms.");

    }


}
