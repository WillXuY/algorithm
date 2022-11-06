package org.willxu.algorithm.service.integer;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.integer.CountPrefixesOfGivenStringRegex;

import java.util.stream.Stream;

import static org.gradle.internal.impldep.org.junit.Assert.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class CountPrefixesOfGivenStringTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(new String[] {"a","b","c","ab","bc","abc"}, "abc", 3),
                arguments(new String[] {"a", "a"}, "aa", 2)
        );
    }

    @ParameterizedTest(name = "Regex {index}")
    @MethodSource("dataProvider")
    public void testRegex(String[] words, String s, int excepted) {
        CountPrefixesOfGivenString regex =
                new CountPrefixesOfGivenStringRegex();
        assertEquals(excepted, regex.countPrefixes(words, s));
    }
}