package org.willxu.algorithm.service.string;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.string.CountAndSayLoop;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class CountAndSayTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(1, "1"),
                arguments(2, "11"),
                arguments(3, "21"),
                arguments(4, "1211")
        );
    }

    @ParameterizedTest(name = "Loop {index}")
    @MethodSource("dataProvider")
    public void testLoop(int n, String expected) {
        CountAndSay loop = new CountAndSayLoop();
        assertEquals(expected, loop.countAndSay(n));
    }
}
