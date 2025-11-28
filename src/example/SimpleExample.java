package example;

public class SimpleExample {

    // The function JDart will explore symbolically
    public static int foo(int x) {
        if (x == 0) {
            return 0;
        } else if (x > 10) {
            return 1;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        // Concrete execution entry point (JDart ignores this)
        System.out.println(foo(5));
    }
}
