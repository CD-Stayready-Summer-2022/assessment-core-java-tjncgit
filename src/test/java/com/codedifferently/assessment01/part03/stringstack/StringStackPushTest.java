package com.codedifferently.assessment01.part03.stringstack;

import com.codedifferently.assessment01.part03.MyStack;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class StringStackPushTest {
    private MyStack<String> stack;

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
        String expected = "0";
        stack.push(expected);
        Assertions.assertEquals(stack.peek(), expected);
    }

    @Test
    public void test3() {
        String expected = "1";
        stack.push(expected);
        Assertions.assertEquals(stack.peek(), expected);
    }

    @Test
    public void test4() {
        String val1 = "10";
        String val2 = "15";
        String val3 = "20";
        String expected = "25";

        stack.push(val1);
        stack.push(val2);
        stack.push(val3);
        stack.push(expected);

        Assertions.assertEquals(stack.peek(), expected);
    }

    @Test
    public void test5() {
        String  val1 = "30";
        String  val2 = "35";
        String  val3 = "40";
        String  expected = "45";

        stack.push(val1);
        stack.push(val2);
        stack.push(val3);
        stack.push(expected);

        Assertions.assertEquals(stack.peek(), expected);
    }
}
