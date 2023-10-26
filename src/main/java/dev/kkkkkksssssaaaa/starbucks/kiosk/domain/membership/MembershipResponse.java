package dev.kkkkkksssssaaaa.starbucks.kiosk.domain.membership;

import com.fasterxml.jackson.annotation.JsonProperty;
import dev.kkkkkksssssaaaa.starbucks.kiosk.domain.membership.entity.Membership;

import java.util.List;
import java.util.stream.Collectors;

public record MembershipResponse(
    @JsonProperty("id") long id,
    @JsonProperty("stampCount") int stampCount,
    @JsonProperty("coupons") List<CouponResponse> coupons
) {

    public static MembershipResponse castDto(Membership membership) {
        return new MembershipResponse(
            membership.getId(),
            membership.getStampCount(),
            membership.getCoupons()
                .availableCoupons()
                .toList()
                .stream()
                .map(CouponResponse::castDto)
                .collect(Collectors.toList())
        );
    }
}
