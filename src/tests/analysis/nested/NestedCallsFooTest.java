package analysis.nested;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class NestedCallsFooTest {

    @Test
    public void test0() {
        int result = NestedCalls.foo(-2147483646);

        // perform assertions
        assertEquals(0, result);

    }

    @Test
    public void test1() {
        int result = NestedCalls.foo(3);

        // perform assertions
        assertEquals(1, result);

    }

    @Test
    public void test2() {
        int result = NestedCalls.foo(536557627);

        // perform assertions
        assertEquals(3, result);

    }

    @Test
    public void test3() {
        int result = NestedCalls.foo(12);

        // perform assertions
        assertEquals(2, result);

    }

}

