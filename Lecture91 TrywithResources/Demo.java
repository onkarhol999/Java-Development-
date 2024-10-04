public class Demo {
    
}

import java.io.*;

public class SimpleTryWithResources {
    public static void main(String[] args) {
        // Using try-with-resources to manage the file resource
        BufferedReader br = null;
        try {
            InputStreamReader in = new InputStreamReader(System.in);
            br = new BufferedReader(in);
            // Reading the first line of the file
            String line = br.readLine();
            // Printing the line to the console
            System.out.println(line);
        } catch (IOException e) {
            // Handling any IO exceptions that may occur
            System.out.println("Error reading the file: " + e.getMessage());
        } finally {
            br.close();
        }
    }
}
