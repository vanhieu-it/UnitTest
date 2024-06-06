import org.junit.jupiter.api.RepeatedTest;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class RepeatedTestExample {
    @RepeatedTest(5)
    public void testRepeat(){
        assertTrue(Math.random() < 1);
    }
}
