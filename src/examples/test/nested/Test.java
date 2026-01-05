package test.nested;

public class Test {
    public static int foo(int x) {
        if (x < 5) {
            return sub_foo(x);
        } else {
            switch (x) {
                case 5: return 5;
                case 6: return 6;
                case 7: return 7;
                case 8: return 8;
                case 9: return 9;
                default: return -1;
            }
        }
    }

    public static int sub_foo(int y) {
        if (y == 0) {
            return 0;
        } else if (y == 1) {
            return 1;
        } else if (y == 2) {
            return 2;
        } else {
            return sub_sub_foo(y);
        }
    }

    public static int sub_sub_foo(int z) {
        switch (z) {
            case 3: return 3;
            case 4: return 4;
            default: return -1;
        }
    }

    public static void main(String[] args) {
        // Concrete execution entry point (JDart ignores this)
        System.out.println(foo(5));
    }
}
