package exercises;

import java.util.ArrayList;

public class Exercise1 {
    public static int divide(int a, int b) throws NegativeIntegerInputException {
        ArrayList<Integer> arr = new ArrayList<>();
        if (a < 0){
            arr.add(a);
        }
        if (b < 0){
            arr.add(b);
        }
        if (!arr.isEmpty()){
            throw new NegativeIntegerInputException("The following negative integer(s) are not allowed in this operation: " + arr);
        }

        return a/b;
    }

}
