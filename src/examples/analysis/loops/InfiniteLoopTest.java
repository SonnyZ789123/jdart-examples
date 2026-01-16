package analysis.loops;

public final class InfiniteLoopTest {

    // Method under test
    public static int foo(int n) {
        int steps = 0;

        while (true) {
            steps++;

            // This will go until infinity if n is negative or zero.
            if (steps == n) {
                break;
            }
        }

        return steps;
    }

    // Small concrete entry point
    public static void main(String[] args) {
        int n = args.length > 0 ? Integer.parseInt(args[0]) : 5;
        int result = foo(n);
        System.out.println("Steps = " + result);
    }
}
