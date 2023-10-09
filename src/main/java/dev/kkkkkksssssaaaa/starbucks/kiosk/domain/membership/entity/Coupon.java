package dev.kkkkkksssssaaaa.starbucks.kiosk.domain.membership.entity;

import dev.kkkkkksssssaaaa.starbucks.kiosk.persistance.entity.MemberCouponPersistenceEntity;
import lombok.Getter;

import java.time.LocalDateTime;
import java.util.Optional;

@Getter
public class Coupon {

    private final Long id;
    private final LocalDateTime createAt;
    private final LocalDateTime expiredAt;
    private final LocalDateTime usedAt;

    private Coupon(Long id, LocalDateTime createAt, LocalDateTime expiredAt, LocalDateTime usedAt) {
        this.id = id;
        this.createAt = createAt;
        this.expiredAt = expiredAt;
        this.usedAt = usedAt;
    }

    public static Coupon castEntity(MemberCouponPersistenceEntity entity) {
        return new Coupon(
            entity.getId(),
            entity.getCreatedAt(),
            entity.getExpiredAt(),
            entity.getUsedAt()
        );
    }

    public boolean isUse() {
        return expiredAt.isBefore(LocalDateTime.now())
            || Optional.ofNullable(usedAt).isPresent();
    }
}
