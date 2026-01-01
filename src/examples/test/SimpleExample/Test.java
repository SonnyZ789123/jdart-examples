package test.SimpleExample;

public class Test {

    public static int foo(int x) {
        if (x == 1) {
            return 0;
        }
        if (x == 2) {
            return 1;
        }
        return x;
    }

    public static void main(String[] args) {
        foo(5);
    }
}
