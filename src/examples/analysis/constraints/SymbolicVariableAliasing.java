package analysis.constraints;

public class SymbolicVariableAliasing {
    public static int foo(int x) {
        int y = x;
        if (y + 2 == x * 2) {
            return y + x;
        } else {
            return y;
        }
    }

    public static void main(String[] args) {
        int result = foo(4);
        System.out.println("Result = " + result);
    }
}
