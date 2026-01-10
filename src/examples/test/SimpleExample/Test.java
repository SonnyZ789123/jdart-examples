package test.SimpleExample;

public class Test {

    public static int foo(int x) {
        if (x == 1) {
            return 1;
        }
        if (x == 2) {
            return 2;
        }
        if (x== 3) {
            return 3;
        }
        return x;
    }

    public static void main(String[] args) {
        foo(1);
    }
}
