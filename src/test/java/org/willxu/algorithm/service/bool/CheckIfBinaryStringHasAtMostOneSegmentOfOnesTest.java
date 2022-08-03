package org.willxu.algorithm.service.bool;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.bool.CheckIfBinaryStringHasAtMostOneSegmentOfOnesLoop;

import java.util.stream.Stream;

import static org.gradle.internal.impldep.org.junit.Assert.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class CheckIfBinaryStringHasAtMostOneSegmentOfOnesTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments("1", true),
                arguments("1001", false),
                arguments("110", true)
        );
    }

    @ParameterizedTest(name = "Loop {index}")
    @MethodSource("dataProvider")
    public void testLoop(String s, boolean excepted) {
        CheckIfBinaryStringHasAtMostOneSegmentOfOnes loop =
                new CheckIfBinaryStringHasAtMostOneSegmentOfOnesLoop();
        assertEquals(excepted, loop.checkOnesSegment(s));
    }
}