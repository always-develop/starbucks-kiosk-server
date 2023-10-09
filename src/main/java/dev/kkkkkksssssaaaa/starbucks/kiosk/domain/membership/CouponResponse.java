package dev.kkkkkksssssaaaa.starbucks.kiosk.domain.membership;

import dev.kkkkkksssssaaaa.starbucks.kiosk.domain.membership.entity.Coupon;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class CouponResponse {

    private final long id;
    private final LocalDateTime expiredAt;

    private CouponResponse(long id, LocalDateTime expiredAt) {
        this.id = id;
        this.expiredAt = expiredAt;
    }

    public static CouponResponse castDto(Coupon coupon) {
        return new CouponResponse(
            coupon.getId(),
            coupon.getExpiredAt()
        );
    }
}
