package org.willxu.algorithm.service.integer;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.integer.NumberOfUnequalTripletsInArrayCount;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class NumberOfUnequalTripletsInArrayTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(new int[] {1, 3, 1, 2, 4}, 7),
                arguments(new int[] {4, 4, 2, 4, 3}, 3),
                arguments(new int[] {1, 1, 1, 1, 1}, 0)
        );
    }

    @ParameterizedTest(name = "Count {index}")
    @MethodSource("dataProvider")
    public void testCount(int[] nums, int excepted) {
        NumberOfUnequalTripletsInArray count =
                new NumberOfUnequalTripletsInArrayCount();
        assertEquals(excepted, count.unequalTriplets(nums));
    }
}