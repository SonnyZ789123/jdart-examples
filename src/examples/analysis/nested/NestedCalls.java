package analysis.nested;

public final class NestedCalls {

    // Entry method (JDart target)
    public static int foo(int n) {
        if (n > 0) {
            return helper1(n);
        }
        return 0;
    }

    private static int helper1(int n) {
        if (n > 10) {
            return helper2(n);
        }
        return 1;
    }

    private static int helper2(int n) {
        if (n % 2 == 0) {
            return 2;
        }
        return 3;
    }

    // Small concrete entry point
    public static void main(String[] args) {
        int n = args.length > 0 ? Integer.parseInt(args[0]) : 12;
        int result = foo(n);
        System.out.println("Result = " + result);
    }
}

