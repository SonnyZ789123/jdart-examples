package analysis.arrays;

public class ArrayBounds {
    // Entry method
    public static int foo(int n) {
        int[] arr = { 10, 20, 30 };

        switch (n) {
            case 0:
                return arr[0];
            case 1:
                return arr[1];
            case 2:
                return arr[2];
            default:
                // No handling for other values of n
                break;
        }

        // Potential out-of-bounds access
        return arr[n];
    }

    // Small concrete entry point
    public static void main(String[] args) {
        int result = foo(0);
        System.out.println("Result = " + result);
    }
}
