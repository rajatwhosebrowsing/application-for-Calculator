public class CalculatorExceptions {

    // Division by zero
    public static class DivisionByZeroException extends ArithmeticException {
        public DivisionByZeroException() {
            super("Cannot divide by zero.");
        }
    } 

    // Negative square root
    public static class NegativeSqrtException extends ArithmeticException {
        public NegativeSqrtException() {
            super("Cannot calculate square root of a negative number.");
        }
    }

    // Invalid user input
    public static class InvalidInputException extends IllegalArgumentException {
        public InvalidInputException(String message) {
            super("Invalid input: " + message);
        }
    }

    // Arithmetic overflow
    public static class OverflowException extends ArithmeticException {
        public OverflowException() {
            super("Arithmetic overflow occurred.");
        }
    }

    // Arithmetic underflow
    public static class UnderflowException extends ArithmeticException {
        public UnderflowException() {
            super("Arithmetic underflow occurred.");
        }
    }

    // Unsupported operation
    public static class OperationNotSupportedException extends UnsupportedOperationException {
        public OperationNotSupportedException(String message) {
            super("Unsupported operation: " + message);
        }
    }
}
