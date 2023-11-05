package dev.kkkkkksssssaaaa.starbucks.kiosk.persistance.dao;

import com.querydsl.core.annotations.QueryProjection;
import dev.kkkkkksssssaaaa.starbucks.kiosk.persistance.entity.MemberCouponPersistenceEntity;
import dev.kkkkkksssssaaaa.starbucks.kiosk.persistance.entity.MemberPersistenceEntity;
import dev.kkkkkksssssaaaa.starbucks.kiosk.persistance.entity.MemberStampPersistenceEntity;
import lombok.Getter;

import java.util.Set;

@Getter
public class MembershipDao {

    private final MemberPersistenceEntity member;
    private final Set<MemberStampPersistenceEntity> stamp;
    private final Set<MemberCouponPersistenceEntity> coupon;

    @QueryProjection
    public MembershipDao(
        MemberPersistenceEntity member,
        Set<MemberStampPersistenceEntity> stamp,
        Set<MemberCouponPersistenceEntity> coupon
    ) {
        this.member = member;
        this.stamp = stamp;
        this.coupon = coupon;
    }

    @Override
    public int hashCode() {
        return this.member.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }

        if (obj.getClass().equals(this.getClass())) {
            return false;
        }

        return obj.hashCode() == this.hashCode();
    }
}
