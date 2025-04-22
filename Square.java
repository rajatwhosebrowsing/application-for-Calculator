public class Square {
    public static double square(double a) {
        double result = a * a;
        if (Double.isInfinite(result)) {
            throw new CalculatorExceptions.OverflowException();
        }
        return result;
    }
}
