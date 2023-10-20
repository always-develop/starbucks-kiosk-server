package dev.kkkkkksssssaaaa.starbucks.kiosk.domain.payment.domain.order.entity;

public class OrderNumber {

    private final String value;

    private OrderNumber(String value) {
        this.value = value;
    }

    public static OrderNumber createByGuest(int value) {
        return new OrderNumber(String.valueOf(value));
    }

    public static OrderNumber createByMember(Membership membership) {
        return new OrderNumber(membership.getPhone().lastNumber());
    }
}
