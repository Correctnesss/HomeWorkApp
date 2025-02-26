package Codewars;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;


public class helloEllohLlohe {
    public static void main(String[] args) {
        String string = "Hello";
        hello(string);
    }

    public static void hello(String str) {
        char[] charArray = str.toCharArray();
        char [] chars = new char[charArray.length];
        String [] strArray = new String[charArray.length];
        for (int j = 0; j < charArray.length; j++) {


            for (int i = 0; i < charArray.length - 1; i++) {

                chars[i] = charArray[i + 1];


            }
            chars[charArray.length - 1] = charArray[0];

            charArray= chars;
            System.out.println(charArray);
        }

    }
}
