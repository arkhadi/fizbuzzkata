package es.francisco.fizzbuzz;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FizzBuzzTest {

    @Test
    public void shouldConvertOneToOne() {
        assertThat(new FizzBuzz().convert(1)).isEqualTo("1");
    }

    @Test
    void shouldConvertTwoToTwo() {
        assertThat(new FizzBuzz().convert(2)).isEqualTo("2");
    }
}
