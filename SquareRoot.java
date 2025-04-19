// SquareRoot.java
public class SquareRoot {
    // computes the square root of a number
    public static void squareRoot(double x) {
        if (x < 0) {
            // throw an exception if x is negative
            throw new IllegalArgumentException("Cannot compute square root of a negative number.");
        }
        System.out.println("Result: " + Math.sqrt(x));
    }
}
