package org.example.ToyStore.model.domain;

import org.example.ToyStore.model.domain.Toy;

public interface IToysFactory {

    Toy getNewToy(String name, int quantity, int chancePercentage);
}
