
// Q1. Write a Java program to read input from the Java console

import java.util.Scanner;
public class ConsoleInputExample{

    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.println("Enter a string:");
        String inputString = scanner.nextLine();
        System.out.println("You entered: " + inputString);

        // Prompt the user to enter an integer
        System.out.println("Enter an integer:");
        int inputInt = scanner.nextInt();
        System.out.println("You entered: " + inputInt);

        // Prompt the user to enter a floating-point number
        System.out.println("Enter a float:");
        float inputFloat = scanner.nextFloat();
        System.out.println("You entered: " + inputFloat);

        // Close the scanner
        scanner.close();
    }
}