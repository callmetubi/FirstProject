public class exceptionMain {

    public static void main(String[] args) {
        try {
            // Example calls with different values
            ExceptionHandling.performOperation(2);  // No exception
            ExceptionHandling.performOperation(0);  // Throws ArithmeticException
            ExceptionHandling.performOperation(-1); // Throws ArrayIndexOutOfBoundsException
        } catch (Exception e) {
            System.out.println("Exception caught in the main method: " + e.getMessage());
        }
    }
}


