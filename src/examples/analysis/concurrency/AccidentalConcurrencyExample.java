package analysis.concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public final class AccidentalConcurrencyExample {

    // Shared static state across threads
    static int COUNTER = 0;

    // Entry method
    public static int foo(int n) {

        // --------------------------------------------------
        // Explicit exclusion of concurrency (assumption)
        // --------------------------------------------------
        // This method is intended to be single-threaded.
        // However, the code below violates this assumption.
        // --------------------------------------------------

        // 1. Accidental thread creation
        if (n > 0) {
            Thread t = new Thread(() -> {
                // Modifies shared static state
                COUNTER++;
            });
            t.start();
        }

        // 2. Executor-based concurrency
        if (n > 1) {
            ExecutorService exec = Executors.newSingleThreadExecutor();
            exec.submit(() -> {
                // Also modifies shared static state
                COUNTER += 2;
            });
            exec.shutdown();
        }

        // 3. Parallel stream (implicit thread creation)
        if (n > 2) {
            int[] data = {1, 2, 3};
            java.util.Arrays.stream(data).parallel().forEach(x -> {
                // Again modifies shared static state
                COUNTER += x;
            });
        }

        // Read shared static state
        return COUNTER;
    }

    // Small concrete entry point
    public static void main(String[] args) {
        int n = args.length > 0 ? Integer.parseInt(args[0]) : 3;
        int result = foo(n);
        System.out.println("Result = " + result);
    }
}
