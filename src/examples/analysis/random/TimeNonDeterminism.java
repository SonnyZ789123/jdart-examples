package analysis.random;

public class TimeNonDeterminism {
    // Entry method
    public static int foo(int n) {
        // Non-deterministic value (not symbolic)
        int t = (int) (System.currentTimeMillis() / 1000L);
        int lastDigit = t % 10;

        System.out.println("t: " + t);

        switch (lastDigit) {
            case 0:
                return 0;
            case 1:
                return 1;
            case 2:
                return 2;
            default:
                break;
        }

        switch (n) {
            case 0:
                return 0;
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 3;
            case 4:
                return 4;
            default:
                return -1;
        }
    }

    // Small concrete entry point
    public static void main(String[] args) {
        int n = args.length > 0 ? Integer.parseInt(args[0]) : 5;
        int result = foo(n);
        System.out.println("Result = " + result);
    }
}
