package example;

public class SimpleExample {

    // The function JDart will explore symbolically
    public static int foo(int x) {
        int y = x + 3;

        if (y > 10) {
            return 1;
        } else if (y == 10) {
            return 2;
        } else {
            return 3;
        }
    }

    public static void main(String[] args) {
        // Concrete execution entry point (JDart ignores this)
        System.out.println(foo(5));
    }
}
