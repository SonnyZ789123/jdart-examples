package test.SimpleExample;

public class SimpleExample {

    public static int bar(int d) {
        System.err.println("\n-------- In bar! Parameter = " + d);
        if (d >= 3) {
            System.err.printf("%s\n", "d <= 10 && d >= 3");
            return -10;
        } else {
            System.err.printf("%s\n", "d <= 10 && d < 3");
            return 10;
        }
    }

    public static int foo(int x) {
        System.err.println("\n-------- In foo! Parameter = " + x);
        if (x == 0) {
            System.err.printf("%s\n", "x == 0");
            return 0;
        } else if (x > 10) {
            System.err.printf("%s\n", "x > 10");
            return 1;
        } else {
            System.err.printf("%s\n", "x <= 10");
            int result = bar(x);
            return result;
        }
    }

    public static void main(String[] args) {
        // Concrete execution entry point (JDart ignores this)
        System.out.println(foo(5));
    }
}
