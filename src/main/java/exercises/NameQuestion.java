package exercises;

import javax.naming.InvalidNameException;
import java.util.Scanner;

public class NameQuestion {

    public static String getNameData(Scanner scanner) {
        while (true) {
           try{

               System.out.println("What is your name: ");
               String input = scanner.nextLine();
               checkValidName(input);
               return input.toUpperCase();

           } catch (InvalidNameException e){
               System.out.println("Sorry we need a full name.");
           }
        }
    }

    public static void checkValidName(String input) throws InvalidNameException {
        String[] splitString = input.split(" ");
        if (!(splitString.length >= 2)){
            throw new InvalidNameException();
        }
        if (!input.matches("^[A-Za-z ]*$")){
            throw new InvalidNameException();
        }
    }
}
