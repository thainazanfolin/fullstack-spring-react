package com.example.menu.food;

public record FoodResponsedDTO (Long Id, String title, String image, Integer price) {
    
    public FoodResponsedDTO(Food food){

        this(food.getId(), food.getTitle(), food.getImage(), food.getPrice());

    }

}
