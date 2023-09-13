package dev.kkkkkksssssaaaa.starbucks.kiosk.domain.order.dto;

import java.util.List;

public class Discount {

    private final List<Long> coupons;

    public Discount(List<Long> coupons) {
        this.coupons = coupons;
    }

    public List<Long> getCoupons() {
        return coupons;
    }
}
