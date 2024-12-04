public class UncommonErrorExample {
    public static void main(String[] args) {
        try {
            int result = 10 / 0; // This line will throw an ArithmeticException
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.err.println("ArithmeticException caught: " + e.getMessage()); //Common
            // Let's intentionally not handle the exception properly
            // This will lead to an unexpected behavior or crash in a real application
        } finally {
            System.out.println("Finally block executed");
        }
        System.out.println("Program continues after exception handling");
    }
}