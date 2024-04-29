package exercises;

import javax.naming.InvalidNameException;
import java.util.Scanner;

public interface heightQuestion {

    public static double getHeightData(Scanner scanner) {
        while (true) {
            try{

                System.out.println("What is your height: ");
                double input = Double.parseDouble(scanner.nextLine().trim());
                checkHeight(input);
                return input;
            } catch (Exception e){
                System.out.println("Please give a valid height in metres.");
            }
        }
    }

    public static void checkHeight(double input) throws Exception {
        if (input > 2.8){
            throw new Exception();
        }
        if (input < 0){
            throw new Exception();
        }

    }
}
