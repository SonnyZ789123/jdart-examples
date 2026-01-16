package analysis.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ArrayBoundsFooTest {

    @Test
    public void test0() {
        int result = ArrayBounds.foo(0);

        // perform assertions
        assertEquals(10, result);

    }

    @Test
    public void test1() {
        int result = ArrayBounds.foo(1);

        // perform assertions
        assertEquals(20, result);

    }

    @Test
    public void test2() {
        int result = ArrayBounds.foo(2);

        // perform assertions
        assertEquals(30, result);

    }

    @Test
    public void test3() {
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
            ArrayBounds.foo(4);
        });
    }

}

