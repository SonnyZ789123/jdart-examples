package analysis.exceptions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ExceptionCasesFooTest {

    @Test
    public void test0() {
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
            ExceptionCases.foo(3);
        });
    }

    @Test
    public void test1() {
        assertThrows(NullPointerException.class, () -> {
            ExceptionCases.foo(2);
        });
    }

    @Test
    public void test2() {
        assertThrows(ArithmeticException.class, () -> {
            ExceptionCases.foo(1);
        });
    }

    @Test
    public void test3() {
        assertThrows(IllegalArgumentException.class, () -> {
            ExceptionCases.foo(0);
        });
    }

}

