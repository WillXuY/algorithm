package org.willxu.algorithm.service.integer;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.integer.LargestNumberAfterDigitSwapsByParityOrder;

import java.util.stream.Stream;

import static org.gradle.internal.impldep.org.junit.Assert.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class LargestNumberAfterDigitSwapsByParityTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(1234, 3412),
                arguments(65875, 87655)
        );
    }

    @ParameterizedTest(name = "Order {index}")
    @MethodSource("dataProvider")
    public void testOrder(int num, int excepted) {
        LargestNumberAfterDigitSwapsByParity order =
                new LargestNumberAfterDigitSwapsByParityOrder();
        assertEquals(excepted, order.largestInteger(num));
    }
}