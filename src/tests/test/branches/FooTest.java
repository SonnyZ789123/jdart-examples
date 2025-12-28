package test.branches;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import test.branches.Test.Mode;

public class FooTest {
    /**
     * Covers:
     *  - x == y
     *  - enum switch: ZERO
     */
    @Test
    public void testEqualZeroMode() {
        int result = test.branches.Test.foo(0, 0, Mode.ZERO);
        assertEquals(0, result);
    }

    /**
     * Covers:
     *  - x == y
     *  - enum switch: NEGATIVE
     */
    @Test
    public void testEqualNegativeMode() {
        int result = test.branches.Test.foo(5, 5, Mode.NEGATIVE);
        assertEquals(-1, result);
    }

    /**
     * Covers:
     *  - x < 0
     *  - y <= 0
     *  - (x + y) != 0
     */
    @Test
    public void testNegativeXYNonZeroSum() {
        int result = test.branches.Test.foo(-3, -1, Mode.POSITIVE);
        assertEquals(-10, result);
    }

    /**
     * Covers:
     *  - x > 0
     *  - switch(x): case 1
     *  - y < 5
     */
    @Test
    public void testPositiveCaseOneSmallY() {
        int result = test.branches.Test.foo(1, 2, Mode.POSITIVE);
        assertEquals(10, result);
    }
}
