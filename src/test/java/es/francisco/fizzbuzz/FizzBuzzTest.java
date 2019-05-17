package es.francisco.fizzbuzz;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FizzBuzzTest {

    @Test
    public void ShouldConvertOneToOne() {
        assertThat(new FizzBuzz().convert(1)).isEqualTo("1");
    }
}
