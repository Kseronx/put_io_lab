package put.io.testing.junit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private static Calculator calculator;

    @BeforeEach
    void prepare(){
        calculator = new Calculator();
    }


    @Test
    void testAdd() {
        assertEquals(4, calculator.add(2, 2));
        assertEquals(-4, calculator.add(-2, -2));
        assertEquals(0, calculator.add(-2, 2));
    }

    @Test
    void testMultiply() {
        assertEquals(6, calculator.multiply(2, 3));
        assertEquals(-4, calculator.multiply(-2, 2));
        assertEquals(0, calculator.multiply(0, 2));
    }
}