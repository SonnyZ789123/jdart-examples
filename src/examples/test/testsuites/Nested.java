package test.testsuites;

public class Nested {
    int x;

    public Nested(int x) {
        this.x = x;
    }

    public int nestedFoo(int y) {
        if (x == 1) {
            switch (y) {
                case 0: return 0;
                case 1: return 1;
                case 2: return 2;
                default: return -1;
            }
        }
        if (x == 2) {
            return y + 2;
        }
        return x + y;
    }

    public static void main(String[] args) {
        Nested nested1 = new Nested(1);
        nested1.nestedFoo(1);

        Nested nested2 = new Nested(2);
        nested2.nestedFoo(3);
    }
}
