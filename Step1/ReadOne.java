import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class ReadOne
{
    public static void main(String[] args)
    {
        /* We must use a try/catch when reading
         * in a file in case the file is not found
         */
        try {
            // Create the Scanner object using the file
            // as input
            Scanner fileIn = new Scanner(new File("Step4/input.txt"));
            

            while (fileIn.hasNext()) 
            {
                // Reads the entire line
                String lineIn = fileIn.nextLine(); 
                // Output the line
                System.out.println(lineIn);
            }
        }
        catch (IOException e) {
            System.out.println("File not found");
        }
    }
}