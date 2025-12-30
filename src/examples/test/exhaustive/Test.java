package test.exhaustive;

public class Test {

    public enum Mode {
        ZERO,
        NEGATIVE,
        POSITIVE
    }

    public static int foo(int x, double y, Mode mode) {
        System.out.println(
                "\n-------- In foo! Parameters = x:" + x + ", y:" + y + ", mode:" + mode
        );

        // LOOP L0 (for-loop, break)
        for (int i = 0; i < 3; i++) {
            System.out.println("L0: for i=" + i);
            if (i == x) {
                System.out.println("L0: i == x, breaking");
                break;
            }
        }

        // LOOP L0b (enhanced for-loop, continue)
        int[] arr = {0, 1, 2};
        for (int v : arr) {
            if (v == x) {
                System.out.println("L0b: v == x, continuing");
                continue;
            }
            System.out.println("L0b: v=" + v);
        }

        // LOOP L0c (while-loop)
        int w = 0;
        while (w < 2) {
            System.out.println("L0c: while w=" + w);
            w++;
        }

        // LOOP L0d (do-while loop)
        int d = 0;
        do {
            System.out.println("L0d: do-while d=" + d);
            d++;
        } while (d < 1);

        // L1 (if / else-if / else + nested ternary)
        if (x == (int) y) { // IF_ICMPEQ-ish (int compare)
            System.out.println("L1: x == (int)y");

            // L2 (switch on enum: case, default)
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

        } else if (x < 0 && y <= 0) { // short-circuit AND
            System.out.println("L1: x < 0 && y <= 0");

            // L2 (nested if: if/else)
            if ((x + y) != 0) {
                System.out.println("L2: (x + y) != 0");

                // L3 (ternary operator)
                int t = (mode == Mode.ZERO) ? -10 : -11;
                System.out.println("L3: ternary picked " + t);
                return t;
            } else {
                System.out.println("L2: (x + y) == 0");
                return -12;
            }

        } else if (x < 0 || y < 0) { // short-circuit OR
            System.out.println("L1: (x < 0) || (y < 0)");

            // L2 (switch with fall-through + break)
            int bucket = (x < 0) ? 0 : 1;
            switch (bucket) {
                case 0:
                    System.out.println("L2: bucket == 0 (x<0)");
                    // fall-through on purpose
                case 1:
                    System.out.println("L2: bucket == 1 (x>=0 or fell-through)");
                    break;
                default:
                    System.out.println("L2: bucket default");
            }
            return -5;

        } else { // x >= 0 and y >= 0 and x != (int)y
            System.out.println("L1: else (x >= 0 and y >= 0 and x != (int)y)");

            // L2 (switch on int: cases + default)
            switch (x) {
                case 0:
                    System.out.println("L2: x == 0");

                    // L3 (nested if)
                    if (y == 0.0) {
                        System.out.println("L3: y == 0.0");
                        return 100;
                    } else {
                        System.out.println("L3: y != 0.0");
                        return 101;
                    }

                case 1:
                    System.out.println("L2: x == 1");

                    // L3 (label + continue/break with label)
                    int sum = 0;
                    outer:
                    for (int i = 0; i < 2; i++) {
                        for (int j = 0; j < 2; j++) {
                            System.out.println("L3: outer i=" + i + ", inner j=" + j);
                            if (j == 0) {
                                System.out.println("L3: j == 0, continue outer");
                                continue outer; // labeled continue
                            }
                            sum += i + j;
                            if (sum > 1) {
                                System.out.println("L3: sum > 1, break outer");
                                break outer; // labeled break
                            }
                        }
                    }
                    return 110 + sum;

                case 2:
                    System.out.println("L2: x == 2");

                    // L3 (try/catch/finally as branching)
                    try {
                        if (mode == null) {
                            System.out.println("L3: mode == null, throwing");
                            throw new IllegalArgumentException("mode");
                        }
                        System.out.println("L3: try ok");
                        return 200;
                    } catch (RuntimeException e) {
                        System.out.println("L3: caught " + e.getClass().getSimpleName());
                        return 201;
                    } finally {
                        System.out.println("L3: finally");
                    }

                default:
                    System.out.println("L2: x default");

                    // L3 (conditional operator + simple guard)
                    int r = (y < 1.0) ? 300 : 301;
                    System.out.println("L3: r=" + r);
                    return r;
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(foo(1, 1.0, Mode.ZERO));
        System.out.println(foo(-1, -2.0, Mode.NEGATIVE));
        System.out.println(foo(2, 3.0, Mode.POSITIVE));
        System.out.println(foo(0, 5.0, Mode.POSITIVE));
        System.out.println(foo(5, 0.5, Mode.ZERO));
    }
}
