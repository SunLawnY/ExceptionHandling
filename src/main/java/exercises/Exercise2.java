package exercises;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise2 {

    public static int[] getUserInput() {
        Scanner input = new Scanner(System.in);
        while (true) {
            try{
                System.out.println("Enter divisor: ");
                int a = input.nextInt();
                System.out.println("Enter dividend: ");
                int b = input.nextInt();
                input.close();
                return new int[]{a, b};
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please try again.");
            }
        }


    }

}