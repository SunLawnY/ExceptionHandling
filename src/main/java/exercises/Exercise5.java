package exercises;

import java.util.List;
import java.util.Scanner;

import static exercises.heightQuestion.getHeightData;

public class Exercise5 {

    public static void healthInsuranceDataInput() {

        Scanner scanner = new Scanner(System.in);
        boolean isStudent = false;
        String occupation = "unemployed";

        System.out.println("\n--- Thank you for choosing Blummin Health insurance! ---\n");
        System.out.println("Please input your data:");

        // Name
        String name = nameQuestion.getNameData(scanner);

        // Age
        int age = ageQuestion.getAge(scanner);

        // Height
        double height = heightQuestion.getHeightData(scanner);


        // Height
        System.out.print("Enter your weight (in kilograms): ");
        double weight = Double.parseDouble(scanner.nextLine().trim());

        // Employment
        boolean employed = EmployedQuestion.getEmploymentData(scanner);


        // Occupation
        if (employed) {
            System.out.print("What is your occupation?: ");
            String occupation = scanner.nextLine();
        } else {
            System.out.print("Are you a student?: ");
            isStudent = scanner.nextBoolean();

        }

        System.out.println("\nThank you, " + name + ", for providing your information!");
        System.out.println("Your Blummin monthly subscription is: £"
                + calculateSubscriptionCharge(age, height, weight, occupation, isStudent));

        scanner.close();
    }

    private static double calculateSubscriptionCharge(int age, double height, double weight, String occupation, boolean isStudent) {

        List<Double> factors = List.of(
                0.5D, // Base rate
                calculateAgeFactor(age),
                calculateHeightFactor(height),
                calculateWeightFactor(weight),
                occupation.equalsIgnoreCase("doctor") ? 0.9D : 1.0D,
                isStudent ? 0.8D : 1.0D
        );

        return factors.stream().reduce(1.0, (a, b) -> a * b);
    }

    private static double calculateAgeFactor(int age) {
        return Math.max(100 + (age - 18) * 5, 1);
    }

    private static double calculateHeightFactor(double height) {
        return Math.abs(Math.pow(height, 2) - 2);
    }

    private static double calculateWeightFactor(double weight) {
        return 2 * weight;
    }

}