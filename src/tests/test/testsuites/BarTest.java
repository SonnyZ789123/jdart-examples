package test.testsuites;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BarTest {

    private test.testsuites.Test obj;

    @BeforeEach
    void setUp() {
        // Complete the initialization of obj as needed
        obj = new test.testsuites.Test();
    }

    @Test
    public void test0() {
        int result = obj.bar(0);

        // perform assertions
        assertEquals(100, result);

    }

    @Test
    public void test1() {
        assertThrows(RuntimeException.class, () -> {
            obj.bar(6);
        });
    }

    @Test
    public void test2() {
        int result = obj.bar(5);

        // perform assertions
        assertEquals(5, result);

    }

}

