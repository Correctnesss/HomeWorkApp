package Training2.lesson3;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class ArrayList {
    public void arrayList(String[] array) {
        String[] array1 = {"A", "B", "B", "B", "D", "E", "F", "F", "G", "H", "I"};
        int sum = 0;
        Set<String> arraylist = new java.util.HashSet<>(List.of(array));
        Map<String, Integer> arraylist1 = new java.util.TreeMap<>();

//        List<String> arraylist1 = new java.util.ArrayList<>();
//        for (int i = 0; i < arraylist.size(); i++) {
//            arraylist1.add(arraylist.get(i));
//            for (int j = i + 1; j < arraylist.size(); j++) {
//                if (arraylist.get(i) == arraylist.get(j)) {
//                    sum += 1;
//
//                    arraylist1.remove(arraylist.get(j));
//                }
//            }
        System.out.println(arraylist1.get("B"));
        for (int i = 0; i < array1.length; i++) {
            if (arraylist1.containsKey(array1[i])) {
                sum = arraylist1.get(array1[i]) + 1;
                arraylist1.put(array1[i], sum);
            } else arraylist1.put(array1[i], 1);

        }


//        for (String string : arraylist) {
//            System.out.println(string);
//        }

        System.out.println(arraylist);
        System.out.println(arraylist1);
    }
}