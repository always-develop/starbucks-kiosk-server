package dev.kkkkkksssssaaaa.starbucks.kiosk.domain.membership.dto;

import dev.kkkkkksssssaaaa.starbucks.kiosk.persistance.entity.MemberCouponPersistenceEntity;
import dev.kkkkkksssssaaaa.starbucks.kiosk.persistance.entity.MemberPersistenceEntity;
import dev.kkkkkksssssaaaa.starbucks.kiosk.persistance.entity.MemberStampPersistenceEntity;

import java.util.List;

public class Membership {

    private final Phone phone;
    private final int stampCount;
    private final Coupons coupons;

    private Membership(Phone phone, int stampCount, Coupons coupons) {
        this.phone = phone;
        this.stampCount = stampCount;
        this.coupons = coupons;
    }

    public static Membership of(
        MemberPersistenceEntity memberEntity,
        List<MemberStampPersistenceEntity> stampEntities,
        List<MemberCouponPersistenceEntity> couponEntities
    ) {
        return new Membership(
            Phone.of(memberEntity.getPhone()),
            stampEntities.size(),
            Coupons.castEntities(couponEntities)
        );
    }
}
