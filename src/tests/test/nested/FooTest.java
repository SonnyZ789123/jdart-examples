package test.nested;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static test.nested.Test.foo;

import org.junit.jupiter.api.Test;

public class FooTest {

    @Test
    public void testXEquals0() {
        int result = foo(0);
        assertEquals(0, result);
    }

    @Test
    public void testXEquals2() {
        int result = foo(2);
        assertEquals(2, result);
    }

    @Test
    public void testXEquals4() {
        int result = foo(4);
        assertEquals(4, result);
    }

    @Test
    public void testXEquals7() {
        int result = foo(7);
        assertEquals(7, result);
    }

    @Test
    public void testXEquals8() {
        int result = foo(8);
        assertEquals(8, result);
    }

    @Test
    public void testXEquals9() {
        int result = foo(9);
        assertEquals(9, result);
    }
}
