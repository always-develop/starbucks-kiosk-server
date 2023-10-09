package dev.kkkkkksssssaaaa.starbucks.kiosk.domain.order.dto;

import dev.kkkkkksssssaaaa.starbucks.kiosk.domain.membership.dto.Phone;
import lombok.Getter;

import java.util.Optional;

@Getter
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
}
