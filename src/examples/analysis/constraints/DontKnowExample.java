package analysis.constraints;

public class DontKnowExample {
    public static int foo(double x, double y) {
        if (Math.asin(x) + Math.acos(y) == Math.max(x, y)) {
            return 1;
        }
        return 2;
    }

    public static void main(String[] args) {
        int result = foo(3.1416, 1.41421356);
        System.out.println("Result = " + result);
    }
}
