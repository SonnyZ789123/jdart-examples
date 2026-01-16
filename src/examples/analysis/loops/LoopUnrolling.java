package analysis.loops;

public class LoopUnrolling {
    public static int foo(int n) {
        while (n > 0) {
            n--;
        }

        return n;
    }

    public static void main(String[] args) {
        int result = foo(5);
        System.out.println("Result: " + result);
    }
}
