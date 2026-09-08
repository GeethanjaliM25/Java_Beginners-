import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MapStreamDemo {

    public static void main(String[] args) {

        Map<String, String> people = new HashMap<>();

        people.put("Polo", "Pune");
        people.put("Mili", "Mumbai");
        people.put("Deny", "Delhi");

        // Print all city names
        people.values()
                .stream()
                .forEach(System.out::println);

        // Convert city names to uppercase and sort
        List<String> cities = people.values()
                .stream()
                .map(c -> c.toUpperCase())
                .sorted()
                .collect(Collectors.toList());

        // Print sorted cities
        cities.forEach(System.out::println);

        // Contacts
        Map<String, List<String>> contacts = new HashMap<>();

        contacts.put("Frudo",
                Arrays.asList("1212-3434", "56565-7878"));

        contacts.put("Sean",
                Arrays.asList("2212-3534", "5666-7888", "8989-2321"));

        contacts.put("Ben",
                Arrays.asList("2112-334", "5633-1188", "8090-2321"));

        // Print all phone numbers
        contacts.values()
                .stream()
                .flatMap(Collection::stream)
                .forEach(System.out::println);

        // Print phone numbers containing 8
        contacts.values()
                .stream()
                .flatMap(Collection::stream)
                .filter(number -> number.contains("8"))
                .forEach(System.out::println);

        // Print all phone numbers after removing '-'
        contacts.values()
                .stream()
                .flatMap(Collection::stream)
                .map(number -> number.replace("-", ""))
                .forEach(System.out::println);
    }
}