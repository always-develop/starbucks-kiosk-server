package dev.kkkkkksssssaaaa.starbucks.kiosk.domain.membership.entity;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PhoneValidatorTest {

    @Test
    void 문자열이_010으로_시작하는_핸드폰번호라면_예외를_던지지_않는다() {
        String phone = "010-1234-1234";
        assertDoesNotThrow(() -> PhoneValidator.validate(phone));
    }

    @Test
    void 문자열이_010으로_시작하지_않는_핸드폰번호라면_IllegalStateException을_던진다() {
        String phone = "011-1234-1234";
        assertThrows(IllegalStateException.class, () -> PhoneValidator.validate(phone));
    }

    @Test
    void 중간_자리가_네_자리가_아니라면_IllegalStateException을_던진다() {
        String phone = "010-123-1234";
        assertThrows(IllegalStateException.class, () -> PhoneValidator.validate(phone));
    }

    @Test
    void 끝_자리가_네_자리가_아니라면_IllegalStateException을_던진다() {
        String phone = "010-1234-123";
        assertThrows(IllegalStateException.class, () -> PhoneValidator.validate(phone));
    }

    @Test
    void 문자열에_하이픈이_없다면_IllegalStateException을_던진다() {
        String phone = "01012341234";
        assertThrows(IllegalStateException.class, () -> PhoneValidator.validate(phone));
    }

    @Test
    void 문자열이_null이라면_IllegalStateException을_던진다() {
        String phone = null;
        assertThrows(IllegalStateException.class, () -> PhoneValidator.validate(phone));
    }

    @Test
    void 빈_문자열이라면_IllegalStateException을_던진다() {
        String phone = "";
        assertThrows(IllegalStateException.class, () -> PhoneValidator.validate(phone));
    }
}