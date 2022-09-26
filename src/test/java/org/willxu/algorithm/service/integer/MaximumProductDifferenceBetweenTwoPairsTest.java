package org.willxu.algorithm.service.integer;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.integer.MaximumProductDifferenceBetweenTwoPairsExtremum;

import java.util.stream.Stream;

import static org.gradle.internal.impldep.org.junit.Assert.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class MaximumProductDifferenceBetweenTwoPairsTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(new int[] {5, 6, 2, 7, 4}, 34),
                arguments(new int[] {4, 2, 5, 9, 7, 4, 8}, 64)
        );
    }

    @ParameterizedTest(name = "Extremum {index}")
    @MethodSource("dataProvider")
    public void testExtremum(int[] nums, int excepted) {
        MaximumProductDifferenceBetweenTwoPairs extremum =
                new MaximumProductDifferenceBetweenTwoPairsExtremum();
        assertEquals(excepted, extremum.maxProductDifference(nums));
    }
}