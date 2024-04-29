import exercises.Exercise4;

public class Main {

    public static void main(String[] args) {
//        Exercise3.divide();
        try {
            Exercise4.recursiveMethod();
        } catch (StackOverflowError e){
            System.out.println("Oops, we're out of space on the stack. Goodnight.");
        }

    }
}

