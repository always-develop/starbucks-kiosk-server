package dev.kkkkkksssssaaaa.starbucks.kiosk.domain.order.dto;

import java.util.Optional;

public class Membership {

    private final Long id;

    public Membership(Long id) {
        this.id = id;
    }

    public boolean isGuest() {
        return Optional.ofNullable(id).isEmpty();
    }
}
