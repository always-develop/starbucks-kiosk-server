package dev.kkkkkksssssaaaa.starbucks.kiosk.domain.membership.dto;

import org.springframework.validation.annotation.Validated;

@Validated
public class Phone {

    private final String phone;

    private Phone(String phone) {
        this.phone = phone;
    }

    public static Phone of(String stringOfPhone) {
        PhoneValidator.validate(stringOfPhone);

        return new Phone(stringOfPhone);
    }

    @Override
    public String toString() {
        return this.phone;
    }
}
