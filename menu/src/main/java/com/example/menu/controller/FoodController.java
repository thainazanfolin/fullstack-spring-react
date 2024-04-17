package com.example.menu.controller;

import java.util.List;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.menu.food.Food;
import com.example.menu.food.FoodRepository;
import com.example.menu.food.FoodRequestDTO;
import com.example.menu.food.FoodResponsedDTO;

// O controller é o arquivo respons[avel por pegar os dados no banco e tambem adicionar novos dados a ele
//ou seja, controla os dados da aplicação
//padrão MVC

@RestController
@RequestMapping("food") //mapenado o REQUEST que vai ser utilizado por esse controller (endpoint)
public class FoodController {
    

    @Autowired
    private FoodRepository repository;

    @PostMapping
    public void saveFood(@RequestBody FoodRequestDTO data){ //dado que chega do cliente pelo request body
        Food foodData = new Food(data);
        repository.save(foodData);
        return;
    }

    //quando esse metodo será chamado:
    @GetMapping
    //o que o metodo faz quando chamado
    public List<FoodResponsedDTO> getAll(){   //retorna todos os dados
        
        Stream<Object> foodList = repository.findAll().stream().map(FoodResponsedDTO::new);
        return ;
    }


}
