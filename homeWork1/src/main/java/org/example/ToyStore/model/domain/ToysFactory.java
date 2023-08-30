package org.example.ToyStore.model.domain;

import org.example.ToyStore.model.domain.Toy;

public class ToysFactory implements IToysFactory {

    @Override
    public Toy getNewToy(String name, int quantity, int chancePercentage) {
        return new Toy(
                name,
                quantity,
                chancePercentage
        );
    }
}
