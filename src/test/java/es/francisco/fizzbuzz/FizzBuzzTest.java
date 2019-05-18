package es.francisco.fizzbuzz;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

public class FizzBuzzTest {

    private FizzBuzz classToTest;

    @BeforeEach
    void setUp() {
        classToTest = new FizzBuzz();
    }
    @ParameterizedTest
    @CsvSource({"1,1", "2,2", "4,4"})
    public void shouldConvertNumberToFizzBuzzString(int input, String expectedValue) {
        assertThat(classToTest.convert(input)).isEqualTo(expectedValue);
    }

    @Test
    public void convertThreeToFizz() {
        assertThat(classToTest.convert(3)).isEqualTo("Fizz");
    }
}
