package dev.kkkkkksssssaaaa.starbucks.kiosk.domain.payment.entity;

import dev.kkkkkksssssaaaa.starbucks.kiosk.persistance.entity.MenuPersistenceEntity;

public class Menu {

    private final Long id;
    private final Price price;

    private Menu(Long id, Price price) {
        this.id = id;
        this.price = price;
    }

    public static Menu castEntity(MenuPersistenceEntity entity) {
        return new Menu(
            entity.getId(),
            Price.of(entity.getPrice())
        );
    }
}