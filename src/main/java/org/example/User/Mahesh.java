package org.example.User;

import jakarta.annotation.PostConstruct;
import org.example.contract.Food;
import org.example.customAnnotation.Roll;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Mahesh {
    private Food food;


    @Autowired
    @Qualifier("tasty")
    @Roll
    public void setFood(Food food){
        this.food = food;

    }


    @PostConstruct
 public void init(){
     food.food();
 }
}
