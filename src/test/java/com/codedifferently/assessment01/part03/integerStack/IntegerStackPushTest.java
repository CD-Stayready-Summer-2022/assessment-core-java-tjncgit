package com.codedifferently.assessment01.part03.integerStack;

import com.codedifferently.assessment01.part03.MyStack;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class IntegerStackPushTest {
    private MyStack<Integer> stack;

    @BeforeEach
    public void setup() {
        this.stack = new MyStack<>();
    }

    @Test
    public void test1() {
        Assertions.assertNull(stack.peek());
    }

    @Test
    public void test2() {
        Integer expected = 0;
        stack.push(expected);
        Assertions.assertEquals(stack.peek(), expected);
    }

    @Test
    public void test3() {
        Integer expected = 1;
        stack.push(expected);
        Assertions.assertEquals(stack.peek(), expected);
    }

    @Test
    public void test4() {
        Integer val1 = 10;
        Integer val2 = 15;
        Integer val3 = 20;
        Integer expected = 25;

        stack.push(val1);
        stack.push(val2);
        stack.push(val3);
        stack.push(expected);

        Assertions.assertEquals(stack.peek(), expected);
    }

    @Test
    public void test5() {
        Integer  val1 = 30;
        Integer  val2 = 30;
        Integer  val3 = 40;
        Integer  expected = 45;

        stack.push(val1);
        stack.push(val2);
        stack.push(val3);
        stack.push(expected);

        Assertions.assertEquals(stack.peek(), expected);
    }
}
