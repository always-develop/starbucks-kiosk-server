package dev.kkkkkksssssaaaa.starbucks.kiosk.domain.payment.entity;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Price {

    private static final int MIN = 0;
    private final int price;

    private Price(int price) {
        if (price < MIN) {
            log.warn("Price is must be more than 0.");
            this.price = MIN;
        } else {
            this.price = price;
        }
    }

    public static Price of(int fee) {
        return new Price(fee);
    }

    public Price setDiscount(Coupon coupon) {
        return new Price(
            this.toInteger() - coupon.getDiscountPrice().toInteger()
        );
    }

    public Price get() {
        return this;
    }

    private int toInteger() {
        return this.price;
    }
}
