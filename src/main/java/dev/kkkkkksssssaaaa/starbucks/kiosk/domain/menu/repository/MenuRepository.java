package dev.kkkkkksssssaaaa.starbucks.kiosk.domain.menu.repository;

import dev.kkkkkksssssaaaa.starbucks.kiosk.domain.menu.data.MenuType;
import dev.kkkkkksssssaaaa.starbucks.kiosk.domain.menu.dto.Menus;

public interface MenuRepository {

    Menus findAllMenus();
    Menus findAllMenusByType(MenuType type);
}
