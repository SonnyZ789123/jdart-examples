package examples;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FooTest {

    @Test
    public void test0() {
        int result = OverallJDartExample.foo(618285736, 809984433, 8796093022208L, 0.0, false);

        // perform assertions
        assertEquals(0, result);

    }

    @Test
    public void test2() {
        int result = OverallJDartExample.foo(1126438040, 2142035837, 4294967296L, -1.895E-7, false);

        // perform assertions
        assertEquals(0, result);

    }

}

