package com.codedifferently.assessment01.part03.integerStack;

import com.codedifferently.assessment01.part03.MyStack;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class IntegerStackIsEmptyTest {
    private MyStack<Integer> stack;

    @BeforeEach
    public void setup() {
        this.stack = new MyStack<>();
    }

    @Test
    public void test1() {
        Assertions.assertTrue(stack.isEmpty());
    }

    @Test
    public void test2() {
        stack.push(0);
        Assertions.assertFalse(stack.isEmpty());
    }

    @Test
    public void test3() {
        stack.push(1);
        Assertions.assertFalse(stack.isEmpty());
    }
}
