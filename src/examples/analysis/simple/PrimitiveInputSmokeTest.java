package analysis.simple;

public final class PrimitiveInputSmokeTest {

    // Method under test: all Java primitive types
    public static int test(
            boolean p,
            byte b,
            short s,
            char c,
            int i,
            long l,
            float f,
            double d
    ) {
        int score = 0;

        // 1. Boolean gate (1 split)
        if (p) {
            score += 1;
        }

        // 2. Group byte + short + int into a single decision (1 split)
        if ((b + s + i) > 0) {
            score += 2;
        }

        // 3. Char collapsed to binary classification (1 split)
        if (c >= 'A' && c <= 'Z') {
            score += 4;
        }

        // 4. long + float combined (1 split)
        if (l > 0 && f > 0.0f) {
            score += 8;
        }

        // 5. double final guard (1 split)
        if (d < 0.0) {
            score += 16;
        }

        return score;
    }

    // Small concrete entry point for manual runs
    public static void main(String[] args) {
        boolean p = true;
        byte b = 1;
        short s = -2;
        char c = 'A';
        int i = 0;
        long l = 2_000_000_000L;
        float f = 1.0f;
        double d = -2.0;

        int result = test(p, b, s, c, i, l, f, d);
        System.out.println("Result = " + result);
    }
}

