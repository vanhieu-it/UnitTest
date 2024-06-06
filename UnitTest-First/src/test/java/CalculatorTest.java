import org.example.Calculator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

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

    @ParameterizedTest
    @CsvSource({
            "1, 1, 2",
            "2, 3, 5",
            "10, 20, 30"
    })
    public void testAdd(int a, int b, int expectd){
        Calculator calculator = new Calculator();
        assertEquals(expectd, calculator.add(a,b));
    }
}
