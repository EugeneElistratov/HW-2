package org.example.ToyStore.model.domain;

import org.example.ToyStore.model.domain.Toy;

public interface IMapper {

    String map(Toy toy);

    Toy map(String line);
}