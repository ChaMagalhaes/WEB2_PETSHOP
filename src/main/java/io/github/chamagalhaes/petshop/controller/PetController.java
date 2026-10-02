package io.github.chamagalhaes.petshop.controller;

import io.github.chamagalhaes.petshop.model.Pet;
import io.github.chamagalhaes.petshop.service.PetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class PetController {

    @Autowired
    private PetService petService;

    @GetMapping("/pet")
    public String index(Model model) {
        model.addAttribute("petsList", petService.getAllPets());
        return "petshop/index";
    }

    @GetMapping("/pet/create")
    public String create(Model model) {
        model.addAttribute("pet", new Pet());
        return "petshop/create";
    }

    @PostMapping("/pet/save")
    public String postMethodName(@ModelAttribute("pet") Pet pet) {
        petService.savePet(pet);
        return "redirect:/petshop";
    }

    @GetMapping("/pet/delete/{id}")
    public String delete(@PathVariable Long id) {
        this.petService.deletePetById(id);
        return "redirect:/petshop";
    }

}
