package inner;

import java.util.HashMap;
import java.util.Map;

public class MapTester {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Tomek", 22);
        map.put("Agata", 44);
        map.put("Wojtek", 17);
        map.put("Alicja", 66);

        for (Map.Entry personEntry : map.entrySet()) {
            System.out.println("imię: " + personEntry.getKey() + " wiek: " + personEntry.getValue());
        }
    }
}
