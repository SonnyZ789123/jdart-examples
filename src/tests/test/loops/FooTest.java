package test.loops;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FooTest {

    /* =========================
       L0: i == x at first iteration
       ========================= */
    @Test
    void xEqualsZero_returnsZero() {
        int result = test.loops.Test.foo(0);
        assertEquals(0, result);
    }

    /* =========================
       L0: i == x at third iteration
       ========================= */
    @Test
    void xEqualsTwo_returnsTwo() {
        int result = test.loops.Test.foo(2);
        assertEquals(2, result);
    }

    /* =========================
       Negative input
       ========================= */
    @Test
    void xNegative_returnsMinusOne() {
        int result = test.loops.Test.foo(-1);
        assertEquals(-1, result);
    }
}
