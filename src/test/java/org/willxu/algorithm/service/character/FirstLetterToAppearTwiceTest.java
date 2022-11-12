package org.willxu.algorithm.service.character;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.character.FirstLetterToAppearTwiceSet;

import java.util.stream.Stream;

import static org.gradle.internal.impldep.org.junit.Assert.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class FirstLetterToAppearTwiceTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments("abccbaacz", 'c'),
                arguments("abcdd", 'd')
        );
    }

    @ParameterizedTest(name = "Set {index}")
    @MethodSource("dataProvider")
    public void testSet(String s, char excepted) {
        FirstLetterToAppearTwice set = new FirstLetterToAppearTwiceSet();
        assertEquals(excepted, set.repeatedCharacter(s));
    }
}
