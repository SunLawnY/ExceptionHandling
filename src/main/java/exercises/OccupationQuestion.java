package exercises;

import javax.naming.InvalidNameException;
import java.util.Scanner;

public class OccupationQuestion {

    public static String getOccupationData(Scanner scanner) {
        while (true) {
            try{
                System.out.println("What is your occupation: ");
                String input = scanner.nextLine();
                checkValidOccupation(input);
                return input.toUpperCase();

            } catch (InvalidNameException e){
                System.out.println("Sorry we need a full name.");
            }
        }
    }
    public static void checkValidOccupation(String input) throws InvalidNameException {
        String[] splitString = input.split(" ");
        if (!(splitString.length >= 1)){
            throw new InvalidNameException();
        }
        if (!input.matches("^[A-Za-z ]*$")){
            throw new InvalidNameException();
        }
    }
}
