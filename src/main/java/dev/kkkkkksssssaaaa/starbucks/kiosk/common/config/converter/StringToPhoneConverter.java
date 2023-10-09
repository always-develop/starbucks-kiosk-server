package dev.kkkkkksssssaaaa.starbucks.kiosk.common.config.converter;

import dev.kkkkkksssssaaaa.starbucks.kiosk.domain.membership.entity.Phone;
import lombok.NonNull;
import org.springframework.core.convert.converter.Converter;

public class StringToPhoneConverter implements Converter<String, Phone> {

    @Override
    public Phone convert(@NonNull String value) {
        return Phone.of(value);
    }
}
