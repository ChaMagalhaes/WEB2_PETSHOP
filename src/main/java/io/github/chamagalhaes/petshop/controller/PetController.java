package io.github.chamagalhaes.petshop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PetController {

    @GetMapping("/pet")
    public String index() {
        return "petshop/index";
    }

}
