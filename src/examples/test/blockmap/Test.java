package test.blockmap;

public class Test {

    public static int foo(int x) {
        if (x == 0) {
            return 0;
        }

        return x > 0 ? x : -x;
    }

    public static void main(String[] args) {
        foo(1);
    }
}
