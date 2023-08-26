package dev.kkkkkksssssaaaa.starbucks.kiosk.domain.menu.data;

import com.fasterxml.jackson.annotation.JsonValue;
import lombok.Getter;

@Getter
public enum MenuType {

    COLD_BREW("cold-brew"),
    BREWED("brewed"),
    ESPRESSO("espresso"),
    FRAPPUCCINO("frappuccino"),
    BLENDED("blended"),
    REFRESHERS("refreshers"),
    FIZZIO("fizzio"),
    TEA("tea"),
    ETC("etc"),
    JUICE("juice");

    @JsonValue
    private final String title;

    MenuType(String title) {
        this.title = title;
    }
}
