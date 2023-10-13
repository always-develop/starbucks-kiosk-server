package dev.kkkkkksssssaaaa.starbucks.kiosk.domain.payment.entity;

import dev.kkkkkksssssaaaa.starbucks.kiosk.persistance.entity.MemberCouponPersistenceEntity;
import lombok.Getter;

import java.util.List;
import java.util.stream.Collectors;

@Getter
public class Discount {

    private final List<Coupon> coupons;

    private Discount(List<Coupon> coupons) {
        this.coupons = coupons;
    }

    public static Discount castEntities(List<MemberCouponPersistenceEntity> entities) {
        return new Discount(
            entities.stream()
                .map(Coupon::castEntity)
                .collect(Collectors.toList())
        );
    }

    public static Discount of(List<Long> ids) {
        return new Discount(
            ids.stream()
                .map(Coupon::of)
                .collect(Collectors.toList())
        );
    }
}
