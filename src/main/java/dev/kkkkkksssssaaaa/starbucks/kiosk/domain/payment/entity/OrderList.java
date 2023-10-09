package dev.kkkkkksssssaaaa.starbucks.kiosk.domain.payment.entity;

import dev.kkkkkksssssaaaa.starbucks.kiosk.persistance.entity.MenuPersistenceEntity;
import lombok.Getter;

import java.util.List;
import java.util.stream.Collectors;

@Getter
public class OrderList {

    private final List<Menu> menus;

    private OrderList(List<Menu> menus) {
        this.menus = menus;
    }

    public static OrderList castEntities(List<MenuPersistenceEntity> entities) {
        return new OrderList(
            entities.stream()
                .map(Menu::castEntity)
                .collect(Collectors.toList())
        );
    }
}
