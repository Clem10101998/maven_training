package fr.lernejo;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SampleTest {

    private final Sample sample = new Sample();

    @Test
    void addition_two_elements(){
        int result = sample.op(Sample.Operation.ADD, 1, 4);
        Assertions.assertThat(result).isEqualTo(5);
    }

    @Test
    void multiplication_two_elements(){
        int result = sample.op(Sample.Operation.MULT, 3, 5);
        Assertions.assertThat(result).isEqualTo(15);
    }
}
