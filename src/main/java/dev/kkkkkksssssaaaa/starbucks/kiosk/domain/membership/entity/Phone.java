package dev.kkkkkksssssaaaa.starbucks.kiosk.domain.membership.entity;

public class Phone {

    private static final String HYPHEN = "-";
    private static final int LAST_NUMBER_INDEX = 2;
    private final String phone;

    private Phone(String phone) {
        this.phone = phone;
    }

    public static Phone of(String stringOfPhone) {
        PhoneValidator.validate(stringOfPhone);

        return new Phone(stringOfPhone);
    }

    public String lastNumber() {
        return phone.split(HYPHEN)[LAST_NUMBER_INDEX];
    }

    @Override
    public String toString() {
        return this.phone;
    }
}
