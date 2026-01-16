package analysis.loops;

public final class BoundedLoopHappyPath {

    // Method under test
    public static int foo(int n) {
        int sum = 0;

        // Happy-path bounded loop:
        // - Upper bound is small
        // - No breaks, no continues
        // - No exceptional behavior
        for (int i = 0; i < n && i < 3; i++) {
            sum += i;
        }

        return sum;
    }

    // Small concrete entry point
    public static void main(String[] args) {
        int n = args.length > 0 ? Integer.parseInt(args[0]) : 5;
        int result = foo(n);
        System.out.println("Result = " + result);
    }
}

