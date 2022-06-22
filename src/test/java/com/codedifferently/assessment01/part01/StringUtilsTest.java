package com.codedifferently.assessment01.part01;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StringUtilsTest {
    @Test
    public void getWordsTest01() {
        // Given
        String inputString = "The quick brown fox jumps";
        String[] expected = {"The", "quick", "brown", "fox", "jumps"};

        // When
        String[] actual = StringUtils.getWords(inputString);

        // Then
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void getWordsTest02() {
        // Given
        String inputString = "wutang is for the children";
        String[] expected = {"wutang", "is", "for", "the", "children"};

        // When
        String[] actual = StringUtils.getWords(inputString);

        // Then
        Assertions.assertArrayEquals(expected, actual);
    }


    @Test
    public void getFirstWordTest01() {
        // Given
        String inputString = "Quick Brown Fox";
        String expected = "Quick";

        // When
        String actual = StringUtils.getFirstWord(inputString);

        // Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void getFirstWordTest02() {
        // Given
        String inputString = "wutang is for the children";
        String expected = "wutang";

        // When
        String actual = StringUtils.getFirstWord(inputString);

        // Then
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void reverseFirstWordTest01() {
        // Given
        String inputString = "Wutang Clan";
        String expected = "gnatuW";

        // When
        String actual = StringUtils.reverseFirstWord(inputString);

        // Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void reverseFirstWordTest02() {
        // Given
        String inputString = "Five Heart Beats";
        String expected = "eviF";

        // When
        String actual = StringUtils.reverseFirstWord(inputString);

        // Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void reverseFirstWordThenCamelCaseTest01() {
        // Given
        String inputString = "Wutang Clan";
        String expected = "Gnatuw";

        // When
        String actual = StringUtils.reverseFirstWordThenCamelCase(inputString);

        // Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void reverseFirstWordThenCamelCaseTest02() {
        // Given
        String inputString = "Five Heart Beats";
        String expected = "Evif";

        // When
        String actual = StringUtils.reverseFirstWordThenCamelCase(inputString);

        // Then
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void removeCharacterAtIndexTest01() {
        // Given
        String inputString = "Jumping";
        Integer characterIndex = 2;
        String expected = "Juping";

        // When
        String actual = StringUtils.removeCharacterAtIndex(inputString, characterIndex);

        // Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void removeCharacterAtIndexTest02() {
        // Given
        String inputString = "Wutang";
        Integer characterIndex = 3;
        String expected = "Wutng";

        // When
        String actual = StringUtils.removeCharacterAtIndex(inputString, characterIndex);

        // Then
        Assertions.assertEquals(expected, actual);
    }
}
