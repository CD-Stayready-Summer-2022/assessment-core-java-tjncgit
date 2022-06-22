package com.codedifferently.assessment01.part01;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BasicStringUtilsTest {
    @Test
    public void camelCaseTest01() {
        // Given
        String input = "the quick brown fox";
        String expected = "TheQuickBrownFox";

        // When
        String actual = BasicStringUtils.camelCase(input);

        // Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void camelCaseTest02() {
        // Given
        String input = "wutang is for the children";
        String expected = "WutangIsForTheChildren";

        // When
        String actual = BasicStringUtils.camelCase(input);

        // Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void reverseTest01() {
        // Given
        String input = "the quick brown fox";
        String expected = "xof nworb kciuq eht";

        // When
        String actual = BasicStringUtils.reverse(input);

        // Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void reverseTest02() {
        // Given
        String input = "wutang is for the children";
        String expected = "nerdlihc eht rof si gnatuw";

        // When
        String actual = BasicStringUtils.reverse(input);

        // Then
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void reverseThenCamelCaseTest01() {
        // Given
        String input = "the quick brown fox";
        String expected = "XofNworbKciuqEht";

        // When
        String actual = BasicStringUtils.reverseThenCamelCase(input);

        // Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void reverseThenCamelCaseTest02() {
        // Given
        String input = "wutang is for the children";
        String expected = "NerdlihcEhtRofSiGnatuw";

        // When
        String actual = BasicStringUtils.reverseThenCamelCase(input);

        // Then
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void removeFirstAndLastCharacterTest01() {
        // Given
        String input = "The quick brown";
        String expected = "he quick brow";

        // When
        String actual = BasicStringUtils.removeFirstAndLastCharacter(input);

        // Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void removeFirstAndLastCharacterTest02() {
        // Given
        String input = "The quick brown";
        String expected = "he quick brow";

        // When
        String actual = BasicStringUtils.removeFirstAndLastCharacter(input);

        // Then
        Assertions.assertEquals(expected, actual);
    }
}
