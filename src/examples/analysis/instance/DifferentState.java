package analysis.instance;

public class DifferentState {
    private int state = 0;

    public int foo(int n) {
        state = n;
        return compute();
    }

    private int compute() {
        state++;
        switch (state) {
            case 0:
                return 0;
            case 1:
                return 1;
            case 2:
                return 2;
            default:
                return -1;
        }
    }

    public static void main(String[] args) {
        DifferentState evenState = new DifferentState();
        int resultEven = evenState.foo(0);
        System.out.println("Result with even state: " + resultEven);
    }
}
