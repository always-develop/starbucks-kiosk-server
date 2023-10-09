package dev.kkkkkksssssaaaa.starbucks.kiosk.domain.menu;

import dev.kkkkkksssssaaaa.starbucks.kiosk.domain.menu.entity.Menu;
import lombok.Getter;

@Getter
public class MenuResponse {

    private final Long id;
    private final String name;
    private final int price;
    private final String image;

    private MenuResponse(Long id, String name, int price, String image) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.image = image;
    }

    public static MenuResponse castDto(Menu menu) {
        return new MenuResponse(
            menu.getId(),
            menu.getName(),
            menu.getPrice(),
            menu.getImage()
        );
    }
}
