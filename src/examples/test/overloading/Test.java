package test.overloading;

public class Test {

    public static int foo(int x) {
        switch (x) {
            case 1: return 1;
            case 3: return 3;
            default: return x;
        }
    }

    public static double foo(double y) {
        if (y > 0) {
            return y;
        } else {
            return -y;
        }
    }

    public static int foo(int x, int y) {
        switch (x) {
            case 1: return 1;
            case 2: return 2;
            case 3: return 3;
            default: return y;
        }
    }

    public static void main(String[] args) {
        foo(5);
        foo(3.5);
        foo(2, 10);
    }
}
