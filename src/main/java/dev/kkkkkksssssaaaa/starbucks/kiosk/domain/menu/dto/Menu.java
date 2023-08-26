package dev.kkkkkksssssaaaa.starbucks.kiosk.domain.menu.dto;

import dev.kkkkkksssssaaaa.starbucks.kiosk.persistance.entity.MenuPersistenceEntity;
import lombok.Getter;

@Getter
public class Menu {

    private final Long id;
    private final String name;
    private final int price;

    private Menu(Long id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public static Menu castEntity(MenuPersistenceEntity entity) {
        return new Menu(
            entity.getId(),
            entity.getName(),
            entity.getPrice()
        );
    }
}
