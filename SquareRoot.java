public class SquareRoot {
    public static double sqrt(double a) {
        try {
            if (a < 0) {
                throw new ArithmeticException("Cannot calculate square root of a negative number.");
            }
            return Math.sqrt(a);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
            return Double.NaN;
        }
    }
}
