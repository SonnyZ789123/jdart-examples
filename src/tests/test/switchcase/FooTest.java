package test.switchcase;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static test.switchcase.Test.foo;

class FooTest {

    @Test
    void testSwitchCaseOne() {
        int result = foo(3);
        assertEquals(3, result);
    }
}
