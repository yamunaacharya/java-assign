//Q3. Write a Java program to read a plain text file.
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadTextFile {
    public static void main(String[] args) {
        // Specify the file path
        String filePath = "example.txt";

        // Read the file and print its contents
        try {
            readFile(filePath);
        } catch (IOException e) {
            System.err.println("An error occurred while reading the file: " + e.getMessage());
        }
    }

    public static void readFile(String filePath) throws IOException {
        // Use a BufferedReader to read the file line by line
        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        String line;
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }

        // Close the BufferedReader
        reader.close();
    }
}
