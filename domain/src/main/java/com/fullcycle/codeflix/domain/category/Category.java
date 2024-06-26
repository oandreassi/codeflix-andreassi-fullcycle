package com.fullcycle.codeflix.domain.category;

import java.time.Instant;
import java.util.UUID;

public class Category {

    private String id;
    private String name;
    private String description;
    private Boolean Active;

    private Instant createdAt;
    private Instant updatedAt;
    private Instant deletedAt;

    private Category(
                    final String id,
                    final String name,
                    final String description,
                    final Boolean active,
                    final Instant createdAt,
                    final Instant updatedAt,
                    final Instant deletedAt) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.Active = active;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.deletedAt = deletedAt;
    }

    public static Category newCategory(final String aName,
                                       final String aDescription,
                                       final boolean aIsActive) {

        final var id = UUID.randomUUID().toString();
        final var now = Instant.now();
        return new Category(id, aName, aDescription, aIsActive, now, now, null);

    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Boolean getActive() {
        return Active;
    }

    public Instant getCreatedAt() {
        return createdAt;
    }

    public Instant getUpdatedAt() {
        return updatedAt;
    }

    public Instant getDeletedAt() {
        return deletedAt;
    }
}
