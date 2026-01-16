package analysis.objects;

public final class ObjectInternalInstantiationTest {

    // Entry method
    public static int foo(int publicField, int privateField) {
        // Instantiate Object inside foo
        Obj o = new Obj(publicField, privateField);

        int result = 0;

        // Public instance field
        if (o.publicField > 0) {
            result += 1;
        }

        // Private field via accessor
        if (o.getPrivateField() > 0) {
            result += 2;
        }

        // Static field access (constant)
        if (Obj.STATIC_FIELD == 42) {
            result += 4;
        }

        return result;
    }

    // Small concrete entry point
    public static void main(String[] args) {
        int pub  = args.length > 0 ? Integer.parseInt(args[0]) : 1;
        int priv = args.length > 1 ? Integer.parseInt(args[1]) : -1;

        int result = foo(pub, priv);
        System.out.println("Result = " + result);
    }
}

