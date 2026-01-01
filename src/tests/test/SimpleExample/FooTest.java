package test.SimpleExample;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static test.SimpleExample.Test.foo;

class FooTest {

    @Test
    void testEqualsToOne() {
        // x < 0, x < -10, even
        int result = foo(1);
        assertEquals(0, result);
    }
}
