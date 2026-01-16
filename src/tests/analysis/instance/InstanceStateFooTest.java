package analysis.instance;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class InstanceStateFooTest {

    private InstanceState obj;

    @BeforeEach
    void setUp() {
        // Complete the initialization of obj as needed
        obj = new InstanceState(1);
    }

    @Test
    public void test0() {
        int result = obj.foo(1073741824);

        // perform assertions
        assertEquals(1073741823, result);

    }

    @Test
    public void test1() {
        int result = obj.foo(5);

        // perform assertions
        assertEquals(6, result);

    }

}

