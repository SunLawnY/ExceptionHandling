package exercises;

import javax.naming.InvalidNameException;
import java.util.Scanner;

public class nameQuestion {

    public static String getNameData(Scanner scanner) {
        while (true) {
           try{
               System.out.println("What is your name: ");
               String input = scanner.nextLine();
               checkValidName(input);
               return input;
           } catch (InvalidNameException e){
               System.out.println("Sorry we need a name");
           }
        }
    }

    public static void checkValidName(String input) throws InvalidNameException {
        String[] splitString = input.split(" ");
        if (!(splitString.length >= 2)){
            throw new InvalidNameException();
        }
    }
}
