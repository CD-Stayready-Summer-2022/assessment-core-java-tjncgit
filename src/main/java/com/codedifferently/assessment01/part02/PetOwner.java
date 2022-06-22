package com.codedifferently.assessment01.part02;

import java.util.ArrayList;

public class PetOwner {
    /**
     * @param name name of the owner of the Pet
     * @param pets array of Pet object
     */
    private String name;
    private Pet[] pets;
    public PetOwner(String name, Pet... pets) {
        this.name  = name;
        this.pets = pets;
        for(Pet pet: pets) {
            pet.setOwner(this);
        }
    }

    /**
     * @param pet pet to be added to the composite collection of Pets
     */
    public void addPet(Pet pet) {
        for (int i = 0; i < pets.length; i++) {
            if(pets[i] == null) {
                pets[i] = pet;
                pet.setOwner(this);
                break;
            }
        }
    }

    /**
     * @param pet pet to be removed from the composite collection Pets
     */
    public void removePet(Pet pet) {
        for (int i = 0; i < pets.length; i++) {
            if(pets[i] == pet) {
                pets[i] = null;
            }
        }
    }

    /**
     * @param pet pet to evaluate ownership of
     * @return true if I own this pet
     */
    public Boolean isOwnerOf(Pet pet) {
        for (int i = 0; i < pets.length; i++) {
            if(pets[i] == pet) {
                return true;
            }
        }
        return false;
    }

    /**
     * @return the age of the Pet object whose age field is the lowest amongst all Pets in this class
     */
    public Integer getYoungetPetAge() {
        int min = pets[0].getAge();
        for (int i = 1; i < pets.length; i++) {
            if(pets[i].getAge() < min) {
                min = pets[i].getAge();
            }
        }
        return min;
    }




    /**
     * @return the age of the Pet object whose age field is the highest amongst all Pets in this class
     */
    public Integer getOldestPetAge() {
        int max = 0;
        for (int i = 0; i < pets.length; i++) {
            if(pets[i].getAge() > max) {
                max = pets[i].getAge();
            }
        }
        return max;
    }


    /**
     * @return the sum of ages of Pet objects stored in this class divided by the number of Pet object
     */
    public Float getAveragePetAge() {
        float sum = 0.0F;
        for (int i = 0; i < pets.length; i++) {
            sum += pets[i].getAge();
        }
        return sum / pets.length;
    }

    /**
     * @return the number of Pet objects stored in this class
     */
    public Integer getNumberOfPets() {
        int count = 0;
        for(int i = 0; i < pets.length; i++) {
            if(pets[i] != null) {
                count += 1;
            }
        }
        return count;
    }

    /**
     * @return the name property of the Pet
     */
    public String getName() {
        return name;
    }

    /**
     * @return array representation of animals owned by this PetOwner
     */
    public Pet[] getPets() {
        return pets;
    }
}
