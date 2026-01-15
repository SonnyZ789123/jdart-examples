package analysis.simple;

public final class ControlFlowSimple {

    // Run with different values of a, b, c to explore many paths.
    // (JDart: make a, b, c symbolic parameters.)
    public static int foo(int a, int b, int c) {
        // Straight-line primitive computations (no loops, no arrays/objects used)
        int x = a + 3;
        int y = b - 2;
        int z = c ^ 5;              // bitwise to vary paths a bit
        int acc = x + y + z;

        // Short-circuit logic with && and || (includes side-effect-free guards)
        // Note: The second conjunct/disjunct may not be evaluated.
        boolean p = (a > 0 && b > 0) || (c == 0 && a < 10);

        // if–else with nested conditionals
        if (p) {
            acc += 7;

            if (a + b > c) {          // nested if #1
                acc += 10;

                if ((a & 1) == 0) {     // nested if #2 (even/odd)
                    acc += 1;
                } else {
                    acc -= 1;
                }

            } else {
                acc -= 10;

                if (b == c) {           // nested if #3
                    acc *= 2;
                } else {
                    acc /= (c == 0 ? 1 : 2); // keep it total (avoid div-by-zero here)
                }
            }

        } else {
            acc -= 7;

            // Another nested conditional, also uses short-circuit (a guard that can skip the RHS)
            if (a < 0 && (b + c > 100)) {
                acc += 100;
            } else if (b < 0 || (c < 0 && a > -5)) {
                acc -= 100;
            } else {
                acc += 3;
            }
        }

        // switch with fall-through behavior
        // We use a small discriminator to keep it “small” but still expressive.
        int s = (a + 2 * b - c) % 4;     // can be negative in Java
        switch (s) {
            case 0:
                acc += 11;
                // fall-through intentionally
            case 1:
                acc += 22;
                break;
            case 2:
                acc -= 33;
                // fall-through intentionally
            case 3:
                acc -= 44;
                break;
            default:
                // Java's % can yield negative values, so default is reachable.
                acc ^= 0x5A;
                break;
        }

        // Final straight-line primitive cleanup
        // Clamp-ish behavior without loops
        if (acc > 500) acc = 500;
        if (acc < -500) acc = -500;

        return acc;
    }

    // Optional entry point for quick manual testing (not needed for JDart).
    public static void main(String[] args) {
        int a = args.length > 0 ? Integer.parseInt(args[0]) : 1;
        int b = args.length > 1 ? Integer.parseInt(args[1]) : 2;
        int c = args.length > 2 ? Integer.parseInt(args[2]) : 3;
        System.out.println(foo(a, b, c));
    }
}

