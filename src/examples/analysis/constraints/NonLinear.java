package analysis.constraints;

public class NonLinear {
    public static int foo(double x, double y) {
        if (x >= 0) {
            if (x + 1 == x * y) {
                return 1;
            } else {
                return 2;
            }
        } else {
            if (6 * x == x * y) {
                return 3;
            } else {
                return 4;
            }
        }
    }

    public static void main(String[] args) {
        int result = foo(400, 10.0);
        System.out.println("Result = " + result);
    }
}

