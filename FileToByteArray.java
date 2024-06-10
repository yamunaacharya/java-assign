//Write a Java program to read the contents of a file into a byte array
import java.nio.file.*;
import java.io.IOException;

public class FileToByteArray {
    public static void main(String[] args) {
        // Specify the path to the file
        String filePath = "file to byte array."; // You can change this to the absolute path if needed

        try {
            // Read the file into a byte array
            byte[] Bytes = Files.readAllBytes(Paths.get(filePath));

            // Print the byte array
            System.out.println("File content in bytes:");
            for (byte b : Bytes) {
                System.out.print(b + " ");
            }

            //convert the byte array back to a string and print
            String fileContent = new String(Bytes);
            System.out.println("\n\nFile content as a string:");
            System.out.println(fileContent);
        } catch (IOException e) {
            // Handle exceptions
            System.err.println("Java program to read a: " + e.getMessage());
        }
    }
}