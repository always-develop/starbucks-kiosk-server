package dev.kkkkkksssssaaaa.starbucks.kiosk.domain.membership.dto.response;

import dev.kkkkkksssssaaaa.starbucks.kiosk.domain.membership.dto.Membership;
import lombok.Getter;

import java.util.List;
import java.util.stream.Collectors;

@Getter
public class MembershipResponse {

    private final long id;
    private final int stampCount;
    private final List<CouponResponse> coupons;

    private MembershipResponse(long id, int stampCount, List<CouponResponse> coupons) {
        this.id = id;
        this.stampCount = stampCount;
        this.coupons = coupons;
    }

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
