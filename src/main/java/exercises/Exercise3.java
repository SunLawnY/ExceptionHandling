package exercises;

public class Exercise3 {

    public static void divide() {

        int[] inputs;

        while (true) {
            try {
                inputs = Exercise2.getUserInput();
                Exercise1.divide(inputs[0], inputs[1]);
            } catch (ArithmeticException e) {
                System.out.println("Cannot divide by zero. Please try again.");
            } catch (NegativeIntegerInputException e){
                System.out.println("This operation does not accept negative values. Please try again.");
            }

        }
    }
}