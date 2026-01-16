package analysis.instance;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SideEffectsFooTest {

    private SideEffects obj;

    @BeforeEach
    void setUp() {
        // Complete the initialization of obj as needed
        obj = new SideEffects(10);
    }

    @Test
    public void test0() {
        int result = obj.foo(-2147483647);

        // perform assertions
        assertEquals(-2147483648, result);

    }

    @Test
    public void test1() {
        int result = obj.foo(5);

        // perform assertions
        assertEquals(6, result);

    }

}

