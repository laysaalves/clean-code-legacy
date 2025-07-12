package dev.layseiras.store.core.entity;

import dev.layseiras.store.core.enums.StoreType;

import java.time.LocalDateTime;

public class Store {
    private final Long id;
    private final String title;
    private final String description;
    private final String identifier;
    private final StoreType storeType;
    private final LocalDateTime created;

    public Store(Long id, String title, String description, String identifier, LocalDateTime created, StoreType storeType) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.identifier = identifier;
        this.storeType = storeType;
        this.created = created;
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getIdentifier() {
        return identifier;
    }

    public StoreType getStoreType() {
        return storeType;
    }

    public LocalDateTime getCreated() {
        return created;
    }
}
