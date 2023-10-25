package dev.kkkkkksssssaaaa.starbucks.kiosk.domain.payment;

import com.fasterxml.jackson.annotation.JsonProperty;

public record PaymentResponse(
    @JsonProperty("orderNumber") String orderNumber,
    @JsonProperty("stampCount") int stampCount
) {
}
