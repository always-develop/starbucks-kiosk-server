package dev.kkkkkksssssaaaa.starbucks.kiosk.domain.order.entity;

import java.util.concurrent.atomic.AtomicInteger;

public class OrderNumberStore {

    // TODO: reset to 100 every 0 o'clock
    private static AtomicInteger orderNumber = new AtomicInteger(100);

    private OrderNumberStore() {
    }

    public static int issuedNewOrderNumber() {
        return orderNumber.incrementAndGet();
    }
}
