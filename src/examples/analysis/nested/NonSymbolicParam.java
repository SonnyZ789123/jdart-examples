package analysis.nested;

public final class NonSymbolicParam {

    // Entry method (JDart target)
    public static int foo(int n) {
        if (n > 0) {
            return helper(n, false);
        }
        return 0;
    }

    private static int helper(int n, boolean nonSymbolicParam) {
        if (nonSymbolicParam) {
            throw new RuntimeException("This parameter is non-symbolic");
        }

        if (n > 10) {
            return 11;
        }
        return 1;
    }

    // Small concrete entry point
    public static void main(String[] args) {
        int n = args.length > 0 ? Integer.parseInt(args[0]) : 12;
        int result = foo(n);
        System.out.println("Result = " + result);
    }
}

