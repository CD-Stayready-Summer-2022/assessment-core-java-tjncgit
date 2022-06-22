package com.codedifferently.assessment01.part03;

import java.util.ArrayList;
import java.util.EmptyStackException;

public class MyStack<T>{
    private ArrayList<T> stack;

    public MyStack() {
        this.stack = new ArrayList<>();
    }
    public boolean isEmpty() {
        return stack.isEmpty(); }

    public void push(T i) {
        if (stack.size() > 0) {
            stack.add(stack.size() , i);
        } else {
            stack.add(i);
        }
    }

    public T pop() throws EmptyStackException {
        if(stack.size() == 0) {
            return null;
        }
        T popVal = stack.get(stack.size() - 1);
        stack.remove(stack.size() - 1);
        return popVal;
    }

    public T peek() {
        if(stack.size() == 0) {
            return null;
        }
        return stack.get(stack.size() - 1); }

    public Integer size(){
        return stack.size();
    }
}
