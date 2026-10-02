package io.github.chamagalhaes.petshop.service;

import io.github.chamagalhaes.petshop.model.Pet;

import java.util.List;

public interface PetService {
    List<Pet> getAllPets();
    void savePet(Pet pet);
    Pet getPetById(long id);
    void deletePetById(long id);
}

