package exercises;

import java.util.Scanner;

public class AgeQuestion {

    public static int getAge(Scanner scanner) {
        while (true) {
            try{
                System.out.println("What is your age: ");
                int input = Integer.parseInt(scanner.nextLine().trim());;
                checkAge(input);
                return input;
            } catch (Exception e){
                System.out.println("Sorry age must be 16 or higher");
            }
        }
    }

    public static void checkAge(int input) throws Exception {

        if (input < 16){
            throw new Exception();
        }
    }
}
