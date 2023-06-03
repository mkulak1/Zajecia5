package collections;

import java.util.Arrays;

public class textSplitTester {
    public static void main(String[] args) {
        String text = "Ala ma kota!";
        String[] words = text.split(" ");

        System.out.println(Arrays.toString(words));
    }
}
