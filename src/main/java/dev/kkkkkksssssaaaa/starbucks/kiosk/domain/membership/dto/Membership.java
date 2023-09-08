package dev.kkkkkksssssaaaa.starbucks.kiosk.domain.membership.dto;

import dev.kkkkkksssssaaaa.starbucks.kiosk.domain.membership.repository.dao.MembershipDao;

public class Membership {

    private final Phone phone;
    private final int stampCount;
    private final Coupons coupons;

    private Membership(Phone phone, int stampCount, Coupons coupons) {
        this.phone = phone;
        this.stampCount = stampCount;
        this.coupons = coupons;
    }

    public static Membership of(MembershipDao membershipEntity) {
        return new Membership(
            Phone.of(membershipEntity.getMember().getPhone()),
            membershipEntity.getStamp().size(),
            Coupons.castEntities(membershipEntity.getCoupon())
        );
    }

    public static Membership registeredNew(Phone phone) {
        return new Membership(phone, 0, Coupons.empty());
    }
}
