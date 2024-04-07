import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

	//created a class to convert miles to km
public class DistanceConverter {
    public static double milesToKilometers(double miles) throws NegativeDistanceException {
    	// bascially if the miles are negative it throws an exception and prints that values cant be negative
        if (miles < 0) {
            throw new NegativeDistanceException("value can't be negative, please try again.");
        }
        // return km
        return miles * 1.60934;
    }
    // class to convert jm to mies
    public static double kilometersToMiles(double kilometers) throws NegativeDistanceException {
    	// same thing as line 9
        if (kilometers < 0) {
            throw new NegativeDistanceException("value can't be negative, please try again.");
        }
        //return miles
        return kilometers * 0.621371;
    }
}






