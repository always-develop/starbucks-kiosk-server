package dev.kkkkkksssssaaaa.starbucks.kiosk.domain.menu;

import dev.kkkkkksssssaaaa.starbucks.kiosk.domain.menu.data.MenuType;
import dev.kkkkkksssssaaaa.starbucks.kiosk.domain.menu.entity.Menus;
import dev.kkkkkksssssaaaa.starbucks.kiosk.domain.menu.service.RetrieveMenusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/menus")
public class MenuController {

    private final RetrieveMenusService retrieveAllMenu;

    @Autowired
    public MenuController(
        RetrieveMenusService retrieveMenusService
    ) {
        this.retrieveAllMenu = retrieveMenusService;
    }

    @GetMapping("/{type}")
    public ResponseEntity<List<MenuResponse>> getMenus(
        @PathVariable("type") MenuType type
    ) {
        Menus menus = retrieveAllMenu.byType(type);

        return ResponseEntity.status(HttpStatus.OK)
            .body(MenuResponseFactory.castMenus(menus));
    }
}
