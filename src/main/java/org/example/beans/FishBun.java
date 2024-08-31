package org.example.beans;

import org.example.contract.Food;
import org.springframework.stereotype.Component;

@Component
public class FishBun implements Food {
    @Override
    public void food() {
        System.out.println("I like fish bun");
    }
}
