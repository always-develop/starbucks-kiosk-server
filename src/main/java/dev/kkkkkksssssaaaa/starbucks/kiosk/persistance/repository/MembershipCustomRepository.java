package dev.kkkkkksssssaaaa.starbucks.kiosk.persistance.repository;

import dev.kkkkkksssssaaaa.starbucks.kiosk.persistance.dao.MembershipDao;

import java.util.Optional;

public interface MembershipCustomRepository {

    Optional<MembershipDao> findByPhone(String phone);
    MembershipDao get(Long id);
    MembershipDao get(String phone);
}
