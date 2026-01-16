package analysis.arrays;

public final class DeepArrayExample {

    // Entry method
    public static int foo(int[][] arr) {
        if (arr == null) {
            return -1;
        }

        // First dimension check
        if (arr.length != 2) {
            throw new IllegalArgumentException("Array must have exactly two rows.");
        }

        // Second dimension checks
        if (arr[0] == null || arr[1] == null) {
            return -2;
        }

        if (arr[0].length == 1 && arr[1].length == 1) {
            if (arr[0][0] < arr[1][0]) {
                return arr[1][0] - arr[0][0];
            } else {
                return arr[0][0] + arr[1][0];
            }
        }

        return 1;
    }

    // Small concrete entry point
    public static void main(String[] args) {
        int[][] arr;

        // Very small concrete construction
        arr = new int[][] {
                new int[] {1},
                new int[] {2}
        };

        int result = foo(arr);
        System.out.println("Result = " + result);
    }
}

