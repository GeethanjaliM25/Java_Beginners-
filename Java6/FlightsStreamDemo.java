import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlightsStreamDemo {

        public static void main(String[] args) throws Exception {

                // Read flight.csv file
                Stream<String> lines = Files.lines(
                                Paths.get("C:/Users/Geethanjali/OneDrive/Desktop/Java 6/flight.csv"));

                // Convert each CSV line into Flight object
                List<Flight> flights = lines
                                .map(line -> {
                                        String[] record = line.split(",");

                                        return new Flight(
                                                        Integer.parseInt(record[0].trim()),
                                                        record[1].trim(),
                                                        record[2].trim(),
                                                        record[3].trim());
                                })
                                .collect(Collectors.toList());

                // Print all flights
                flights.forEach(System.out::println);

                // Print details of flight number 102
                System.out.println("Flight number 102:");

                flights.stream()
                                .filter(f -> f.getCode() == 102)
                                .forEach(System.out::println);

                // Print all flights by Jet carrier
                System.out.println("Jet flights:");

                flights.stream()
                                .filter(f -> f.getCarrier().equalsIgnoreCase("Jet"))
                                .forEach(System.out::println);

                // Print flights going from Mumbai to Goa
                System.out.println("Flights from Mumbai to Goa:");

                flights.stream()
                                .filter(f -> f.getSource().equalsIgnoreCase("Mumbai"))
                                .filter(f -> f.getDestination().equalsIgnoreCase("Goa"))
                                .forEach(System.out::println);

                // Remove flight number 110
                System.out.println("After removing flight number 110:");

                flights.removeIf(f -> f.getCode() == 110);

                flights.forEach(System.out::println);
        }
}