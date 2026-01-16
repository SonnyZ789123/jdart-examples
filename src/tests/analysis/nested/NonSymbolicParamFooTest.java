package analysis.nested;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class NonSymbolicParamFooTest {

    @Test
    public void test0() {
        int result = NonSymbolicParam.foo(-2147483644);

        // perform assertions
        assertEquals(0, result);

    }

    @Test
    public void test1() {
        int result = NonSymbolicParam.foo(3);

        // perform assertions
        assertEquals(1, result);

    }

    @Test
    public void test2() {
        int result = NonSymbolicParam.foo(12);

        // perform assertions
        assertEquals(11, result);

    }

}

