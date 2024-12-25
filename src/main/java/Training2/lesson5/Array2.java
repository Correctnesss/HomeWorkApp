package Training2.lesson5;

import java.util.Arrays;

public class Array2 {
//    public static void main(String[] args) throws InterruptedException {
//        Array2 array2 = new Array2();
//        Array2 array = new Array2();
//        array2.array2();
//
//
//    }

    public void array2() throws InterruptedException {
        final int size = 10_000_000;
        final int half = size / 2;
        float[] arr = new float[size];

        for (int i = 0; i < size; i++) {
            arr[i] = 1;
        }
        float[] arr2 = new float[half];
        System.arraycopy(arr, 0, arr2,0,half);
        float[] arr3 = new float[half];
        System.arraycopy(arr, half, arr3,0,half);
        long a = System.currentTimeMillis();
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < half; i++) {
                arr2[i] = (float) (arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) *
                        Math.cos(0.4f + i / 2));

            }
        });
        thread1.start();
        Thread thread = new Thread(() -> {
            for (int i = 0; i < half; i++) {
                arr3[i] = (float) (arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) *
                        Math.cos(0.4f + i / 2));

            }
        });
        thread.start();
        thread1.join();
        thread.join();
        System.arraycopy(arr2,0,arr,0,half);
        System.arraycopy(arr3,0,arr,half,half);
        System.out.println("Two thread time: " + (System.currentTimeMillis() - a) + " ms.");

    }

    public void array() {
        final int size = 10_000_000;
        final int half = size / 2;
        float[] arr = new float[size];

        for (int i = half; i < size; i++) {
            arr[i] = 1;
        }
        long a = System.currentTimeMillis();
        for (int i = half; i < size; i++) {
            arr[i] = (float) (arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) *
                    Math.cos(0.4f + i / 2));
        }
        System.out.println("Two thread time: " + (System.currentTimeMillis() - a) + " ms.");

    }
}
