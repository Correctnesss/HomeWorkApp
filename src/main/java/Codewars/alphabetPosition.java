package Codewars;

public class alphabetPosition {
    public static char[] alphabet1 = {'a',
            'b',
            'c',
            'd',
            'e',
            'f',
            'g',
            'h',
            'i',
            'j',
            'k',
            'l',
            'm',
            'n',
            'o',
            'p',
            'q',
            'r',
            's',
            't',
            'u',
            'v',
            'w',
            'x',
            'y',
            'z'};

    public static String position(char alphabet) {
        for (int i = 0; i < alphabet1.length; i++) {
            if (alphabet1[i] == alphabet) {
                return ("Position of alphabet: " + (i + 1));
            }
        }
        return "";
    }

    public static void main(String[] args) {
        System.out.println(position('v'));
    }


}

























