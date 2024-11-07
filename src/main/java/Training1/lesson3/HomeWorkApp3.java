package Training1.lesson3;

import java.util.Arrays;

public class HomeWorkApp3 {
    public static void main(String[] args) {


        int[] array = {0, 0, 0, 1, 1, 0, 0, 1, 0, 1, 1, 1, 1};
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                array[i] = 1;
            } else {
                array[i] = 0;
            }
            ;

        }
        System.out.println(Arrays.toString(array));
        int[] array2 = new int[100];
        for (int i = 0; i < array2.length; i++) {
            array2[i] = i+1;

        }
        System.out.println(Arrays.toString(array2));
        int[] array3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < array3.length; i++) {
            if (array3[i] < 6){
                array3[i] *=2;
            }

        }
        System.out.println(Arrays.toString(array3));
        int[][] array4 = new int[11][11];
        for (int i = 0; i < array4.length; i++) {
            for (int j = 0; j < array4.length; j++) {
                if (i == j || i + j == array4.length - 1){
                    array4[i][j]=1;
                }
            }

        }
        for (int i = 0; i < array4.length; i++) {
            System.out.println(Arrays.toString(array4[i])); // приходит []
        }
        System.out.println(Arrays.toString(method5(5,10)));

        int[] array6 = {0};
        int maxResult = array6[0];
        int minResult = array6[0];
        for (int i = 1; i < array6.length; i++) {
            if (array6[i-1]<array6[i] & maxResult < array6[i]){
                maxResult = array6[i];
            } else if (array6[i-1]>array6[i] & minResult > array6[i]){
                minResult = array6[i];
            }
        }
        System.out.println("max: " + maxResult + " min: " + minResult);

        int[] array7 = {2,3,4,5,6,7,1,3,4,5,14};


    }
    public static int[] method5 (int len, int initialValue) {
        int [] array5 = new int[len];
        for (int i = 0; i < array5.length; i++) {
            array5[i] = initialValue;
        }
        return array5;
    }



}
