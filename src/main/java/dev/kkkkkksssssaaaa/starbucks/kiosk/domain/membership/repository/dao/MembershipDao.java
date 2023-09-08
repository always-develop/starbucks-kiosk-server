package dev.kkkkkksssssaaaa.starbucks.kiosk.domain.membership.repository.dao;

import com.querydsl.core.annotations.QueryProjection;
import dev.kkkkkksssssaaaa.starbucks.kiosk.persistance.entity.MemberCouponPersistenceEntity;
import dev.kkkkkksssssaaaa.starbucks.kiosk.persistance.entity.MemberPersistenceEntity;
import dev.kkkkkksssssaaaa.starbucks.kiosk.persistance.entity.MemberStampPersistenceEntity;
import lombok.Getter;

import java.util.List;

@Getter
public class MembershipDao {

    private final MemberPersistenceEntity member;
    private final List<MemberStampPersistenceEntity> stamp;
    private final List<MemberCouponPersistenceEntity> coupon;

    @QueryProjection
    public MembershipDao(
        MemberPersistenceEntity member,
        List<MemberStampPersistenceEntity> stamp,
        List<MemberCouponPersistenceEntity> coupon
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
