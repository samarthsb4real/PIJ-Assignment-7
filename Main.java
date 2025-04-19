// Name: Samarth Bhadane
// PRN: 24070126503
// Batch: A2

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        double a, b;
        while (true) {
            try {
                // displaying the menu
                System.out.println("\n====== Calculator Menu ======");
                System.out.println("1. Addition");
                System.out.println("2. Subtraction");
                System.out.println("3. Multiplication");
                System.out.println("4. Division");
                System.out.println("5. Square");
                System.out.println("6. Cube");
                System.out.println("7. Square Root");
                System.out.println("8. Exit");
                System.out.print("Enter your choice: ");

                choice = Integer.parseInt(sc.nextLine());

                // handling the choice
                switch (choice) {
                    case 1:
                        System.out.print("Enter two numbers: ");
                        a = Double.parseDouble(sc.nextLine());
                        b = Double.parseDouble(sc.nextLine());
                        Addition.add(a, b);
                        break;
                    case 2:
                        System.out.print("Enter two numbers: ");
                        a = Double.parseDouble(sc.nextLine());
                        b = Double.parseDouble(sc.nextLine());
                        Subtraction.subtract(a, b);
                        break;
                    case 3:
                        System.out.print("Enter two numbers: ");
                        a = Double.parseDouble(sc.nextLine());
                        b = Double.parseDouble(sc.nextLine());
                        Multiplication.multiply(a, b);
                        break;
                    case 4:
                        System.out.print("Enter two numbers: ");
                        a = Double.parseDouble(sc.nextLine());
                        b = Double.parseDouble(sc.nextLine());
                        Division.divide(a, b);
                        break;
                    case 5:
                        System.out.print("Enter a number: ");
                        a = Double.parseDouble(sc.nextLine());
                        Square.square(a);
                        break;
                    case 6:
                        System.out.print("Enter a number: ");
                        a = Double.parseDouble(sc.nextLine());
                        Cube.cube(a);
                        break;
                    case 7:
                        System.out.print("Enter a number: ");
                        a = Double.parseDouble(sc.nextLine());
                        SquareRoot.squareRoot(a);
                        break;
                    case 8:
                        System.out.println("Exiting...");
                        sc.close();
                        return;
                    default:
                        System.out.println("Invalid choice. Please choose between 1 to 8.");
                }
            } catch (NumberFormatException e) {
                // handle invalid input for numbers
                System.out.println("Input Error: Please enter valid numeric input.");
            } catch (InputMismatchException e) {
                // handle invalid input for choice
                System.out.println("Input Mismatch: Invalid data type entered.");
                sc.next(); // clear buffer
            } catch (ArithmeticException e) {
                // handle division by zero
                System.out.println("Math Error: " + e.getMessage());
            } catch (IllegalArgumentException e) {
                // handle illegal argument for square root
                System.out.println("Illegal Argument: " + e.getMessage());
            } catch (Exception e) {
                // handle any other unexpected exceptions
                System.out.println("Unexpected Error: " + e.getMessage());
            }
        }
    }
}
