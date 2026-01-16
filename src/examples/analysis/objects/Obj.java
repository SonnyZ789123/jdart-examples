package analysis.objects;

public class Obj {
    public static int STATIC_FIELD = 42;

    public int publicField;

    private int privateField;

    public Obj(int publicField, int privateField) {
        this.publicField = publicField;
        this.privateField = privateField;
    }

    public int getPrivateField() {
        return privateField;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Obj other = (Obj) o;
        return publicField == other.publicField && privateField == other.privateField;
    }
}
