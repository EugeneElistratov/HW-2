package org.example.ToyStore.di;

import org.example.ToyStore.model.domain.IShopController;
import org.example.ToyStore.model.domain.IRepository;
import org.example.ToyStore.model.domain.IStorage;
import org.example.ToyStore.views.IView;

public class Component {

    public IStorage storage;
    public IRepository repository;
    public IShopController noteController;
    public IView shopView;

    public Component() {

        storage = Module.provideStorage();
        repository = Module.provideRepository(storage, Module.provideMapper());
        noteController = Module.provideNoteController(repository, Module.provideValidator());
        shopView = Module.provideView(
                noteController,
                Module.providePromptable(
                        Module.provideLogger()
                ),
                Module.provideToysAdapter(),
                Module.provideNotesFactory()
        );
    }
}