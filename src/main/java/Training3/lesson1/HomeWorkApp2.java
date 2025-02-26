package Training3.lesson1;

import java.util.ArrayList;
import java.util.List;

public class HomeWorkApp2 {
    public static void main(String[] args) {
        HomeWork2<String> setArrayList = new HomeWork2<>("aaaa","bbbb","cccc","aaa","bbb","ccc");
        List<String> arrayList = setArrayList.setArrayList();
        System.out.println(arrayList.getClass() + " " + arrayList);
    }
}
