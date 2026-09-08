import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FirstStreamDemo {

    public static void print(Object obj) {
        System.out.println(obj);
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {

        Integer[] ar = { 2, 5, 7, 6, 9, 3, 2, 4 };

        List<Integer> numbers = Arrays.asList(ar);

        // 1. Create Stream
        Stream<Integer> str1 = numbers.stream();

        str1.forEach(System.out::println);

        // 2. Count
        System.out.println(numbers.stream().count());

        // 3. Distinct
        numbers.stream()
                .distinct()
                .forEach(System.out::println);

        // 4. Count distinct elements
        System.out.println(numbers.stream().distinct().count());

        // 5. Count numbers greater than 5
        System.out.println(numbers.stream().filter(n -> n > 5).count());

        // 6. Distinct and sorted
        numbers.stream()
                .distinct()
                .sorted()
                .forEach(System.out::println);

        // 7. Reduce using lambda
        System.out.println(numbers.stream().reduce(0, (n, m) -> n + m));

        // 8. Reduce using Integer.sum
        System.out.println(numbers.stream().reduce(0, Integer::sum));

        // 9. Reduce using our own add method
        System.out.println(numbers.stream().reduce(0, FirstStreamDemo::add));

        // 10. Limit first 5 elements
        numbers.stream()
                .limit(5)
                .forEach(System.out::println);
    }
}