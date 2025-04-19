// Division.java
public class Division {
    // divides two numbers
    public static void divide(double x, double y) {
        if (y == 0) {
            // throw an exception if the divisor is zero
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        System.out.println("Result: " + (x / y));
    }
}