package org.example.beans;

import org.example.contract.Food;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
@Qualifier("chicken")
public class ChickenBun implements Food {
    @Override
    public void food() {
        System.out.println("I like chicken bun");
    }
}
