package dev.kkkkkksssssaaaa.starbucks.kiosk.domain.order.entity;

public class OrderNumber {

    private final String value;

    private OrderNumber(String value) {
        this.value = value;
    }

    public static OrderNumber createByMembership(Membership membership) {
        if (membership.isGuest()) {
            return new OrderNumber(
                String.valueOf(OrderNumberStore.issuedNewOrderNumber())
            );
        }

        return new OrderNumber(
            membership.getPhone().lastNumber()
        );
    }
}
