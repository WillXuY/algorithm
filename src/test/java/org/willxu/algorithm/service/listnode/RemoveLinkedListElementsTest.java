package org.willxu.algorithm.service.listnode;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.provide.ListNode;
import org.willxu.algorithm.service.impl.listnode.RemoveLinkedListElementsPointer;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.params.provider.Arguments.arguments;
import static org.willxu.algorithm.provide.ListNode.getListNodeFromIntArray;

public class RemoveLinkedListElementsTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(
                        getListNodeFromIntArray(new int[] {
                                1, 2, 6, 3, 4, 5, 6}),
                        6,
                        getListNodeFromIntArray(new int[] {
                                1, 2, 3, 4, 5})
                ),
                arguments(
                        getListNodeFromIntArray(new int[0]),
                        1,
                        getListNodeFromIntArray(new int[0])
                ),
                arguments(
                        getListNodeFromIntArray(new int[] {
                                7, 7, 7, 7}),
                        7,
                        getListNodeFromIntArray(new int[0])
                )
        );
    }

    @ParameterizedTest(name = "Pointer {index}")
    @MethodSource("dataProvider")
    public void testPointer(ListNode input, int val, ListNode excepted) throws JsonProcessingException {
        RemoveLinkedListElements pointer =
                new RemoveLinkedListElementsPointer();
        ListNode output = pointer.removeElements(input, val);
        ObjectMapper objectMapper = new ObjectMapper();
        String except = objectMapper.writeValueAsString(excepted);
        assertEquals(except, objectMapper.writeValueAsString(output));
    }
}
