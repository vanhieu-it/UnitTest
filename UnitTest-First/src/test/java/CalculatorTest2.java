import org.example.Calculator;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;



public class CalculatorTest2 {
    private Calculator calculator;

    @BeforeAll
    public static void setupAll(){
        System.out.println("BeforeAll");
    }
    @BeforeEach
    public void setup(){
        calculator = new Calculator();
    }
    @Test
    public void testAdd(){
        int result = calculator.add(2,4);
        assertEquals(6, result);
    }

    @Test
    public void testSubtract(){
        int result = calculator.subtract(6,1);
        assertEquals(5, result);
    }

    @AfterEach
    public void afterEach(){
        System.out.println("afterEach");
    }
    @AfterAll
    public  static void afterAll(){
        System.out.println("afterAll");
    }
}
