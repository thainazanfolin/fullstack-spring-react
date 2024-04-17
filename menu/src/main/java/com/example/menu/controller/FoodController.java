package com.example.menu.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// O controller é o arquivo respons[avel por pegar os dados no banco e tambem adicionar novos dados a ele
//ou seja, controla os dados da aplicação
//padrão MVC

@RestController
@RequestMapping("food") //mapenado o REQUEST que vai ser utilizado por esse controller (endpoint)

public class FoodController {
    
    //quando esse metodo será chamado:
    @GetMapping
    //o que o metodo faz quando chamado
    public void getAll(){   //retorna todos os dados

    }
}
