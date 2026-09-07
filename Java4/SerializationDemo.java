import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationDemo {

    public static void main(String[] args) throws Exception {

        Person p = new Person("Polo", 21);

        System.out.println(p);

        String path = "C:\\Users\\Geethanjali\\OneDrive\\Desktop\\Java 4\\Person.java";

        ObjectOutputStream ostream = null;
        ObjectInputStream istream = null;

        // Serialization code
        ostream = new ObjectOutputStream(
                new FileOutputStream(path));

        ostream.writeObject(p);
        ostream.close();

        System.out.println("Object serialized...");

        // Deserialization code
        istream = new ObjectInputStream(
                new FileInputStream(path));

        Object obj = istream.readObject();

        System.out.println(obj);

        istream.close();
    }
}