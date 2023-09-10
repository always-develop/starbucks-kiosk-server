package dev.kkkkkksssssaaaa.starbucks.kiosk.domain.membership.dto;

import dev.kkkkkksssssaaaa.starbucks.kiosk.domain.membership.repository.dao.MembershipDao;
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
            membershipEntity.getStamp().size(),
            Coupons.castEntities(membershipEntity.getCoupon())
        );
    }

    public static Membership registeredNew(Phone phone) {
        return new Membership(null, phone, 0, Coupons.empty());
    }
}
