package test.blockmap;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static test.blockmap.Test.foo;

class FooTest {

    @Test
    void testLineWithMultipleBlocks() {
        int result = foo(1);
        assertEquals(1, result);
    }
}
