package com.example.usertrackingproducer;

import com.example.usertrackingproducer.enums.Color;
import com.example.usertrackingproducer.enums.DesignType;
import com.example.usertrackingproducer.enums.ProductType;
import com.example.usertrackingproducer.enums.UserId;
import com.example.usertrackingproducer.model.Event;
import com.example.usertrackingproducer.model.Product;
import com.example.usertrackingproducer.model.User;
import com.github.javafaker.Faker;

public class EventGenerator {
     private final Faker faker =new Faker();
    public Event generateEvent (){
        return Event.builder()
                .user(generateRandomUser())
                .product(generateRandomProduct())
                .build();
    }

    private Product generateRandomProduct() {
        return Product.builder()
                .color(faker.options().option(Color.class))
                .designType(faker.options().option(DesignType.class))
                .type(faker.options().option(ProductType.class))
                .build();
    }

    private User generateRandomUser() {
        return User.builder()
                .userId(faker.options().option(UserId.class))
                .username(faker.name().lastName())
                .dateOfBirth(faker.date().birthday())
                .build();
    }
}
