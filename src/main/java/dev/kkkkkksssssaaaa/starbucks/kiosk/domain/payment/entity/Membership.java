package dev.kkkkkksssssaaaa.starbucks.kiosk.domain.payment.entity;

import java.util.Optional;

public class Membership {

    private final Long id;

    private Membership(Long id) {
        this.id = id;
    }

    public static Membership of(Optional<Long> optionalId) {
        return optionalId.map(Membership::new)
            .orElseGet(Membership::empty);
    }

    static Membership empty() {
        return new Membership(null);
    }

    public boolean isGuest() {
        return Optional.ofNullable(id).isEmpty();
    }
}
