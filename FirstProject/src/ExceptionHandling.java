public class ExceptionHandling {
    public static void performOperation(int value) {
        try {
            if (value == 0) {
                throw new ArithmeticException("Cannot perform operation with value 0");
            } else if (value < 0) {
                int[] array = new int[5];
                int result = array[value];
            } else {
                // No exception will be thrown for positive values
                System.out.println("Operation performed successfully!");
            }
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed.");
        }
    }

}
