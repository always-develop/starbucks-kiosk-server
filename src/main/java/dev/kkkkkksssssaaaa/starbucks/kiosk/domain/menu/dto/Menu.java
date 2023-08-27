package dev.kkkkkksssssaaaa.starbucks.kiosk.domain.menu.dto;

import dev.kkkkkksssssaaaa.starbucks.kiosk.domain.menu.data.MenuType;
import dev.kkkkkksssssaaaa.starbucks.kiosk.persistance.entity.MenuPersistenceEntity;
import lombok.Getter;

@Getter
public class Menu {

    private final Long id;
    private final String name;
    private final int price;
    private final MenuType type;
    private final String image;

    private Menu(Long id, String name, int price, MenuType type, String image) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.type = type;
        this.image = image;
    }

    public static Menu castEntity(MenuPersistenceEntity entity) {
        return new Menu(
            entity.getId(),
            entity.getName(),
            entity.getPrice(),
            entity.getType(),
            entity.getImage()
        );
    }
}
