package dev.kkkkkksssssaaaa.starbucks.kiosk.domain.membership.entity;

import dev.kkkkkksssssaaaa.starbucks.kiosk.domain.membership.repository.dao.MembershipDao;
import dev.kkkkkksssssaaaa.starbucks.kiosk.persistance.entity.MemberPersistenceEntity;
import lombok.Getter;

@Getter
public class Membership {

    private final Long id;
    private final Phone phone;
    private final int stampCount;
    private final Coupons coupons;

    private Membership(Long id, Phone phone, int stampCount, Coupons coupons) {
        this.id = id;
        this.phone = phone;
        this.stampCount = stampCount;
        this.coupons = coupons;
    }

    public static Membership of(MembershipDao membershipEntity) {
        return new Membership(
            membershipEntity.getMember().getId(),
            Phone.of(membershipEntity.getMember().getPhone()),
            membershipEntity.getStamp()
                .stream()
                .filter(stamp -> !stamp.isUsed())
                .toList()
                .size(),
            Coupons.castEntities(membershipEntity.getCoupon())
        );
    }

    public static Membership registeredNew(MemberPersistenceEntity memberEntity) {
        return new Membership(
            memberEntity.getId(),
            Phone.of(memberEntity.getPhone()),
            0,
            Coupons.empty()
        );
    }
}
