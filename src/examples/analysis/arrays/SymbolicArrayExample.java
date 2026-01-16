package analysis.arrays;

public final class SymbolicArrayExample {

    // Entry method
    public static int foo(int idx, int v0, int v1) {
        // Symbolic array contents via parameters
        int[] arr = new int[2];
        arr[0] = v0;
        arr[1] = v1;

        int result = 0;

        // Symbolic index with bounds check
        if (idx >= 0 && idx < arr.length) {
            if (arr[idx] > 0) {
                result = 1;
            } else {
                result = -1;
            }
        }

        return result;
    }

    // Small concrete entry point
    public static void main(String[] args) {
        int idx = args.length > 0 ? Integer.parseInt(args[0]) : 0;
        int v0  = args.length > 1 ? Integer.parseInt(args[1]) : 1;
        int v1  = args.length > 2 ? Integer.parseInt(args[2]) : -1;

        int result = foo(idx, v0, v1);
        System.out.println("Result = " + result);
    }
}

