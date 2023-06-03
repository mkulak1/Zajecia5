package zadanie3;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class Alice {
    public static void main(String[] args) {
        List allLines = loadTextFile("src/Zadanie3/alice30.txt");
        System.out.println(allLines);
        showAllLines(allLines);
        Set words = divideIntoWordsAndClean(allLines);
        System.out.println(words);
        System.out.println("Liczba różnych wyrazów w książce to: " + words.size() + ".");
        System.out.println();
        Map<Character, Integer> startLerrerStats = createStartLetterStats(words);
        System.out.println(startLerrerStats);
        Map. Entry<Character, Integer> startLetterEntry = findStartLetter((startLerrerStats));
        System.out.println("Litera na jaką zaczyna się najwięcej wyrazów to: \"" + startLetterEntry.getKey() + "\"" + ", jest ich " + startLetterEntry.getValue());


    }
    public static List loadTextFile(String textFileName) {
        try {
            return Files.readAllLines(Paths.get(textFileName));
        } catch (IOException e) {
            System.out.println("Coś poszło nie tak przy wczytywaniu pliku! " + e.getMessage());
        }
        return null;
    }

    public static void showAllLines(List<String> allLines) {
        for (String line : allLines) {
            System.out.println(line);
        }
    }

        public static Set divideIntoWordsAndClean(List<String> allLines) {
            Set words = new TreeSet();
            for (String line : allLines) {
                String[] lineWords = line.split(" |--");
                for (String word : lineWords) {
                    word = cleanWord(word);
                    if(!word.isEmpty()) {
                        words.add(word.toLowerCase());
                    }
                }
            }
            return words;
        }
        public static String cleanWord(String word) {
            /*return word.replace(",", "")
                    .replace("(", "")
                    .replace(")", "");
*/
            return word.replaceAll("\\p{Punct}|\\d}", "");
        }
        public static Map<Character, Integer> createStartLetterStats(Set<String> words) {
        Map<Character, Integer> startLetterStats = new TreeMap<>();
        for (String word : words) {
            Character startLetter = word.charAt(0);
            if (startLetterStats.containsKey(startLetter)) {
                startLetterStats.put(startLetter, startLetterStats.get(startLetter) + 1);
            } else {
                startLetterStats.put(startLetter, 1);
            }
        }
        return startLetterStats;
        }
        public static Map.Entry<Character, Integer> findStartLetter(Map<Character, Integer> startLetterStats) {
            Map.Entry<Character, Integer> startLetterEntry = null;
            for (Map.Entry<Character, Integer> entry : startLetterStats.entrySet()) {
                if (startLetterEntry == null || entry.getValue() > startLetterEntry.getValue()) {
                    startLetterEntry = entry;
                }
            }

        return startLetterEntry;
        }
    }
