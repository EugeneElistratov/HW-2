package org.example.ToyStore.model.domain;

import org.example.ToyStore.model.domain.Toy;

public class MapperIml implements org.example.ToyStore.model.domain.IMapper, org.example.ToyStore.model.domain.IValidator {

    private final String separator = ":;:";

    @Override
    public String map(Toy toy) {
        return String.format(
                "%d" + separator + "%s" + separator + "%d" + separator + "%d",
                toy.getId(), toy.getName(), toy.getQuantity(), toy.getChancePercentage()
        );
    }

    @Override
    public Toy map(String line) {
        String[] lines = line.split(separator);
        return new Toy(
                Integer.parseInt(lines[0]),
                lines[1],
                Integer.parseInt(lines[2]),
                Integer.parseInt(lines[3])
        );
    }

    @Override
    public boolean validateToy(Toy toy) {
        return (
                !toy.getName().contains(separator) &&
                        toy.getQuantity() > 0 &&
                        toy.getChancePercentage() >= 0 &&
                        toy.getChancePercentage() <= 100

        );
    }
}