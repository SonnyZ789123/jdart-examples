package analysis.objects;

public class Object {
    public static int STATIC_FIELD = 42;

    public int publicField;

    private int privateField;

    public Object(int publicField, int privateField) {
        this.publicField = publicField;
        this.privateField = privateField;
    }

    public int getPrivateField() {
        return privateField;
    }
}
