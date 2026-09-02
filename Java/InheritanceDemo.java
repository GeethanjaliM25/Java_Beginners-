
class Alfa {
    public Alfa() {
        System.out.println("Constructor of Alfa");
    }

    public void display() {
        System.out.println(" Alfa Demo");
    }
}

class Beta extends Alfa {
    public Beta() {
        System.out.println("Constructor of Beta");
    }

    public void test() {
        System.out.println("Test method of Beta");
    }
}

public class InheritanceDemo {
    public static void main(String[] args) {
        Alfa obj = new Alfa();
        obj.display();

        Beta obj1 = new Beta();
        obj1.test();
        obj1.display();
    }
}

public class InheritanceDemo {
    public static void main(String[] args) {
        Alfa obj = new Alfa();
        obj.display();

        Beta obj1 = new Beta();
        obj1.test();
        obj1.display();

        Alfa ab = b;
        ab.display();
        ab.test(); // This line will cause a compile-time error because the reference type is Alfa,
                   // which does not have the test() method.
        Beta b = (Beta) ab; // Downcasting to Beta
        b.test(); // Now this will work because b is of type Beta

    }
}
