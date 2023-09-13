package dev.kkkkkksssssaaaa.starbucks.kiosk.domain.order.dto;

import java.util.List;

public class OrderList {

    private final List<Long> menus;

    public OrderList(List<Long> menus) {
        this.menus = menus;
    }

    public List<Long> getMenus() {
        return menus;
    }
}
