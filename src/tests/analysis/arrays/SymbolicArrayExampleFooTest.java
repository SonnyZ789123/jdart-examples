package analysis.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SymbolicArrayExampleFooTest {

    @Test
    public void test0() {
        int result = SymbolicArrayExample.foo(-2147483648, 0, 0);

        // perform assertions
        assertEquals(0, result);

    }

    @Test
    public void test1() {
        int result = SymbolicArrayExample.foo(1073741824, 0, 0);

        // perform assertions
        assertEquals(0, result);

    }

    @Test
    public void test2() {
        int result = SymbolicArrayExample.foo(0, -2147483647, 0);

        // perform assertions
        assertEquals(-1, result);

    }

    @Test
    public void test3() {
        int result = SymbolicArrayExample.foo(0, 1, -1);

        // perform assertions
        assertEquals(1, result);

    }

}

