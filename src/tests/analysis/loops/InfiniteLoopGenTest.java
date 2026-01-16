package analysis.loops;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class InfiniteLoopGenTest {

    @Test
    public void test0() {
        int result = InfiniteLoopTest.foo(9);

        // perform assertions
        assertEquals(9, result);

    }

    @Test
    public void test1() {
        int result = InfiniteLoopTest.foo(8);

        // perform assertions
        assertEquals(8, result);

    }

    @Test
    public void test2() {
        int result = InfiniteLoopTest.foo(7);

        // perform assertions
        assertEquals(7, result);

    }

    @Test
    public void test3() {
        int result = InfiniteLoopTest.foo(6);

        // perform assertions
        assertEquals(6, result);

    }

    @Test
    public void test4() {
        int result = InfiniteLoopTest.foo(5);

        // perform assertions
        assertEquals(5, result);

    }

    @Test
    public void test5() {
        int result = InfiniteLoopTest.foo(4);

        // perform assertions
        assertEquals(4, result);

    }

    @Test
    public void test6() {
        int result = InfiniteLoopTest.foo(3);

        // perform assertions
        assertEquals(3, result);

    }

    @Test
    public void test7() {
        int result = InfiniteLoopTest.foo(2);

        // perform assertions
        assertEquals(2, result);

    }

    @Test
    public void test8() {
        int result = InfiniteLoopTest.foo(1);

        // perform assertions
        assertEquals(1, result);

    }

}

