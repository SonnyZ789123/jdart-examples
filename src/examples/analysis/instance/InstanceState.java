package analysis.instance;

public class InstanceState {
    private int state;

    public InstanceState(int state) {
        this.state = state;
    }

    public int foo(int n) {
        if (state > 0) {
            if (n < 10) {
                return n + 1;
            } else {
                return n - 1;
            }
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        InstanceState instance = new InstanceState(1);
        int result = instance.foo(5);
        System.out.println("Result: " + result);

        InstanceState instance1 = new InstanceState(-1);
        int result1 = instance1.foo(5);
        System.out.println("Result: " + result1);
    }
}
