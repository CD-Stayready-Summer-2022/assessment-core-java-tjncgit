package com.codedifferently.assessment01.part02;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DogTest {
    @Test
    public void nullaryConstructorTest() {
        // Given
        PetOwner expectedOwner = null;
        String expectedName = "Dog name";
        Integer expectedAge = 0;
        Dog dog = new Dog();

        // When
        String actualName = dog.getName();
        Integer actualAge = dog.getAge();
        PetOwner actualOwner = dog.getOwner();


        // Then
        Assertions.assertEquals(expectedAge, actualAge);
        Assertions.assertEquals(expectedName, actualName);
        Assertions.assertEquals(expectedOwner, actualOwner);
    }

    @Test
    public void constructorWithNameTest() {
        // Given
        String expectedName = "Name of Dog";
        Integer expectedAge = 0;
        Dog dog = new Dog(expectedName);

        // When
        String actualName = dog.getName();
        Integer actualAge = dog.getAge();


        // Then
        Assertions.assertEquals(expectedAge, actualAge);
        Assertions.assertEquals(expectedName, actualName);
    }


    @Test
    public void constructorWithAgeTest() {
        // Given
        String expectedName = "Dog name";
        Integer expectedAge = Integer.MAX_VALUE;
        Dog dog = new Dog(expectedAge);

        // When
        String actualName = dog.getName();
        Integer actualAge = dog.getAge();


        // Then
        Assertions.assertEquals(expectedAge, actualAge);
        Assertions.assertEquals(expectedName, actualName);
    }

    @Test
    public void constructorWithNameAndAgeTest() {
        // Given
        String expectedName = "Name of Dog";
        Integer expectedAge = Integer.MAX_VALUE;
        Dog dog = new Dog(expectedName, expectedAge);

        // When
        String actualName = dog.getName();
        Integer actualAge = dog.getAge();


        // Then
        Assertions.assertEquals(expectedAge, actualAge);
        Assertions.assertEquals(expectedName, actualName);
    }

    @Test
    public void speakTest() {
        // Given
        Dog dog = new Dog();
        String expected = "Bark";

        // When
        String actual = dog.speak();

        // Then
        Assertions.assertEquals(expected, actual);
    }
}
