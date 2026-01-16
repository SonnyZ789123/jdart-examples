package analysis.exceptions;

public final class TryCatchExample {

    // Entry method
    public static int foo(int n) {
        try {
            if (n == 0) {
                // Implicit runtime exception
                int x = 10 / n;   // division by zero
                return x;
            }

            if (n == 1) {
                // Explicit exception
                throw new IllegalStateException("n == 1");
            }

            // Normal path
            return n * 2;

        } catch (ArithmeticException e) {
            // Handles division-by-zero case
            return -1;

        } catch (IllegalStateException e) {
            // Handles explicit exception
            return -2;
        }
    }

    // Small concrete entry point
    public static void main(String[] args) {
        int n = args.length > 0 ? Integer.parseInt(args[0]) : 2;

        int result = foo(n);
        System.out.println("Result = " + result);
    }
}
