package analysis.random;

import java.util.Random;

public class RandomExample {
    // Entry method
    public static int foo(int n) {
        // Non-deterministic value (not symbolic)
        int r = new Random().nextInt(3); // 0 or 1 or 2

        switch (r) {
            case 0:
                return 0;
            case 1:
                return 1;
            case 2:
                return 2;
            default:
                break;
        }

        if (n > 10) {
            return n;
        } else {
            return -n;
        }
    }

    // Small concrete entry point
    public static void main(String[] args) {
        int n = args.length > 0 ? Integer.parseInt(args[0]) : 5;
        int result = foo(n);
        System.out.println("Result = " + result);
    }
}
