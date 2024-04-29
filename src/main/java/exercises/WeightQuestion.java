package exercises;

import java.util.Scanner;

public class WeightQuestion{

    public static double getWeightData(Scanner scanner) {
        while (true) {
            try{
                System.out.println("What is your Weight in kilograms: ");
                double input = Double.parseDouble(scanner.nextLine().trim());
                checkWeight(input);
                return input;
            } catch (Exception e){
                System.out.println("Please give a valid height in kilograms.");
            }
        }
    }

    public static void checkWeight(double input) throws Exception {
        if (input > 300){
            throw new Exception();
        }
        if (input < 0){
            throw new Exception();
        }

    }
}
