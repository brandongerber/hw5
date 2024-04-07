import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class DistanceDemo {
    public static void main(String[] args) {
    	// inputting from input distances, scan file, and then write to output
        try {
            File inputFile = new File("input_distances.txt");
            Scanner input = new Scanner(inputFile);
            FileWriter writeConversion = new FileWriter("output_distances.txt");
            // scan each line for inputs
            while (input.hasNextLine()) {
                String line = input.nextLine();
                // convert miles to km 
                try {
                    double miles = Double.parseDouble(line);
                    double kilometers = miles * 1.60934;
                    System.out.println("The miles are " + miles + " and the kilometers equals " + kilometers);
                    writeConversion.write("Miles: " + miles + ", Kilometers: " + kilometers);
                    // catch format exception if format is wrong
                } catch (NumberFormatException e) {
                    System.err.println("Format is wrong, please try again.");
                }
            }
            //close both files
            input.close();
            writeConversion.close();
            System.out.println("converted to miles");
            // catch if file is not found and if there is any other IO errors
        } catch (FileNotFoundException e) {
            System.err.println("input_distances.txt not found");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("IO Error Found");
        }
    }
}



