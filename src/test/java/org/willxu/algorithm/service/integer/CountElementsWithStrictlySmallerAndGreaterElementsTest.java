package org.willxu.algorithm.service.integer;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.integer.CountElementsWithStrictlySmallerAndGreaterElementsSort;

import java.util.stream.Stream;

import static org.gradle.internal.impldep.org.junit.Assert.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class CountElementsWithStrictlySmallerAndGreaterElementsTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(new int[] {11, 7, 2, 15}, 2),
                arguments(new int[] {-3, 3, 3, 90}, 2)
        );
    }

    @ParameterizedTest(name = "Sort {index}")
    @MethodSource("dataProvider")
    public void testSort(int[] nums, int excepted) {
        CountElementsWithStrictlySmallerAndGreaterElements sort =
                new CountElementsWithStrictlySmallerAndGreaterElementsSort();
        assertEquals(excepted, sort.countElements(nums));
    }
}