package analysis.constraints;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DontKnowExampleFooTest {

    @Test
    public void test0() {
        int result = DontKnowExample.foo(0.0, 0.0);

        // perform assertions
        assertEquals(2, result);

    }

    @Test
    public void test1() {
        int result = DontKnowExample.foo(0.0, 2.0);

        // perform assertions
        assertEquals(2, result);

    }

    @Test
    public void test2() {
        int result = DontKnowExample.foo(2.0, 0.0);

        // perform assertions
        assertEquals(2, result);

    }

    @Test
    public void test3() {
        int result = DontKnowExample.foo(3.1416, 1.41421356);

        // perform assertions
        assertEquals(2, result);

    }

}

