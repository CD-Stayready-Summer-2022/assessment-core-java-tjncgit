package com.codedifferently.assessment01.part02;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CatTest {
    @Test
    public void nullaryConstructorTest() {
        // Given
        PetOwner expectedOwner = null;
        String expectedName = "Cat name";
        Integer expectedAge = 0;
        Cat cat = new Cat();

        // When
        String actualName = cat.getName();
        Integer actualAge = cat.getAge();
        PetOwner actualOwner = cat.getOwner();


        // Then
        Assertions.assertEquals(expectedAge, actualAge);
        Assertions.assertEquals(expectedName, actualName);
        Assertions.assertEquals(expectedOwner, actualOwner);
    }

    @Test
    public void constructorWithNameTest() {
        // Given
        String expectedName = "Name of Cat";
        Integer expectedAge = 0;
        Cat cat = new Cat(expectedName);

        // When
        String actualName = cat.getName();
        Integer actualAge = cat.getAge();


        // Then
        Assertions.assertEquals(expectedAge, actualAge);
        Assertions.assertEquals(expectedName, actualName);
    }


    @Test
    public void constructorWithAgeTest() {
        // Given
        String expectedName = "Cat name";
        Integer expectedAge = Integer.MAX_VALUE;
        Cat cat = new Cat(expectedAge);

        // When
        String actualName = cat.getName();
        Integer actualAge = cat.getAge();


        // Then
        Assertions.assertEquals(expectedAge, actualAge);

        Assertions.assertEquals(expectedName, actualName);
    }

    @Test
    public void constructorWithNameAndAgeTest() {
        // Given
        String expectedName = "Name of Cat";
        Integer expectedAge = Integer.MAX_VALUE;
        Cat cat = new Cat(expectedName, expectedAge);

        // When
        String actualName = cat.getName();
        Integer actualAge = cat.getAge();


        // Then
        Assertions.assertEquals(expectedAge, actualAge);
        Assertions.assertEquals(expectedName, actualName);
    }

    @Test
    public void speakTest() {
        // Given
        Cat cat = new Cat();
        String expected = "Meow";

        // When
        String actual = cat.speak();

        // Then
        Assertions.assertEquals(expected, actual);
    }
}
