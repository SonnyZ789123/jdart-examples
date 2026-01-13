package test.testsuites;

public class Test {

    public int bar(int a) {
        if (a == 4) {
            return 4;
        }
        if (a == 5) {
            return 5;
        }
        if (a== 6) {
            throw new RuntimeException();
        }
        return a + 100;
    }

    public static int foo(int x, int y) {
        if (x == 1) {
            return 1;
        }
        if (x == 2) {
            return 2;
        }
        if (x== 3) {
            return 3;
        }
        return x + y;
    }

    public static void main(String[] args) {
        foo(1, 2);

        Test test = new Test();
        test.bar(4);
    }
}
