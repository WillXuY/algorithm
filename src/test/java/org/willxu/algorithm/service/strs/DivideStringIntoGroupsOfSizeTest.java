package org.willxu.algorithm.service.strs;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.strs.DivideStringIntoGroupsOfSizeBuilder;

import java.util.stream.Stream;

import static org.gradle.internal.impldep.org.junit.Assert.assertArrayEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class DivideStringIntoGroupsOfSizeTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(
                        "abcdefghi", 3, 'x',
                        new String[] {"abc", "def", "ghi"}
                ),
                arguments(
                        "abcdefghij", 3, 'x',
                        new String[] {"abc", "def", "ghi", "jxx"}
                )
        );
    }

    @ParameterizedTest(name = "Builder {index}")
    @MethodSource("dataProvider")
    public void testBuilder(String s, int k, char fill, String[] excepted) {
        DivideStringIntoGroupsOfSize builder =
                new DivideStringIntoGroupsOfSizeBuilder();
        assertArrayEquals(excepted, builder.divideString(s, k, fill));
    }
}