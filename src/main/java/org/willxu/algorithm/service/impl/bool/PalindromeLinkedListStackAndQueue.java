/*
 * Copyright (C) 2021  Weiyang(Will) Xu
 * 
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or
 * any later version, as specified in the readme.md file.
 */

package org.willxu.algorithm.service.impl.bool;

import org.willxu.algorithm.provide.ListNode;
import org.willxu.algorithm.service.bool.PalindromeLinkedList;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class PalindromeLinkedListStackAndQueue implements PalindromeLinkedList {
    @Override
    public boolean isPalindrome(ListNode head) {
        Queue<Integer> queue = new LinkedList<>();
        Stack<Integer> stack = new Stack<>();
        while (head != null) {
            queue.add(head.val);
            stack.push(head.val);
            head = head.next;
        }
        while (!queue.isEmpty()) {
            if (!queue.poll().equals(stack.pop())) {
                return false;
            }
        }
        return true;
    }
}