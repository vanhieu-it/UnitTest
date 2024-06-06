import org.example.NumberUtils;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class NumberUtilsTest {
    @ParameterizedTest
    @CsvSource({
            "2, true",
            "3, true",
            "4, false",
            "5, true",
            "10, false"
    })
    public void testIsPrime(int number, boolean expected){
        assertEquals(expected, NumberUtils.isPrime(number));
    }

    static Stream<Arguments> primeNumberProvider(){
        return Stream.of(
                Arguments.of(2,true),
                Arguments.of(3,true),
                Arguments.of(4, false),
                Arguments.of(5, true),
                Arguments.of(10, false)
        );
    }

    @ParameterizedTest
    @MethodSource("primeNumberProvider")
    public void testIsPrimeMethodSource(int numner, boolean expected){
        assertEquals(expected, NumberUtils.isPrime(numner));
    }
}
