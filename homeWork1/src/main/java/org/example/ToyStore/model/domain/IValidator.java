package org.example.ToyStore.model.domain;

import org.example.ToyStore.model.domain.Toy;

public interface IValidator {

    boolean validateToy(Toy toy);
}