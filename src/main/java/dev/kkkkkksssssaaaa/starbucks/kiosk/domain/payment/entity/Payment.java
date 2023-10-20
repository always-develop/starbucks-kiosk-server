package dev.kkkkkksssssaaaa.starbucks.kiosk.domain.payment.entity;

import dev.kkkkkksssssaaaa.starbucks.kiosk.domain.payment.PaymentRequest;
import dev.kkkkkksssssaaaa.starbucks.kiosk.domain.payment.domain.order.entity.Membership;
import lombok.Getter;

@Getter
public class Payment {

    private final OrderList orderList;
    private final Discount discount;
    private final Membership membership;

    private Payment(OrderList orderList, Discount discount, Membership membership) {
        this.orderList = orderList;
        this.discount = discount;
        this.membership = membership;
    }

    public static Payment castDto(PaymentRequest request) {
        return new Payment(
            OrderList.of(request.menus()),
            Discount.of(request.coupons()),
            Membership.of(request.membership())
        );
    }
}
