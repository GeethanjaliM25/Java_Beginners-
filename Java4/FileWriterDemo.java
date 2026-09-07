import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {

    public static void main(String[] args) {

        String path = "hello.txt";
        BufferedWriter writer = null;

        try {

            writer = new BufferedWriter(new FileWriter(path));

            writer.write("Hello World");
            writer.newLine();

            writer.write("I am waiting for the chance to see your face");
            writer.newLine();

            writer.write("Waiting to see the different kind of place");

            System.out.println("Writing to file completed");

        } catch (IOException e) {

            e.printStackTrace();

        } finally {

            try {

                if (writer != null) {
                    writer.close();
                }

            } catch (IOException e) {

                e.printStackTrace();
            }
        }
    }
}