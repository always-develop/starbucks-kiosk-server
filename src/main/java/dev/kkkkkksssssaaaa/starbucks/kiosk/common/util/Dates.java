package dev.kkkkkksssssaaaa.starbucks.kiosk.common.util;

import java.time.LocalDateTime;

public class Dates {

    private Dates() {
    }

    public static LocalDateTime aWeekLater() {
        return LocalDateTime.now().plusWeeks(1L);
    }
}
