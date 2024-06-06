import static org.junit.jupiter.api.Assertions.*;

import org.example.Calculator;
import org.junit.jupiter.api.*;
public class CalculatorNestedTest {
    @Nested
    class AddTest {
        private Calculator calculator;

        @BeforeEach
        public void setup() {
            calculator = new Calculator();
        }

        @Test
        public void testAddPositiveNumbers() {
            assertEquals(5, calculator.add(2, 3));
        }

        @Test
        public void testAddNegativeNumbers() {
            assertEquals(-5, calculator.add(-2, -3));
        }
    }

    @Nested
    class SubtractTest {
        private Calculator calculator;

        @BeforeEach
        public void setup() {
            calculator = new Calculator();
        }

        @Test
        public void testSubtractPositiveNumbers() {
            assertEquals(1, calculator.subtract(3, 2));
        }

        @Test
        public void testSubtractNegativeNumbers() {
            assertEquals(1, calculator.subtract(-2, -3));
        }
    }
}
