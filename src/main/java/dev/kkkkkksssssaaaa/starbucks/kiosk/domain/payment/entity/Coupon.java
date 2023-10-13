package dev.kkkkkksssssaaaa.starbucks.kiosk.domain.payment.entity;

import dev.kkkkkksssssaaaa.starbucks.kiosk.persistance.entity.MemberCouponPersistenceEntity;
import lombok.Getter;

@Getter
public class Coupon {

    private final Long id;
    private final Price discountPrice;

    private Coupon(Long id, Price discountPrice) {
        this.id = id;
        this.discountPrice = discountPrice;
    }

    public static Coupon castEntity(MemberCouponPersistenceEntity entity) {
        return new Coupon(
            entity.getId(),
            Price.of(entity.getDiscountPrice())
        );
    }

    public static Coupon of(long id) {
        return new Coupon(
            id,
            Price.of(0)
        );
    }
}
