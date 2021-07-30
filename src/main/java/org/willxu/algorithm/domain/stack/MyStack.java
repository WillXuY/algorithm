package org.willxu.algorithm.domain.stack;

public abstract class MyStack {
    /** Initialize your data structure here. */
    public MyStack() {}

    /** Push element x onto stack. */
    public abstract void push(int x);

    /** Removes the element on top of the stack and returns that element. */
    public abstract int pop();

    /** Get the top element. */
    public abstract int top();

    /** Returns whether the stack is empty. */
    public abstract boolean empty();
}
