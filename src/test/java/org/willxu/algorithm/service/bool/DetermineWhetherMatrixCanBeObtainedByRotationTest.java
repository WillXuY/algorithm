package org.willxu.algorithm.service.bool;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.bool.DetermineWhetherMatrixCanBeObtainedByRotationFour;

import java.util.stream.Stream;

import static org.gradle.internal.impldep.org.junit.Assert.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class DetermineWhetherMatrixCanBeObtainedByRotationTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(
                        new int[][] {{0, 1}, {1, 1}},
                        new int[][] {{1, 0}, {0, 1}},
                        false
                ),
                arguments(
                        new int[][] {{0, 0, 0}, {0, 1, 0}, {1, 1, 1}},
                        new int[][] {{1, 1, 1}, {0, 1, 0}, {0, 0, 0}},
                        true
                )
        );
    }

    @ParameterizedTest(name = "Four {index}")
    @MethodSource("dataProvider")
    public void testFour(int[][] mat, int[][] target, boolean excepted) {
        DetermineWhetherMatrixCanBeObtainedByRotation four =
                new DetermineWhetherMatrixCanBeObtainedByRotationFour();
        assertEquals(excepted, four.findRotation(mat, target));
    }
}