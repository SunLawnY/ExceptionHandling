package exercises;

import java.util.Scanner;

public class EmployedQuestion {

    public static boolean getEmploymentData(Scanner scanner){

        while (true){
            try{
                System.out.println("Are you Employed: ");
                String input = scanner.nextLine();
                if (input.equalsIgnoreCase("Yes")) {
                    return true;
                }
                if (input.equalsIgnoreCase("No")){
                    return false;
                }
                throw new Exception();
            } catch (Exception e){
                System.out.println("Sorry we require a \"Yes\" or \"No\" response.");
            }


        }
    }
}
