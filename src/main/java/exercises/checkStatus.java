package exercises;

import javax.naming.InvalidNameException;
import java.util.Scanner;

public class checkStatus {
    static boolean employed;

    public static void setEmployed(boolean input){
        employed = input;
    }

    public static boolean getStatusEmploy(Scanner scanner) {
        boolean employStatus = scanner.nextBoolean();
        setEmployed(employStatus);
        return employStatus;
    }
    public static boolean getStatusStu(Scanner scanner) {
        while (true) {
            try{
                System.out.println("Are you a Student: ");
                boolean input = scanner.nextBoolean();
                checkBothStatus(input);
                return input;
            } catch (InvalidNameException e){
                System.out.println("cannot be both employed and a student");
            }
        }
    }
    public static void checkBothStatus(boolean input) throws InvalidNameException {
        if (employed && input){
            throw new InvalidNameException();
        }
    }


}
