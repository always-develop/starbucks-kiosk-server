package dev.kkkkkksssssaaaa.starbucks.kiosk.common.config;

import dev.kkkkkksssssaaaa.starbucks.kiosk.common.config.converter.StringToPhoneConverter;
import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addFormatters(FormatterRegistry registry) {
        registry.addConverter(new StringToPhoneConverter());
    }
}
