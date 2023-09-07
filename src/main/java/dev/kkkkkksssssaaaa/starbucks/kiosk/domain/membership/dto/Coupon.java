package dev.kkkkkksssssaaaa.starbucks.kiosk.domain.membership.dto;

import dev.kkkkkksssssaaaa.starbucks.kiosk.persistance.entity.MemberCouponPersistenceEntity;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class Coupon {

    private final Long id;
    private final LocalDateTime expiredAt;
    private final boolean used;

    private Coupon(Long id, LocalDateTime expiredAt, boolean used) {
        this.id = id;
        this.expiredAt = expiredAt;
        this.used = used;
    }

    public static Coupon castEntity(MemberCouponPersistenceEntity entity) {
        return new Coupon(
            entity.getId(),
            entity.getExpiredAt(),
            entity.isUsed()
        );
    }
}
