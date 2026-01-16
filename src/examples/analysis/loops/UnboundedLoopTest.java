package analysis.loops;

public final class UnboundedLoopTest {

    // Method under test
    public static int countDown(int n) {
        int steps = 0;

        // Unbounded / data-dependent loop:
        // termination depends on symbolic input n
        while (n > 0) {
            n--;          // progress is explicit
            steps++;

            // Soft safety guard to keep execution finite in concrete runs,
            // but still data-dependent for JDart.
            if (steps > 10) {
                break;
            }
        }

        return steps;
    }

    public static int infiniteSteps(int n) {
        int steps = 0;

        // Unbounded / data-dependent loop:
        // termination depends on symbolic input n
        while (n != 0) {
            n--;          // progress is explicit
            steps++;
        }

        return steps;
    }

    public static int infiniteConstraints(int n) {
        int steps = 0;

        // Unbounded / data-dependent loop:
        // termination depends on symbolic input n
        for (int i = 0; i < n; i++) {
            steps++;
        }

        return steps;
    }

    // Small concrete entry point
    public static void main(String[] args) {
        int n = args.length > 0 ? Integer.parseInt(args[0]) : 5;
        int result = countDown(n);
        System.out.println("Steps = " + result);
    }
}
