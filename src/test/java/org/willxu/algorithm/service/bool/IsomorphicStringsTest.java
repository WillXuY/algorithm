package org.willxu.algorithm.service.bool;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.bool.IsomorphicStringsRemove;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class IsomorphicStringsTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                // Error StringIndexOutOfBoundsException, special token
                arguments(
                        "qwertyuiop[]asdfghjkl;'\\zxcvbnm,./",
                        "',.pyfgcrl/=aoeuidhtns-\\;qjkxbmwvz",
                        true
                ),
                // Wrong answer 1
                arguments("bbbaaaba", "aaabbbba", false),
                arguments("egg", "add", true),
                arguments("foo", "bar", false),
                arguments("paper", "title", true)
        );
    }

    @ParameterizedTest(name = "Remove {index}")
    @MethodSource("dataProvider")
    public void testRemove(String s, String t, boolean excepted) {
        IsomorphicStrings remove = new IsomorphicStringsRemove();
        assertEquals(excepted, remove.isIsomorphic(s, t));
    }
}
