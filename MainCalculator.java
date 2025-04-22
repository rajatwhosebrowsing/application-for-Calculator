// Name: Rajat Dwivedi
// PRN: 23070126100
// Batch: B1 

import java.util.Scanner;

public class MainCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        double num1, num2;

        while (true) {
            System.out.println("\n===== Calculator Menu =====");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Square");
            System.out.println("6. Cube");
            System.out.println("7. Square Root");
            System.out.println("8. Exit");
            System.out.print("Enter your choice: ");

            try {
                if (!scanner.hasNextInt()) {
                    throw new CalculatorExceptions.InvalidInputException("Choice must be an integer.");
                }

                choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        System.out.print("Enter two numbers: ");
                        num1 = scanner.nextDouble();
                        num2 = scanner.nextDouble();
                        System.out.println("Result: " + Addition.add(num1, num2));
                        break;
                    case 2:
                        System.out.print("Enter two numbers: ");
                        num1 = scanner.nextDouble();
                        num2 = scanner.nextDouble();
                        System.out.println("Result: " + Subtraction.subtract(num1, num2));
                        break;
                    case 3:
                        System.out.print("Enter two numbers: ");
                        num1 = scanner.nextDouble();
                        num2 = scanner.nextDouble();
                        System.out.println("Result: " + Multiplication.multiply(num1, num2));
                        break;
                    case 4:
                        System.out.print("Enter two numbers: ");
                        num1 = scanner.nextDouble();
                        num2 = scanner.nextDouble();
                        System.out.println("Result: " + Division.divide(num1, num2));
                        break;
                    case 5:
                        System.out.print("Enter a number: ");
                        num1 = scanner.nextDouble();
                        System.out.println("Result: " + Square.square(num1));
                        break;
                    case 6:
                        System.out.print("Enter a number: ");
                        num1 = scanner.nextDouble();
                        System.out.println("Result: " + Cube.cube(num1));
                        break;
                    case 7:
                        System.out.print("Enter a number: ");
                        num1 = scanner.nextDouble();
                        System.out.println("Result: " + SquareRoot.sqrt(num1));
                        break;
                    case 8:
                        System.out.println("Exiting... Goodbye!");
                        scanner.close();
                        System.exit(0);
                    default:
                        throw new CalculatorExceptions.OperationNotSupportedException("Invalid operation selected.");
                }

            } catch (CalculatorExceptions.InvalidInputException |
                     CalculatorExceptions.OverflowException |
                     CalculatorExceptions.UnderflowException |
                     CalculatorExceptions.OperationNotSupportedException e) {
                System.out.println("Error: " + e.getMessage());
                scanner.nextLine(); // Clear buffer
            } catch (CalculatorExceptions.DivisionByZeroException |
                     CalculatorExceptions.NegativeSqrtException e) {
                System.out.println("Math Error: " + e.getMessage());
            } catch (Exception e) {
                System.out.println("Unexpected Error: " + e.getMessage());
                scanner.nextLine(); // Clear buffer
            }
        }
    }
}
