package analysis.exceptions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TryCatchExampleFooTest {

    @Test
    public void test0() {
        int result = TryCatchExample.foo(2);

        // perform assertions
        assertEquals(4, result);

    }

    @Test
    public void test1() {
        int result = TryCatchExample.foo(1);

        // perform assertions
        assertEquals(-2, result);

    }

    @Test
    public void test2() {
        int result = TryCatchExample.foo(0);

        // perform assertions
        assertEquals(-1, result);

    }

}

