package com.codedifferently.assessment01.part02;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PetTest {
    @Test
    public void testInheritance() {
        Pet p = new Dog();
        Assertions.assertTrue(p instanceof Pet);
    }

    @Test
    public void testImplementation() {
        Pet p = new Dog();
        Assertions.assertTrue(p instanceof Animal);
    }

    @Test
    public void setOwnerTest() {
        // Given
        Pet p = new Dog();
        PetOwner expected = new PetOwner(null, null);

        // When
        p.setOwner(expected);
        PetOwner actual = p.getOwner();

        // Then
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void getOwnerTest() {
        // Given
        Pet p = new Dog();
        PetOwner expected = new PetOwner(null, p);

        // When
        PetOwner actual = p.getOwner();

        // Then
        Assertions.assertEquals(expected, actual);
    }
}
