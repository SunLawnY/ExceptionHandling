package exercises;

public class Exercise1 {
    public static int divide(int a, int b) throws NegativeIntegerInputException {
        if (a < 0 || b < 0){
            throw new NegativeIntegerInputException();
        }

        return a/b;
    }

}
