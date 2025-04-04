/*
 * Copyright (C) 2021  Weiyang(Will) Xu
 * 
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or
 * any later version, as specified in the readme.md file.
 */

package org.willxu.algorithm.service.bool;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.provide.TreeNode;
import org.willxu.algorithm.service.impl.bool.SymmetricTreeRecursive;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;
import static org.willxu.algorithm.provide.TreeNode.initByListLevel;

public class SymmetricTreeTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(
                        /*
                        init Exception empty stack
                         */
                        initByListLevel(Stream.of(1, 2, 2, 3, 4, 4, 3)
                                .collect(Collectors.toList())),
                        true
                ),
                arguments(
                        initByListLevel(Stream.of(1, 2, 2, null, 3, null, 3)
                                .collect(Collectors.toList())),
                        false
                )
        );
    }

    @ParameterizedTest(name = "Recursively {index}")
    @MethodSource("dataProvider")
    public void testRecursively(TreeNode root, boolean output) {
        SymmetricTree recursive = new SymmetricTreeRecursive();
        assertEquals(output, recursive.isSymmetric(root));
    }
}
