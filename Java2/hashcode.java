public class hashcode {
    private String name;
    private int age;

    public hashcode() {
        name = "Anonymous";
        age = 0;
    }

    public hashcode(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void print() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    @Override
    public String toString() {
        return "hashcode{name='" + name + "', age=" + age + "}";
    }

    public static void main(String[] args) {
        hashcode person = new hashcode("Geethanjali", 20);
        person.print();

        System.out.println(person.hashCode());
        System.out.println(person.toString());
        System.out.println(person.getClass());
    }
}