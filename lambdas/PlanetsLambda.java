package lambdas;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Comparator;

public class PlanetsLambda {
    public static void main(String[] args) {
        String[] planets = {"Słońce", "Merkury", "Wenus", "Ziemia", "Mars", "Jowisz", "Saturn", "Uran", "Neptun"};

        /*Arrays.sort(planets);
        System.out.println(Arrays.toString(planets));*/

        //System.out.println("mata".charAt("mata".length() - 1) - "rower".charAt("rower".length() - 1));

        Arrays.sort(planets, (o1, o2) -> (o1.length() - 1) - o2.charAt(o2.length()-1));
        System.out.println(Arrays.toString(planets));

        Arrays.sort(planets, (o1, o2) -> o1.length() - o2.length());
        Arrays.asList(planets).forEach(s -> System.out.println(s));
        System.out.println(Arrays.toString(planets));
    }
}
