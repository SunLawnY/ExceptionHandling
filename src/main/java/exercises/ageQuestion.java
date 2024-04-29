package exercises;

import javax.naming.InvalidNameException;
import java.util.Scanner;

public class ageQuestion {

    public static int getAge(Scanner scanner) {
        while (true) {
            try{
                System.out.println("What is your age: ");
                int input = scanner.nextInt();
                checkAge(input);
                return input;
            } catch (InvalidNameException e){
                System.out.println("Sorry age must be 16 or higher");
            }
        }
    }

    public static void checkAge(int input) throws InvalidNameException {

        if (input < 16){
            throw new InvalidNameException();
        }
    }
}
