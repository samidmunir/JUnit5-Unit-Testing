package com.example.stack;

import java.util.Stack;

public class StackRunner {
    Stack<Integer> stack;

    public StackRunner() {
        this.stack = new Stack<>();
    }

    public Stack<Integer> getStack() {
        return this.stack;
    }

    public void push(int element) {
        this.stack.push(element);
    }

    public int pop() {
        return this.stack.pop();
    }

    public int peek() {
        return this.stack.peek();
    }

    public String toString() {
        return this.stack.toString();
    }

    public boolean isEmpty() {
        return this.stack.isEmpty();
    }
}