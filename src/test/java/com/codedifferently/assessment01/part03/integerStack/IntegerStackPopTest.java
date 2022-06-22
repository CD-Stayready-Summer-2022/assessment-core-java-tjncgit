package com.codedifferently.assessment01.part03.integerStack;

import com.codedifferently.assessment01.part03.MyStack;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.EmptyStackException;

public class IntegerStackPopTest {
    private MyStack<Integer> stack;

    @BeforeEach
    public void setup() {
        this.stack = new MyStack<>();
    }

    @Test
    public void test1() {
        Assertions.assertThrows(EmptyStackException.class, ()-> {
            stack.pop();
        });

    }

    @Test
    public void test2() {
        stack.push(765);
        stack.push(321);
        Integer expectedValue  = 321;
        Integer actualValue = stack.pop();
        Integer expectedSize = 1;
        Integer actualSize = stack.size();
        Assertions.assertEquals(expectedValue, actualValue);
        Assertions.assertEquals(expectedSize, actualSize);
    }



}
