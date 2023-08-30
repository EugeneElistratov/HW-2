package org.example.ToyStore.model.domain;

import org.example.ToyStore.model.domain.Toy;

import java.util.List;

public interface IRepository {

    List<Toy> getAllToys();

    int createToy(Toy toy);

    void updateToy(Toy toy);

    void deleteToy(Toy toy);

    void saveToy(Toy toy);
}