package Codewars;

import java.util.Arrays;

public class createPhoneNumber {
    public static String createPhoneNumber1(int[] numbers) {
        String str = "(";
        for (int i = 0; i < 10; i++) {
            str += numbers[i];
            if (i == 2) {
                str += ") ";
            }
            if (i == 5) {
                str += "-";
            }
        }

        return str;
    }

    public static void main(String[] args) {
        System.out.println(createPhoneNumber1(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 0}));
    }
}


//public class Kata {
//  public static String createPhoneNumber(int[] numbers) {
//    return String.format("(%d%d%d) %d%d%d-%d%d%d%d",numbers[0],numbers[1],numbers[2],numbers[3],numbers[4],numbers[5],numbers[6],numbers[7],numbers[8],numbers[9]);
//  }
//}


