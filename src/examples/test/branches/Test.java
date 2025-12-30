package test.branches;

public class Test {

    public enum Mode {
        ZERO,
        NEGATIVE,
        POSITIVE
    }

    public static int foo(int x, int y, Mode mode) {
        System.out.println(
                "\n-------- In foo! Parameters = x:" + x + ", y:" + y + ", mode:" + mode
        );

        // L1
        if (x == y) { // IF_ICMPEQ
            System.out.println("L1: x == y");

            // L2 (enum switch)
            switch (mode) {
                case ZERO:
                    System.out.println("L2: mode == ZERO");
                    return 0;

                case NEGATIVE:
                    System.out.println("L2: mode == NEGATIVE");
                    return -1;

                default:
                    System.out.println("L2: mode == POSITIVE");
                    return 1;
            }

        } else if (x < 0) { // IFLT
            System.out.println("L1: x < 0");

            // L2
            if (y <= 0) { // IFLE
                System.out.println("L2: y <= 0");

                // L3
                if ((x + y) != 0) { // IFNE
                    System.out.println("L3: (x + y) != 0");
                    return -10;
                } else {
                    System.out.println("L3: (x + y) == 0");
                    return -11;
                }

            } else {
                System.out.println("L2: y > 0");
                return -5;
            }

        } else { // x > 0 → IFGT
            System.out.println("L1: x > 0");

            // L2 (int switch)
            switch (x) {
                case 1:
                    System.out.println("L2: x == 1");

                    // L3
                    if (y < 5) { // IFLT
                        System.out.println("L3: y < 5");
                        return 10;
                    } else {
                        System.out.println("L3: y >= 5");
                        return 11;
                    }

                case 2:
                    System.out.println("L2: x == 2");
                    return 20;

                default:
                    System.out.println("L2: x > 2");
                    return 30;
            }
        }
    }

    public static void main(String[] args) {
        // Concrete execution entry point (JDart ignores this)
        System.out.println(foo(1, 3, Mode.POSITIVE));
    }
}
