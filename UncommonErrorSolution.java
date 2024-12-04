public class UncommonErrorSolution {
    public static void main(String[] args) {
        try {
            int result = 10 / 0; // This line will throw an ArithmeticException
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.err.println("ArithmeticException caught: Division by zero!");
            // Handle the exception appropriately
            // For example, you could set a default value or log the error
            int result = 0; // Default value
        } finally {
            System.out.println("Finally block executed");
        }
        System.out.println("Program continues after exception handling");
    }
}