package es.francisco.fizzbuzz;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;

public class FizzBuzzTest {

    private FizzBuzz classToTest;

    @BeforeEach
    void setUp() {
        classToTest = new FizzBuzz();
    }

    @ParameterizedTest
    @CsvSource({"1,1", "2,2", "4,4", "7,7", "8,8", "13,13", "14,14"})
    public void shouldConvertNumberToFizzBuzzString(int input, String expectedValue) {
        assertThat(classToTest.convert(input)).isEqualTo(expectedValue);
    }

    @ParameterizedTest
    @ValueSource(ints = {3, 6, 9, 12, 15})
    public void convertThreeToFizz(int input) {
        assertThat(classToTest.convert(input)).isEqualTo("Fizz");
    }
}
