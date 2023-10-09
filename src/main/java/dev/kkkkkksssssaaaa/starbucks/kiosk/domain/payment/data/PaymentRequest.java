package dev.kkkkkksssssaaaa.starbucks.kiosk.domain.payment.data;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;
import java.util.Optional;

public record PaymentRequest(

    @JsonProperty("menus") List<Long> menus,
    @JsonProperty("coupons") List<Long> coupons,
    @JsonProperty("membership") Optional<Long> membership
) {
}
