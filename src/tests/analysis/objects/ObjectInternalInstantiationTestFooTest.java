package analysis.objects;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ObjectInternalInstantiationTestFooTest {

    @Test
    public void test0() {
        int result = ObjectInternalInstantiationTest.foo(-2147483646, 0);

        // perform assertions
        assertEquals(4, result);

    }

    @Test
    public void test1() {
        int result = ObjectInternalInstantiationTest.foo(-2147483646, 1);

        // perform assertions
        assertEquals(6, result);

    }

    @Test
    public void test2() {
        int result = ObjectInternalInstantiationTest.foo(1, -1);

        // perform assertions
        assertEquals(5, result);

    }

    @Test
    public void test3() {
        int result = ObjectInternalInstantiationTest.foo(1, 1);

        // perform assertions
        assertEquals(7, result);

    }

}

