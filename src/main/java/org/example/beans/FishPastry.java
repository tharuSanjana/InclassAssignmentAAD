package org.example.beans;

import org.example.contract.Food;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class FishPastry implements Food {
    @Override
    public void food() {
        System.out.println("I like fish pastry");
    }
}
