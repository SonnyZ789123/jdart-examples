package analysis.instance;

public class Simple {
    public int foo(int n) {
        if (n < 10) {
            return n + 1;
        } else {
            return n - 1;
        }
    }

    public static void main(String[] args) {
        Simple instance = new Simple();
        int result = instance.foo(5);
        System.out.println("Result: " + result);
    }
}
