package griffith;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculatorTest {
    private Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @Test
    void testAdd() {
        assertEquals(6, calculator.add(2, 4));
        assertEquals(9, calculator.add(5, 4));
        assertEquals(-3, calculator.add(-6, 3));
    }

    @Test
    void testSubtract() {
        assertEquals(5, calculator.subtract(10, 5));
        assertEquals(1, calculator.subtract(6, 5));
        assertEquals(-18, calculator.subtract(-11, 7));
    }

    @Test
    void testMultiply() {
        assertEquals(4, calculator.multiply(1, 4));
        assertEquals(10, calculator.multiply(5, 2));
        assertEquals(-33, calculator.multiply(-11, 3));
    }

    @Test
    void testDivide() {
        assertEquals(4.0, calculator.divide(8, 2));
        assertEquals(3.0, calculator.divide(9, 3));
        assertEquals(-2.0, calculator.divide(-8, 4));
        assertEquals(2.5, calculator.divide(5, 2));
    }

    @Test
    void testDivideByZero() {
        assertThrows(IllegalArgumentException.class, () -> calculator.divide(5, 0));
    }

    @Test
    void testModuloAndPower() {
        assertEquals(1, calculator.modulo(10, 3));
        assertEquals(8, calculator.power(2, 3));
        assertThrows(IllegalArgumentException.class, () -> calculator.modulo(1, 0));
        assertThrows(IllegalArgumentException.class, () -> calculator.power(2, -1));
    }
}
