package analysis.concurrency;

public final class SimpleConcurrencyExample {

    // Shared static state
    static int counter = 0;

    // Entry method
    public static int foo(int n) {

        Thread t1 = new Thread(() -> {
            // Branch depends on input
            if (n > 0) {
                counter += 1;
            } else {
                counter -= 1;
            }
        });

        Thread t2 = new Thread(() -> {
            // Branch depends on shared state
            if (counter == 0) {
                counter += 10;
            } else {
                counter += 100;
            }
        });

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            // ignore
        }

        // Branch after concurrency
        if (counter > 10) {
            return 1;
        } else {
            return 0;
        }
    }

    // Small concrete entry point
    public static void main(String[] args) {
        int n = args.length > 0 ? Integer.parseInt(args[0]) : 1;
        int result = foo(n);
        System.out.println("Result = " + result);
    }
}
