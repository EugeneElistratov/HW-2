package org.example.ToyStore.views;

import org.example.ToyStore.model.domain.Toy;

public class ToysAdapterImpl implements IToysAdapter {

    @Override
    public String getView(Toy toy) {
        return toy.toString();
    }
}
