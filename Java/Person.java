public class Person {
    private String name;
    private int age;

    public Person() {
        name = "Anonymous";
        age = 0;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;

    }

    public void print() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        Person person = new Person("Geethanjali", 20);
        person.print();

        Person p2 = new Person("John", 25);
        p2.print();

        Person p3 = new Person();
        p3.print();
    }
}
