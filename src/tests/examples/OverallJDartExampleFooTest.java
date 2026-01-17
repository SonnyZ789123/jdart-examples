package examples;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class OverallJDartExampleFooTest {

    @Test
    public void test0() {
        int result = OverallJDartExample.foo(964427160, 1543522705, 67108864L, 0.0, false);

        // perform assertions
        assertEquals(0, result);

    }

    @Test
    public void test1() {
        int result = OverallJDartExample.foo(2, 1073741824, 1L, 0.0, false);

        // perform assertions
        assertEquals(1, result);

    }

    @Test
    public void test2() {
        int result = OverallJDartExample.foo(2134900736, 2137098647, 2L, -9.9E-9, false);

        // perform assertions
        assertEquals(0, result);

    }

    @Test
    public void test3() {
        int result = OverallJDartExample.foo(503316480, 1006720203, 512L, 2.407069E-4, false);

        // perform assertions
        assertEquals(1, result);

    }

    @Test
    public void test4() {
        int result = OverallJDartExample.foo(2, 2, 536870912L, 0.0, true);

        // perform assertions
        assertEquals(0, result);

    }

    @Test
    public void test5() {
        int result = OverallJDartExample.foo(2, 1073741824, 1L, 0.0, true);

        // perform assertions
        assertEquals(1, result);

    }

    @Test
    public void test6() {
        int result = OverallJDartExample.foo(2147483646, 2147483647, 1L, 9.7E-9, true);

        // perform assertions
        assertEquals(0, result);

    }

    @Test
    public void test7() {
        int result = OverallJDartExample.foo(1073741822, 2147483645, 1L, 9.7E-9, true);

        // perform assertions
        assertEquals(1, result);

    }

    @Test
    public void test8() {
        int result = OverallJDartExample.foo(0, 0, 1L, 0.0, false);

        // perform assertions
        assertEquals(0, result);

    }

    @Test
    public void test9() {
        int result = OverallJDartExample.foo(0, 2147483647, 1L, 2.3E-9, false);

        // perform assertions
        assertEquals(1, result);

    }

    @Test
    public void test10() {
        int result = OverallJDartExample.foo(0, 2147483647, 1L, 9.7E-9, false);

        // perform assertions
        assertEquals(0, result);

    }

    @Test
    public void test11() {
        int result = OverallJDartExample.foo(0, 2147483645, 1L, 9.7E-9, false);

        // perform assertions
        assertEquals(1, result);

    }

    @Test
    public void test12() {
        int result = OverallJDartExample.foo(3, 1, 5L, 2.0, false);

        // perform assertions
        assertEquals(0, result);

    }

    @Test
    public void test13() {
        int result = OverallJDartExample.foo(2147483646, 1073741823, 1L, 4.6E-9, false);

        // perform assertions
        assertEquals(1, result);

    }

    @Test
    public void test14() {
        int result = OverallJDartExample.foo(2147483646, -3, 1L, -1.7976931348623157E308, false);

        // perform assertions
        assertEquals(0, result);

    }

    @Test
    public void test15() {
        int result = OverallJDartExample.foo(2147483646, 2147483645, 1L, 9.7E-9, false);

        // perform assertions
        assertEquals(1, result);

    }

    @Test
    public void test16() {
        int result = OverallJDartExample.foo(2, 0, 1L, 0.0, true);

        // perform assertions
        assertEquals(0, result);

    }

    @Test
    public void test17() {
        int result = OverallJDartExample.foo(1073741822, 3, 1L, 2.3E-9, true);

        // perform assertions
        assertEquals(1, result);

    }

    @Test
    public void test18() {
        int result = OverallJDartExample.foo(1073741822, 3, 1L, 9.7E-9, true);

        // perform assertions
        assertEquals(0, result);

    }

    @Test
    public void test19() {
        int result = OverallJDartExample.foo(803907700, 534813701, 67108864L, 9.8E-9, true);

        // perform assertions
        assertEquals(1, result);

    }

    @Test
    public void test20() {
        int result = OverallJDartExample.foo(0, -1, 1L, -20.0, false);

        // perform assertions
        assertEquals(0, result);

    }

    @Test
    public void test21() {
        int result = OverallJDartExample.foo(0, -1073741823, 1L, 0.0, false);

        // perform assertions
        assertEquals(0, result);

    }

    @Test
    public void test22() {
        int result = OverallJDartExample.foo(0, -2147483648, 1L, 0.0, false);

        // perform assertions
        assertEquals(1, result);

    }

    @Test
    public void test23() {
        int result = OverallJDartExample.foo(0, -1, 1L, -21.0, false);

        // perform assertions
        assertEquals(0, result);

    }

    @Test
    public void test24() {
        int result = OverallJDartExample.foo(0, 0, -9223372036854775807L, 0.0, false);

        // perform assertions
        assertEquals(-1, result);

    }

    @Test
    public void test25() {
        assertThrows(IllegalArgumentException.class, () -> {
            OverallJDartExample.foo(-2147483648, 0, 0L, 0.0, false);
        });
    }

}

