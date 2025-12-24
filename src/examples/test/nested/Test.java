package test.nested;

public class Test {
    public static int foo(int x) {
        System.out.println("\n-------- In foo! Parameter = " + x);

        if (x < 0) {
            System.out.println("L1 B2: x < 0");

            if (x < -10) {
                System.out.println("L2 B4: x < -10");
                return -14;

            } else {
                System.out.println("L2 B3: -10 <= x < 0");
                return -4;
            }
        } else {
            System.out.println("L1 B1: x >= 0");

            if (x > 10) {
                System.out.println("L2 B2: x > 10");
                return sub_foo(x);
            } else {
                System.out.println("L2 B1: 0 <= x <= 10");

                return sub_foo(x);
            }
        }
    }

    public static int sub_foo(int y) {
        System.out.println("\n-------- In sub_foo! Parameter = " + y);

        if (y % 2 == 0) {
            System.out.println("y is even");
            return y / 2;
        } else {
            System.out.println("y is odd");
            return 3 * y + 1;
        }
    }


    public static void main(String[] args) {
        // Concrete execution entry point (JDart ignores this)
        System.out.println(foo(5));
    }
}
