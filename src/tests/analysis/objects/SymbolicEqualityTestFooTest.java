package analysis.objects;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SymbolicEqualityTestFooTest {

    @Test
    public void test0() {
        int result = SymbolicEqualityTest.foo(2, 0, 0, 0);

        // perform assertions
        assertEquals(2, result);

    }

    @Test
    public void test1() {
        int result = SymbolicEqualityTest.foo(0, 1, 0, 0);

        // perform assertions
        assertEquals(2, result);

    }

    @Test
    public void test2() {
        int result = SymbolicEqualityTest.foo(1, -1, 1, -1);

        // perform assertions
        assertEquals(1, result);

    }

}

