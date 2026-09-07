import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFileDemo {

    public static void main(String[] args) {

        String source = "hello.txt";
        String destination = "copy.txt";

        try {

            // Open source file for reading
            FileInputStream input = new FileInputStream(source);

            // Open destination file for writing
            FileOutputStream output = new FileOutputStream(destination);

            // Create byte array
            byte[] content = new byte[1024];

            int bytesRead;

            // Read and copy the file
            while ((bytesRead = input.read(content)) != -1) {

                output.write(content, 0, bytesRead);
            }

            // Close streams
            input.close();
            output.close();

            System.out.println("File copied successfully!");

        } catch (IOException e) {

            e.printStackTrace();
        }
    }
}