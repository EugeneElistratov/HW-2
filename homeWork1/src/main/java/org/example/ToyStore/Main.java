package org.example.ToyStore;

import org.example.ToyStore.di.Component;

public class Main {

    private static final Component appComponent = new Component();

    public static void main(String[] args) {

        appComponent.shopView.run();
    }
}