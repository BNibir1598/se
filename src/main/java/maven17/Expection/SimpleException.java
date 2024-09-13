package maven17.Expection;

public class SimpleException {

    // Method that throws an exception if the input is invalid
    public int divide(int numerator, int denominator) throws IllegalArgumentException {
        if (denominator == 0) {
            throw new IllegalArgumentException("Denominator cannot be zero");
        }
        return numerator / denominator;
    }

    public static void main(String[] args) {
        SimpleException simpleException = new SimpleException();

        // Test with valid input
        try {
            System.out.println("Test with valid input: " + simpleException.divide(10, 5)); // Expected output: 2
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }

        // Test with zero denominator to trigger the exception
        try {
            simpleException.divide(10, 0);
        } catch (IllegalArgumentException e) {
            System.out.println("Caught exception for zero denominator: " + e.getMessage()); // Expected: Denominator cannot be zero
        }
    }
}
