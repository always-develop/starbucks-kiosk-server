package dev.kkkkkksssssaaaa.starbucks.kiosk.domain.payment.domain.order.entity;

import java.util.concurrent.atomic.AtomicInteger;

public class OrderNumberStore {

    // TODO: reset to 100 every 0 o'clock
    private static final AtomicInteger ORDER_NUMBER = new AtomicInteger(100);
    private static final OrderNumberStore SINGLETON_INSTANCE = new OrderNumberStore();

    private OrderNumberStore() {
    }

    public static OrderNumberStore getInstance() {
        return SINGLETON_INSTANCE;
    }

    public int issuedNewOrderNumber() {
        return ORDER_NUMBER.incrementAndGet();
    }
}
