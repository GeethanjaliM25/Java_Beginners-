import java.util.Comparator;
import java.util.TreeSet;

public class SortedPerson {

    public static void main(String[] args) {

        // Comparator for sorting by age
        Comparator<Person> ageComp = (p1, p2) -> p1.getAge() - p2.getAge();

        // Comparator for sorting by name
        Comparator<Person> nameComp = (p1, p2) -> p1.getName().compareTo(p2.getName());

        // TreeSet sorted by name
        TreeSet<Person> people = new TreeSet<>(nameComp);

        people.add(new Person("Polo", 24));
        people.add(new Person("Mona", 32));
        people.add(new Person("Frank", 43));

        System.out.println("-- Sorted by Name");

        people.forEach(System.out::println);
    }
}