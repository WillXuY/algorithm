/*
 * Copyright (C) 2021  Weiyang(Will) Xu
 * 
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or
 * any later version, as specified in the readme.md file.
 */

package org.willxu.algorithm.service.impl.listnode;

import org.willxu.algorithm.provide.ListNode;
import org.willxu.algorithm.service.listnode.IntersectionOfTwoLinkedLists;

import java.util.ArrayList;

public class IntersectionOfTwoLinkedListsSaveNodes
        implements IntersectionOfTwoLinkedLists {
    @Override
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ArrayList<ListNode> nodes = new ArrayList<>();
        while (headA != null) {
            nodes.add(headA);
            headA = headA.next;
        }
        while (headB != null) {
            if (nodes.contains(headB)) {
                return headB;
            }
            headB = headB.next;
        }
        return null;
    }
}
