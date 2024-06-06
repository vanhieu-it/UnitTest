import org.example.Calculator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorTest {
    @Test
    public void TestAdd(){
        Calculator calculator = new Calculator();
        int result = calculator.add(2,3);
        assertEquals(5, result);
    }

    @Test
    public void TestSubtract(){
        Calculator calculator = new Calculator();
        int result = calculator.subtract(5,2);
        assertEquals(3, result);
    }

    @Test
    public void testDevideByZero(){
        Calculator calculator = new Calculator();
        assertThrows(ArithmeticException.class, () -> {
            calculator.divide(1,0);
        });
    }
}
