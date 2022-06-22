package com.codedifferently.assessment01.part03.stringstack;

import com.codedifferently.assessment01.part03.MyStack;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.EmptyStackException;

public class StringStackPopTest {
    private MyStack<String> stack;

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
        stack.push("Wutang");
        stack.push("Clan");
        stack.push("Forever");
        String expectedValue  = "Forever";
        String actualValue = stack.pop();
        Integer expectedSize = 2;
        Integer actualSize = stack.size();
        Assertions.assertEquals(expectedValue, actualValue);
        Assertions.assertEquals(expectedSize, actualSize);
    }
}
