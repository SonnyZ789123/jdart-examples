package analysis.loops;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FooTest {

    @Test
    public void test0() {
        int result = analysis.loops.BoundedLoopHappyPath.foo(-2147483644);

        // perform assertions
        assertEquals(0, result);

    }

    @Test
    public void test1() {
        int result = analysis.loops.BoundedLoopHappyPath.foo(1);

        // perform assertions
        assertEquals(0, result);

    }

    @Test
    public void test2() {
        int result = analysis.loops.BoundedLoopHappyPath.foo(2);

        // perform assertions
        assertEquals(1, result);

    }

    @Test
    public void test3() {
        int result = analysis.loops.BoundedLoopHappyPath.foo(3);

        // perform assertions
        assertEquals(3, result);

    }

    @Test
    public void test4() {
        int result = analysis.loops.BoundedLoopHappyPath.foo(5);

        // perform assertions
        assertEquals(3, result);

    }

}