package collections;

import java.util.*;

public class Demo {
    public static void main(String[] args) {
        /*Set<String> mySet = new HashSet<>();
        mySet.add("Wojtek");
        mySet.add("Agata");
        mySet.add("Wojtek");
        mySet.add("Tomek");

        System.out.println(mySet);

        Iterator<String> iterator = mySet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        mySet.add("Anna");
        mySet.add("Anna");
        mySet.remove("Wojtek");

        iterator = mySet.iterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println("element: " + element + " hashCode: " + element.hashCode());
        }*/

        Map<String, String> phones = new HashMap<>();
        phones.put("Tomek", "567-234-367");
        phones.put("Alicja", "234-765-987");
        phones.put("Tomek", "999-999-999");
        phones.put("Barbara", "999-999-999");

        //System.out.println(phones);

        Set<String> keys = phones.keySet();
        System.out.println(keys);

        System.out.println(phones.containsKey("Alicja"));

        System.out.println(phones.get("Alicja"));
        System.out.println(phones.get("Karol"));

        System.out.println();

        for (String key : phones.keySet()) {
            System.out.println(key + " -> " + phones.get(key));
        }

        System.out.println();

        for (String value : phones.values()) {
            System.out.println(value);
        }

        System.out.println();

        for (Map.Entry entry : phones.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
            entry.setValue("0");
        }
        System.out.println();
        System.out.println(phones);
    }
}
