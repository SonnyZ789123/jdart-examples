package analysis.exceptions;

public final class ExceptionCases {

    // Entry method
    public static int foo(int n) {
        // 1. Explicit exception path
        if (n == 0) {
            throw new IllegalArgumentException("n must not be zero");
        }

        // 2. Implicit runtime exception: division by zero
        if (n == 1) {
            int x = 10 / (n - 1);   // division by zero
            return x;
        }

        // 3. Implicit runtime exception: null dereference
        if (n == 2) {
            int[] a = null;
            return a.length;       // NullPointerException
        }

        // 4. Uncaught exception-triggered path: array index out of bounds
        int[] arr = new int[2];
        return arr[n];           // ArrayIndexOutOfBoundsException possible
    }

    // Small concrete entry point
    public static void main(String[] args) {
        int n = args.length > 0 ? Integer.parseInt(args[0]) : 3;

        int result = foo(n);
        System.out.println("Result = " + result);
    }
}
