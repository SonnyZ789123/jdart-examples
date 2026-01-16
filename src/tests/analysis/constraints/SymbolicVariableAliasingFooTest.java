package analysis.constraints;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SymbolicVariableAliasingFooTest {

    @Test
    public void test0() {
        int result = SymbolicVariableAliasing.foo(4);

        // perform assertions
        assertEquals(4, result);

    }

    @Test
    public void test1() {
        int result = SymbolicVariableAliasing.foo(2);

        // perform assertions
        assertEquals(4, result);

    }

}

