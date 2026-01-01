package test.loops;

public class Test {

    public static int do_while_loop(int x) {
        System.out.println(
                "\n-------- In do_while_loop! Parameters = x:" + x
        );

        // LOOP L0 (do-while loop)
        int i = 0;
        do {
            System.out.println("L0: do-while i=" + i);
            i++;
        } while (i < 3);

        return x;
    }

    public static int while_loop(int x) {
        System.out.println(
                "\n-------- In while_loop! Parameters = x:" + x
        );

        // LOOP L0 (while-loop)
        int i = 0;
        while (i < 3) {
            System.out.println("L0: while i=" + i);
            i++;
        }

        return x;
    }

    public static int enhanced_for_loop(int x) {
        System.out.println(
                "\n-------- In enhanced_for_loop! Parameters = x:" + x
        );

        // LOOP L0 (enhanced for-loop)
        int[] arr = {0, 1, 2};
        for (int v : arr) {
            System.out.println("L0: enhanced for v=" + v);
        }

        return x;
    }

    public static int for_loop(int x) {
        System.out.println(
                "\n-------- In for_loop! Parameters = x:" + x
        );

        // LOOP L0 (for-loop)
        for (int i = 0; i < 3; i++) {
            System.out.println("L0: for i=" + i);
        }

        return x;
    }

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
        System.out.println(for_loop(-1));
    }
}
