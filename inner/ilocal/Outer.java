package inner.ilocal;

import java.util.Arrays;

public class Outer {
    public static void localClassInstatiate(String[] args) {
        class LocalClass {
            @Override
            public String toString() {
                return "Argumenty metody: " + Arrays.toString(args);
            }
        }
        LocalClass localClass = new LocalClass(); //instancja metody
        System.out.println(localClass);
    }
}
