package zadanie2;

import java.util.HashMap;
import java.util.Map;

public class UserCollector {
    public static void main(String[] args) {
        Map<Integer, User> userMap = new HashMap<>();

        userMap.put(1, new User("Jan", "Kowalski", 25));
        userMap.put(2, new User("Tomasz", "Piotrowski", 12));
        userMap.put(3, new User("Agata", "Nowak", 33));
        userMap.put(4, new User("Agata", "Nowak", 33));
        userMap.put(5, new User("Agata", "Nowak", 33));
        userMap.put(5, new User("Agata", "Nowak", 33));
        userMap.put(5, new User("Agata", "Nowak", 33));
        userMap.put(5, new User("Agata", "Nowak", 33));
        userMap.put(5, new User("Agata", "Nowak", 33));

        for (User user : userMap.values()) {
            System.out.println(user);
        }
    }
}
