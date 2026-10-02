package io.github.chamagalhaes.petshop.controller;

import io.github.chamagalhaes.petshop.service.PetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PetController {

    @Autowired
    private PetService petService;

    @GetMapping("/pet")
    public String index(Model model) {
        model.addAttribute("petsList", petService.getAllPets());
        return "petshop/index";
    }

}
