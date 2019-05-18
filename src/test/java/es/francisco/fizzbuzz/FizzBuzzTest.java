package es.francisco.fizzbuzz;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;

class FizzBuzzTest {

    private FizzBuzz classToTest;

    @BeforeEach
    void setUp() {
        classToTest = new FizzBuzz();
    }

    @ParameterizedTest
    @CsvSource({"1,1", "2,2", "4,4", "7,7", "8,8", "13,13", "14,14"})
    void shouldConvertNumberToFizzBuzzString(int input, String expectedValue) {
        assertThat(classToTest.convert(input)).isEqualTo(expectedValue);
    }

    @ParameterizedTest
    @ValueSource(ints = {3, 6, 9, 12})
    void shouldConvertMultipleOfThreeToFizz(int input) {
        assertThat(classToTest.convert(input)).isEqualTo("Fizz");
    }

    @ParameterizedTest
    @ValueSource(ints = {5, 10, 20})
    void shouldConvertFiveToBuzz(int input) {
        assertThat(classToTest.convert(input)).isEqualTo("Buzz");
    }

    @ParameterizedTest
    @ValueSource(ints = {15, 30, 45})
    void shouldConvertFifteenToFizzBuzz(int input) {
        assertThat(classToTest.convert(input)).isEqualTo("FizzBuzz");
    }
}
