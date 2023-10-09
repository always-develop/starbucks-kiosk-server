package dev.kkkkkksssssaaaa.starbucks.kiosk.domain.payment.dto;

import dev.kkkkkksssssaaaa.starbucks.kiosk.domain.membership.dto.Phone;

import java.util.Optional;

public class Membership {

    private final Long id;
    private final Phone phone;

    public Membership(Long id, Phone phone) {
        this.id = id;
        this.phone = phone;
    }

    public boolean isGuest() {
        return Optional.ofNullable(id).isEmpty();
    }

    public Phone getPhone() {
        return this.phone;
    }
}
