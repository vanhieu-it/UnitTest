import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class AssertJTest {
    @Test
    public void testWithAssertJ(){
            String actual = "Hello, World!";
            assertThat(actual).isNotNull()
                    .startsWith("Hello")
                    .contains("World")
                    .endsWith("!");
    }
}
