package analysis.arrays;

public final class ArrayInputLengthTest {

    // Entry method
    public static int foo(int[] arr) {
        if (arr == null) {
            return -1;
        }

        // Simple length check
        if (arr.length == 2) {
            if (arr[0] < arr[1]) {
                return 1;
            } else {
                return -1;
            }
        }

        return 0;
    }

    // Small concrete entry point
    public static void main(String[] args) {
        int[] arr = { 1, 2};

        int result = foo(arr);
        System.out.println("Result = " + result);
    }
}

