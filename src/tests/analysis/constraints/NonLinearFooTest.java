package analysis.constraints;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class NonLinearFooTest {

    @Test
    public void test0() {
        int result = NonLinear.foo(-1.0, 0.0);

        // perform assertions
        assertEquals(4, result);

    }

    @Test
    public void test1() {
        int result = NonLinear.foo(-1.7976931348623157E308, 6.0);

        // perform assertions
        assertEquals(3, result);

    }

    @Test
    public void test2() {
        int result = NonLinear.foo(400.0, 10.0);

        // perform assertions
        assertEquals(2, result);

    }

    @Test
    public void test3() {
        int result = NonLinear.foo(1.0, 2.0);

        // perform assertions
        assertEquals(1, result);

    }

}

