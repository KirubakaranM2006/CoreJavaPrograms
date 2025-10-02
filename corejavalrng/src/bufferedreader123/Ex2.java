package bufferedreader123;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Ex2 {

    public static void main(String[] args) {
        try {
            // Step 1: Create BufferedWriter
            FileWriter fw = new FileWriter("Bufferedwriterdemo.txt");
            BufferedWriter bw = new BufferedWriter(fw);

            // Step 2: Write to buffer (not yet written to file!)
            bw.write("This is the first line.");
            System.out.println("Written to buffer, not file yet!");

            // Step 3: Force writing from buffer to file
            bw.flush(); // now the data is moved to the file
            System.out.println("Data flushed to file.");

            // Step 4: Write more
            bw.write("\nThis is the second line.");
            System.out.println("Second line written to buffer again!");

            // Step 5: Close (also flushes and clears buffer)
            bw.close();
            System.out.println("BufferedWriter closed. All data written to file.");

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
