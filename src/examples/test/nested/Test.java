package test.nested;

public class Test {
    public static int bar(int a) {
        if (a < 10) {
            return foo(a);
        } else {
            if (a < 18) {
                return sub_bar(a);
            } else {
                return baz(a);
            }
        }
    }

    public static int sub_bar(int b) {
        switch (b) {
            case 10: return 10;
            case 11: return 11;
            case 12: return 12;
            default: return sub_sub_bar(b);
        }
    }

    public static int sub_sub_bar(int c) {
        if (c == 13) {
            return 13;
        } else if (c == 14) {
            return 14;
        } else {
            return sub_sub_sub_bar(c);
        }
    }

    public static int sub_sub_sub_bar(int d) {
        switch (d) {
            case 15: return 15;
            case 16: return 16;
            case 17: return 17;
            default: return -1;
        }
    }

    public static int baz(int e) {
        if (e == 18) {
            return 18;
        } else if (e == 19) {
            return 19;
        } else {
            return -1;
        }
    }

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
        System.out.println(bar(15));
    }
}
