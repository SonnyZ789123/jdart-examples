package test.nested;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static test.nested.Test.bar;

import org.junit.jupiter.api.Test;

public class BarTest {

    @Test
    public void testXEquals17() {
        int result = bar(17);
        assertEquals(17, result);
    }

    @Test
    public void testXEquals18() {
        int result = bar(18);
        assertEquals(18, result);
    }
}
