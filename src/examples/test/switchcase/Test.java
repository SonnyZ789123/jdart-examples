package test.switchcase;

public class Test {

    public static int foo(int x) {
        switch (x) {
            case 1: return 1;
            case 3: return 3;
            default: return x;
        }
    }

    public static void main(String[] args) {
        foo(5);
    }
}
