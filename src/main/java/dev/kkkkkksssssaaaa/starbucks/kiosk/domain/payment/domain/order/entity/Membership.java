package dev.kkkkkksssssaaaa.starbucks.kiosk.domain.payment.domain.order.entity;

import dev.kkkkkksssssaaaa.starbucks.kiosk.domain.membership.entity.Phone;
import lombok.Getter;

import java.util.Optional;

@Getter
public class Membership {

    private final Long id;
    private final Phone phone;
    private final int stampCount;

    private Membership(Long id, Phone phone, int stampCount) {
        this.id = id;
        this.phone = phone;
        this.stampCount = stampCount;
    }

    public static Membership of(Optional<Long> optionalId) {
        return optionalId.map(id -> new Membership(id, null, 0))
            .orElseGet(() -> new Membership(null, null, 0));
    }

    public boolean isGuest() {
        return Optional.ofNullable(this.id).isEmpty();
    }
}
