package dev.kkkkkksssssaaaa.starbucks.kiosk.domain.membership.entity;

import org.apache.logging.log4j.util.Strings;

import java.util.regex.Pattern;

class PhoneValidator {

    private static final PhoneValidator INSTANCE = new PhoneValidator();
    private static final String REGEX = "^010(-)([0-9]{4})(-)([0-9]{4})$";
    private static final String VALIDATE_ERROR_MESSAGE = "This string is not phone number.";

    private static final Pattern pattern = Pattern.compile(REGEX);

    private PhoneValidator() {
    }

    public static void validate(String stringOfPhone) {
        INSTANCE.doValidate(stringOfPhone);
    }

    private void doValidate(String stringOfPhone) {
        if (Strings.isBlank(stringOfPhone)) {
            throw new IllegalStateException(VALIDATE_ERROR_MESSAGE);
        }

        if (!pattern.matcher(stringOfPhone).find()) {
            throw new IllegalStateException(VALIDATE_ERROR_MESSAGE);
        }
    }
}
