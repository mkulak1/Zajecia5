package collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Furniture {

    public static void main(String[] args) {
        Chair chair1 = new Chair("Adde", "Ikea", 2016);
        Chair chair2 = new Chair("Adde", "Ikea", 2016);
        Chair chair3 = new Chair("Janinge", "Ikea", 2016);
        Chair chair4 = new Chair("Adde", "Ikea", 2015);

        Set<Chair> furniture = new HashSet<>();
        furniture.add(chair1);
        furniture.add(chair2);
        furniture.add(chair3);
        furniture.add(chair4);

        //System.out.println(furniture);

        Iterator<Chair> iterator = furniture.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
