package com.example.menu.food;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

//essa classe é uma entitade, que vai representar as tabelas do nosso banco de dados
//assim não é necessario usar SQL para manipular os dados, apenas usar o objeto dessa classe

@Table(name = "foods") //nome da tabela no banco de dados
@Entity(name = "foods")
@Getter //indica para o lombok criar um get para todas as vars dentro do metodo
@NoArgsConstructor //declara um constructor sem argumento em run time (graças ao lombok)
@AllArgsConstructor //declara um constructor com argumento em run time (graças ao lombok)
@EqualsAndHashCode (of = "id") //indica que o ID é a representacao unica

public class Food {
    //as variaveis desse metodo representam os elementos da coluna no banco de dados
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String image;
    private Integer price;

    public Food(FoodRequestDTO data){
        this.image = data.image();
        this.price = data.price();
        this.title = data.title();
    }


}
