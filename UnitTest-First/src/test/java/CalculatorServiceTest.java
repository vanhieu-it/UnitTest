import org.example.Calculator;
import org.example.CalculatorService;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class CalculatorServiceTest {
    @Test
    public void testPerformAddition(){
        Calculator calculator = Mockito.mock(Calculator.class);
        when(calculator.add(2,3)).thenReturn(5);

        CalculatorService calculatorService = new CalculatorService(calculator);
        int result = calculatorService.performAddition(2,3);

        assertEquals(5, result);
        verify(calculator).add(2,3);
    }
}
