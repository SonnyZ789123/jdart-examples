package analysis.objects;

public class SymbolicEqualityTest {
    // Entry method
    public static int foo(int publicField, int privateField, int publicField2, int privateField2) {
        // Instantiate Object inside foo
        Obj o1 = new Obj(publicField, privateField);
        Obj o2 = new Obj(publicField2, privateField2);

        int result = 0;

        if (o1.equals(o2)) {
            result += 1;
        } else {
            result += 2;
        }

        return result;
    }

    // Small concrete entry point
    public static void main(String[] args) {
        int pub  = args.length > 0 ? Integer.parseInt(args[0]) : 1;
        int priv = args.length > 1 ? Integer.parseInt(args[1]) : -1;

        int result = foo(pub, priv, pub, priv);
        System.out.println("Result = " + result);
    }
}
