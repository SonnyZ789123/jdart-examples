package examples;

public final class OverallJDartExample {

    // -------------------------
    // Static state
    // -------------------------
    static int STATIC_THRESHOLD = 10;

    // -------------------------
    // User-defined class
    // -------------------------
    public static final class Box {
        public int value;

        public Box(int value) {
            this.value = value;
        }
    }

    // -------------------------
    // Entry method (symbolic)
    // -------------------------
    public static int foo(int n, int m, long limit, double scale, boolean flag) {

        // Primitive branching (int)
        if (n < 0) {
            throw new IllegalArgumentException("n must be non-negative");
        }

        // Branch on long
        if (limit <= 0L) {
            return -1;
        }

        // Array with symbolic elements, concrete length
        int[] arr = new int[2];
        arr[0] = n;
        arr[1] = m;

        // User-defined object instantiated inside foo
        Box box = new Box(n);

        // Nested call #1 (arrays + int arithmetic)
        int sum = helperSum(arr);

        // Nested call #2 (object + boolean)
        int adjusted = helperAdjust(sum, box, flag);

        // Use double in a simple, safe way
        double scaled = adjusted * scale;

        // Branch on double (avoid NaN / inf)
        if (scaled > 20.0) {
            adjusted += 2;
        } else if (scaled < 5.0) {
            adjusted -= 2;
        }

        // Static-state-dependent branch
        if (adjusted > STATIC_THRESHOLD) {
            return 1;
        } else {
            return 0;
        }
    }

    // -------------------------
    // Helper method 1 (arrays)
    // -------------------------
    private static int helperSum(int[] arr) {
        if (arr[0] > arr[1]) {
            return arr[0] + arr[1];
        } else {
            return arr[1] - arr[0];
        }
    }

    // -------------------------
    // Helper method 2 (object + branching)
    // -------------------------
    private static int helperAdjust(int x, Box box, boolean flag) {

        // Branch on object field
        if (box.value == 0) {
            return x;
        }

        if (flag) {
            return x + box.value;
        } else {
            return x - box.value;
        }
    }

    // -------------------------
    // Concrete entry point
    // -------------------------
    public static void main(String[] args) {
        int n = args.length > 0 ? Integer.parseInt(args[0]) : 3;
        int m = args.length > 1 ? Integer.parseInt(args[1]) : 1;
        long limit = args.length > 2 ? Long.parseLong(args[2]) : 5L;
        double scale = args.length > 3 ? Double.parseDouble(args[3]) : 2.0;
        boolean flag = args.length > 4 && Boolean.parseBoolean(args[4]);

        int result = foo(n, m, limit, scale, flag);
        System.out.println("Result = " + result);
    }
}

