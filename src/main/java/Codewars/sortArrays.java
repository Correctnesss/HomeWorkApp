package Codewars;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class sortArrays {
    public static void main(String[] args) {
        String[] names = {"Hello", "there", "I'm", "fine"};
        sort(names);
    }
    public static String[] sort(String[] names) {
//        List<String> list = new ArrayList<>(List.of(names));
//        list.sort(String::compareToIgnoreCase);
//        String[] array = list.toArray(new String[0]);
//        return array;
//    }

        Arrays.sort(names, String.CASE_INSENSITIVE_ORDER);
        return names;
    }
}
