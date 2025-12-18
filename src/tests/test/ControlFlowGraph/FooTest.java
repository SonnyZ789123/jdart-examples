package test.ControlFlowGraph;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static test.ControlFlowGraph.Test.foo;

class FooTest {

    @Test
    void testNegativeLessThanMinusTenEven() {
        // x < 0, x < -10, even
        int result = foo(-12);
        assertEquals(-4, result);
    }

    @Test
    void testNegativeBetweenMinusTenAndZeroNotMinusFive() {
        // x < 0, -10 <= x < 0, x != -5
        int result = foo(-3);
        assertEquals(-1, result);
    }

    @Test
    void testNonNegativeBetweenZeroAndTen() {
        // x >= 0, 0 <= x <= 10, x + 3.14 < 256
        int result = foo(7);
        assertEquals(10, result);
    }

    @Test
    void testGreaterThanTenSinBelowThreshold() {
        // x > 10, sin(x) <= 0.5
        int result = foo(11); // sin(11) ≈ -0.999
        assertEquals(102, result);
    }
}
