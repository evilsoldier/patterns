package functions;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 * @author Georgi Trendafilov
 */
public class Playground {

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<String>() {{
            add("Pesho");
            add("Gosho");
            add("Stamat");
        }};

        Predicate<String> startsWithCapital = s -> s.substring(0,1).contains("G");

        Function<String, String> function = s -> s.concat("Pesho");

        names.stream()
                .filter(s -> s.substring(0,1).contains("G"))
                .map(s -> s.concat("Pesho"))
                .forEach(System.out::println);

    }
}
