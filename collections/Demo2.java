package collections;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Demo2 {
    public static void main(String[] args) {

       /* List<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("bbb");
        list.add("ccc");

        System.out.println(Collections.frequency(list, "bbb"));

        System.out.println(list);

        Collections.shuffle(list);
        System.out.println(list);*/

        try {
            System.out.println(Files.readAllLines(Paths.get("src/data.txt")));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
