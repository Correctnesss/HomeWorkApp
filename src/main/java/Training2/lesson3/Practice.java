package Training2.lesson3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class Practice {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("A");
        arrayList.add("B");
        arrayList.add("C");
        arrayList.add("D");
        arrayList.add("E");
        arrayList.add(1, "А0");
        System.out.println(arrayList);
        arrayList.remove("E");
        arrayList.remove(2);
        System.out.println(arrayList);



            LinkedList<String> linkedList = new LinkedList<>();
            linkedList.add("F");
            linkedList.add("B");
            linkedList.add("D");
            linkedList.add("Е");
            linkedList.add("C");
            linkedList.addLast("Z");
            linkedList.addFirst("A");
            linkedList.add(1, "А2");
            System.out.println("1. linkedList: " + linkedList);
            linkedList.remove("F");
            linkedList.remove(2);
            System.out.println("2. linkedList: " + linkedList);
            linkedList.removeFirst();
            linkedList.removeLast();
            System.out.println("3. linkedList: " + linkedList);
            String val = linkedList.get(2);
            linkedList.set(2, val + " изменено");
            System.out.println("4. linkedList: " + linkedList);


        HashMap<String, String> hm =new HashMap<>();
        hm.put("Russia","Moscow");
        hm.put("France","Paris");
        hm.put("Germany","Berlin");
        hm.put("Norway","Oslo");
        for(Map.Entry<String, String> o : hm.entrySet()){
            System.out.println(o.getKey() +": "+ o.getValue());
        }
        hm.put("Germany","Berlin2");
        System.out.println("New Germany Entry: "+ hm.get("Germany"));

    }
}