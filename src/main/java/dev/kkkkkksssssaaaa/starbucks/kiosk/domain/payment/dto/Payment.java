package dev.kkkkkksssssaaaa.starbucks.kiosk.domain.payment.dto;

public class Payment {

    private final OrderList orderList;
    private final Discount discount;
    private final Membership membership;

    public Payment(OrderList orderList, Discount discount, Membership membership) {
        this.orderList = orderList;
        this.discount = discount;
        this.membership = membership;
    }
}
