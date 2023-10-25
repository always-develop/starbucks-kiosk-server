package dev.kkkkkksssssaaaa.starbucks.kiosk.persistance.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class MembershipCustomRepositoryImplTest {

    @Autowired private MembershipCustomRepositoryImpl repository;

    @Test
    void doFindMembership() {
        repository.findMembership("010-1234-1234");
    }
}