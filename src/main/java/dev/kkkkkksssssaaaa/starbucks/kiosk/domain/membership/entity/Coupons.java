package dev.kkkkkksssssaaaa.starbucks.kiosk.domain.membership.entity;

import dev.kkkkkksssssaaaa.starbucks.kiosk.persistance.entity.MemberCouponPersistenceEntity;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Coupons {

    private final List<Coupon> coupons;

    private Coupons(List<Coupon> coupons) {
        this.coupons = coupons;
    }

    public static Coupons castEntities(Set<MemberCouponPersistenceEntity> entities) {
        return new Coupons(
            entities.stream()
                .map(Coupon::castEntity)
                .collect(Collectors.toList())
        );
    }

    public static Coupons empty() {
        return new Coupons(new ArrayList<>());
    }

    public Coupons availableCoupons() {
        return new Coupons(
            this.coupons
                .stream()
                .filter(coupon -> !coupon.isUse())
                .collect(Collectors.toList())
        );
    }

    public List<Coupon> toList() {
        return new ArrayList<>(coupons);
    }
}
