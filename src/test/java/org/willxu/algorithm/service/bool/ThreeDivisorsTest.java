package org.willxu.algorithm.service.bool;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.bool.ThreeDivisorsExhaustive;

import java.util.stream.Stream;

import static org.gradle.internal.impldep.org.junit.Assert.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class ThreeDivisorsTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(14, false),
                arguments(2, false),
                arguments(4, true)
        );
    }

    @ParameterizedTest(name = "Exhaustive {index}")
    @MethodSource("dataProvider")
    public void testExhaustive(int n, boolean excepted) {
        ThreeDivisors exhaustive = new ThreeDivisorsExhaustive();
        assertEquals(excepted, exhaustive.isThree(n));
    }
}