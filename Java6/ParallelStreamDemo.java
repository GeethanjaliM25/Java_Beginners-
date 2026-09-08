import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ParallelStreamDemo {

    public static void process(int i) {
        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {
        }
    }

    public static void main(String[] args) {

        List<Integer> numbers = IntStream.range(1, 99)
                .boxed()
                .collect(Collectors.toList());

        // Sequential Stream
        long startTime = System.currentTimeMillis();

        numbers.stream()
                .forEach(ParallelStreamDemo::process);

        long endTime = System.currentTimeMillis();

        System.out.println("Time taken by sequential stream: "
                + (endTime - startTime));

        // Parallel Stream
        startTime = System.currentTimeMillis();

        numbers.parallelStream()
                .forEach(ParallelStreamDemo::process);

        endTime = System.currentTimeMillis();

        System.out.println("Time taken by parallel stream: "
                + (endTime - startTime));
    }
}