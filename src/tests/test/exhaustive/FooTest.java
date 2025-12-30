package test.exhaustive;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BranchingExhaustiveExampleTest {

    /* =========================
       L1: x == (int)y
       enum switch
       ========================= */

    @Test
    void xEqualsY_modeZero() {
        int result = test.exhaustive.Test.foo(1, 1.0,
                test.exhaustive.Test.Mode.ZERO);
        assertEquals(0, result);
    }

    @Test
    void xEqualsY_modeNegative() {
        int result = test.exhaustive.Test.foo(2, 2.0,
                test.exhaustive.Test.Mode.NEGATIVE);
        assertEquals(-1, result);
    }

    @Test
    void xEqualsY_modePositive() {
        int result = test.exhaustive.Test.foo(3, 3.0,
                test.exhaustive.Test.Mode.POSITIVE);
        assertEquals(1, result);
    }

    /* =========================
       L1: x < 0 && y <= 0
       nested if + ternary
       ========================= */

    @Test
    void negativeX_negativeY_nonZeroSum_modeZero() {
        int result = test.exhaustive.Test.foo(-2, -1.0,
                test.exhaustive.Test.Mode.ZERO);
        assertEquals(-10, result);
    }

    @Test
    void negativeX_negativeY_zeroSum() {
        int result = test.exhaustive.Test.foo(-1, 1.0,
                test.exhaustive.Test.Mode.POSITIVE);
        // Falls through to OR-branch (x < 0 || y < 0)
        assertEquals(-5, result);
    }

    /* =========================
       L1: x < 0 || y < 0
       switch + fall-through
       ========================= */

    @Test
    void negativeX_orNegativeY_branch() {
        int result = test.exhaustive.Test.foo(-1, 10.0,
                test.exhaustive.Test.Mode.ZERO);
        assertEquals(-5, result);
    }

    /* =========================
       L1: else
       int switch
       ========================= */

    @Test
    void xZero_yZero() {
        int result = test.exhaustive.Test.foo(0, 0.0,
                test.exhaustive.Test.Mode.POSITIVE);
        assertEquals(1, result);
    }

    @Test
    void xZero_yNonZero() {
        int result = test.exhaustive.Test.foo(0, 5.0,
                test.exhaustive.Test.Mode.POSITIVE);
        assertEquals(101, result);
    }

    /* =========================
       x == 1
       labeled continue / break
       ========================= */

    @Test
    void xOne_labeledLoops() {
        int result = test.exhaustive.Test.foo(1, 5.0,
                test.exhaustive.Test.Mode.ZERO);
        assertTrue(result >= 110 && result <= 112);
    }

    /* =========================
       x == 2
       try / catch / finally
       ========================= */

    @Test
    void xTwo_tryBranch() {
        int result = test.exhaustive.Test.foo(2, 5.0,
                test.exhaustive.Test.Mode.POSITIVE);
        assertEquals(200, result);
    }

    /* =========================
       x default
       ternary operator
       ========================= */

    @Test
    void xDefault_yLessThanOne() {
        int result = test.exhaustive.Test.foo(5, 0.5,
                test.exhaustive.Test.Mode.ZERO);
        assertEquals(300, result);
    }

    @Test
    void xDefault_yGreaterEqualOne() {
        int result = test.exhaustive.Test.foo(5, 2.0,
                test.exhaustive.Test.Mode.ZERO);
        assertEquals(301, result);
    }
}
