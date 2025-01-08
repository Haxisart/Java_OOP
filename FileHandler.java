package OOP_array_midterm;

import java.io.*;

public class FileHandler {
    public static void main(String[] args) {
        String filename = "example.txt";
        writeToFile(filename, "Hello, World!");
        System.out.println("File content: " + readFromFile(filename));
    }

    public static void writeToFile(String filename, String content) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            writer.write(content);
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }

    public static String readFromFile(String filename) {
        StringBuilder content = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line);
            }
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
        return content.toString();
    }
}

