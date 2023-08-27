package dev.kkkkkksssssaaaa.starbucks.kiosk.domain.menu.dto.response;

import dev.kkkkkksssssaaaa.starbucks.kiosk.domain.menu.dto.Menus;

import java.util.List;
import java.util.stream.Collectors;

public class MenuResponseFactory {

    private static final MenuResponseFactory INSTANCE = new MenuResponseFactory();

    private MenuResponseFactory() {
    }

    public static List<MenuResponse> castMenus(Menus menus) {
        return getInstance().doCastMenus(menus);
    }

    private static MenuResponseFactory getInstance() {
        return INSTANCE;
    }

    private List<MenuResponse> doCastMenus(Menus menus) {
        return menus.toList()
            .stream()
            .map(MenuResponse::castDto)
            .collect(Collectors.toList());
    }
}
