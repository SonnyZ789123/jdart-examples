package analysis.instance;

public class SideEffects {
    private int counter;

    public SideEffects(int counter) {
        this.counter = counter;
    }

    public int foo(int n) {
        this.counter = n;

        if (this.counter > 0) {
            return this.counter + 1;
        } else {
            return this.counter - 1;
        }
    }

    public static void main(String[] args) {
        SideEffects instance = new SideEffects(10);
        instance.foo(5);
    }
}
