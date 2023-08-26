package dev.kkkkkksssssaaaa.starbucks.kiosk.domain.menu.dto.response;

import dev.kkkkkksssssaaaa.starbucks.kiosk.domain.menu.dto.Menu;
import lombok.Getter;

import java.util.List;

@Getter
public class MenusResponse {

    private final List<Menu> menus;

    public MenusResponse(List<Menu> menus) {
        this.menus = menus;
    }
}
