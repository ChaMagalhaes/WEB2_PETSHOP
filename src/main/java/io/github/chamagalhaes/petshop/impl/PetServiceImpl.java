package io.github.chamagalhaes.petshop.impl;

import io.github.chamagalhaes.petshop.model.Pet;
import io.github.chamagalhaes.petshop.repository.PetRepository;
import io.github.chamagalhaes.petshop.service.PetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PetServiceImpl implements PetService {

    @Autowired
    private PetRepository petRepository;

    @Override
    public List<Pet> getAllPets() {
        return petRepository.findAll();
    }

    @Override
    public void savePet(Pet pet) {
        this.petRepository.save(pet);
    }

    @Override
    public Pet getPetById(long id) {
        Optional <Pet> optional = petRepository.findById(id);

        if(optional.isPresent()) {
            return optional.get();
        }else {
            throw new RuntimeException("Pet not found with id: " + id);
        }
    }

    @Override
    public void deletePetById(long id) {
        this.petRepository.deleteById(id);
    }
}
