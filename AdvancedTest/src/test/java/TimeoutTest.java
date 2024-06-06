import org.junit.jupiter.api.Test;
import java.time.Duration;
import static org.junit.jupiter.api.Assertions.assertTimeout;

public class TimeoutTest {
    @Test
    public void testTimeout(){
        assertTimeout(Duration.ofMillis(100), () -> {
            Thread.sleep(50);
        });
    }
}
