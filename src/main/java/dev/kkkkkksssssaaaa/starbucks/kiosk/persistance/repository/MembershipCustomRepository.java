package dev.kkkkkksssssaaaa.starbucks.kiosk.persistance.repository;

import dev.kkkkkksssssaaaa.starbucks.kiosk.domain.membership.repository.dao.MembershipDao;
import dev.kkkkkksssssaaaa.starbucks.kiosk.persistance.entity.MemberPersistenceEntity;

import java.util.Optional;

public interface MembershipCustomRepository {

    Optional<MembershipDao> findMembership(String phone);
    MembershipDao get(String phone);
}
