import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;

public class BinaryReadDemo {

    public static void main(String[] args) {

        String path = "C:\\Users\\Geethanjali\\OneDrive\\Desktop\\Java 4\\amazing.txt";

        try {

            // Create the file automatically
            File file = new File(path);

            if (!file.exists()) {
                file.createNewFile();
                System.out.println("File created successfully!");
            }

            // Write some content into the file
            FileWriter writer = new FileWriter(file);

            writer.write("Hello World");
            writer.write("\n");
            writer.write("This file was created automatically.");
            writer.write("\n");
            writer.write("Reading this file using FileInputStream.");

            writer.close();

            System.out.println("Content written successfully!");

            // Read the file using FileInputStream
            FileInputStream istream = new FileInputStream(file);

            byte[] content = new byte[(int) file.length()];

            istream.read(content);

            System.out.println("\nFile Content:");
            System.out.println(new String(content));

            istream.close();

        } catch (IOException e) {

            e.printStackTrace();

        }
    }
}