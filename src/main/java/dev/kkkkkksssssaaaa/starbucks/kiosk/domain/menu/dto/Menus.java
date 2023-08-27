package dev.kkkkkksssssaaaa.starbucks.kiosk.domain.menu.dto;

import dev.kkkkkksssssaaaa.starbucks.kiosk.persistance.entity.MenuPersistenceEntity;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Menus {

    private final List<Menu> menus;

    private Menus(List<Menu> menus) {
        this.menus = menus;
    }

    public static Menus castEntities(List<MenuPersistenceEntity> entities) {
        return new Menus(
            entities.stream()
                .map(Menu::castEntity)
                .collect(Collectors.toList())
        );
    }

    public boolean isEmpty() {
        return this.menus.isEmpty();
    }

    public List<Menu> toList() {
        return new ArrayList<>(this.menus);
    }
}
