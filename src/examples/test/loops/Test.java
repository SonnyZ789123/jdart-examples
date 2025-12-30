package test.loops;

public class Test {

    public static int foo(int x) {
        System.out.println(
                "\n-------- In foo! Parameters = x:" + x
        );

        // LOOP L0 (for-loop, break)
        for (int i = 0; i < 3; i++) {
            System.out.println("L0: for i=" + i);
            if (i == x) {
                System.out.println("L0: i == x, returning i");
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        System.out.println(foo(1));
    }
}
