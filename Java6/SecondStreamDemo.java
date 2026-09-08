import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class SecondStreamDemo {

    public static void main(String[] args) {

        List<String> basket = Arrays.asList(
                "Cherry",
                "Mango",
                "Papaya",
                "Guava",
                "Banana",
                "Apple",
                "Kiwi",
                "Fig");

        // Print all elements
        basket.forEach(System.out::println);

        // Sort elements
        basket.stream()
                .sorted()
                .forEach(System.out::println);

        // Convert to uppercase
        basket.stream()
                .map(s -> s.toUpperCase())
                .forEach(System.out::println);

        // Filter elements containing 'a'
        basket.stream()
                .filter(s -> s.contains("a"))
                .forEach(System.out::println);

        // Count elements containing 'a'
        System.out.println(
                basket.stream()
                        .filter(s -> s.contains("a"))
                        .count());

        // Stream.of() example
        Stream.of("Jim", "Anna", "Mat", "Sam", "Brad", "Leo")
                .sorted()
                .forEach(System.out::println);

        // Filter names containing 'a',
        // convert to uppercase and maintain original order
        basket.stream()
                .filter(s -> s.toLowerCase().contains("a"))
                .map(String::toUpperCase)
                .forEach(System.out::println);
    }
}