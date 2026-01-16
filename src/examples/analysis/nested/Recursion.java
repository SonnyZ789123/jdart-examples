package analysis.nested;

public class Recursion {
    public static int factorial(int n) {
        if (n <= 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    public static void main(String[] args) {
        int n = args.length > 0 ? Integer.parseInt(args[0]) : 5;
        int result = factorial(n);
        System.out.println("Factorial of " + n + " is: " + result);
    }
}
