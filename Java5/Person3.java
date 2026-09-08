import java.util.Comparator;
import java.util.TreeSet;

public class Person3 {

    public static void main(String[] args) {

        // Comparator for sorting students by roll number
        Comparator<Student> rollComp = (s1, s2) -> s1.getRollNo() - s2.getRollNo();

        // TreeSet sorted by roll number
        TreeSet<Student> students = new TreeSet<>(rollComp);

        students.add(new Student(103, "Polo"));
        students.add(new Student(101, "Mona"));
        students.add(new Student(102, "Frank"));

        System.out.println("-- Students sorted by Roll Number");

        students.forEach(System.out::println);
    }
}