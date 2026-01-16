package analysis.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ArrayInputLengthTestFooTest {

    @Test
    public void test0() {
        // Manually setting param
        int result = ArrayInputLengthTest.foo(new int[] {0, -2147483647});

        // perform assertions
        assertEquals(-1, result);

    }

    @Test
    public void test1() {
        // Manually setting param
        int result = ArrayInputLengthTest.foo(new int[] { 1, 2});

        // perform assertions
        assertEquals(1, result);

    }

}

