package dev.kkkkkksssssaaaa.starbucks.kiosk.domain.membership;

import com.fasterxml.jackson.annotation.JsonProperty;
import dev.kkkkkksssssaaaa.starbucks.kiosk.domain.membership.entity.Coupon;

import java.time.LocalDateTime;

public record CouponResponse(
    @JsonProperty("id") long id,
    @JsonProperty("expiredAt") LocalDateTime expiredAt
) {

    public static CouponResponse castDto(Coupon coupon) {
        return new CouponResponse(
            coupon.getId(),
            coupon.getExpiredAt()
        );
    }
}
