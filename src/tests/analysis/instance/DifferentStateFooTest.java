package analysis.instance;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DifferentStateFooTest {

    private DifferentState obj;

    @BeforeEach
    void setUp() {
        // Complete the initialization of obj as needed
        obj = new DifferentState();
    }

    @Test
    public void test0() {
        int result = obj.foo(-1);

        // perform assertions
        assertEquals(0, result);

    }

    @Test
    public void test1() {
        int result = obj.foo(0);

        // perform assertions
        assertEquals(1, result);

    }

    @Test
    public void test2() {
        int result = obj.foo(1);

        // perform assertions
        assertEquals(2, result);

    }

    @Test
    public void test3() {
        int result = obj.foo(2);

        // perform assertions
        assertEquals(-1, result);

    }

}

