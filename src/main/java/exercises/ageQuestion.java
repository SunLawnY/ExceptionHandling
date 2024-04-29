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
            } catch (NumberFormatException e){
                System.out.println("Sorry age must be between 16 - 100");
            }
        }
    }

    public static void checkAge(int input) throws NumberFormatException {

        if (input < 16 || input > 100){
            throw new NumberFormatException();
        }
    }
}
