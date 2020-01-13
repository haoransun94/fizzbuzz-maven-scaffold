package com.haoran.competition;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.fest.assertions.api.Assertions.assertThat;

public class FizzBuzzTest {
    @ParameterizedTest(name = "should return {1} given {0}")
    @CsvSource({
            "1,'1'",
            "3,'Fizz'",
            "5,'Buzz'",
            "15,'FizzBuzz'",
    })
    void test(int num, String word) {
        assertThat(new FizzBuzzNumber(num).readed()).isEqualTo(word);
    }
}
