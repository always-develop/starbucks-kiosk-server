package dev.kkkkkksssssaaaa.starbucks.kiosk.persistance.repository;

import dev.kkkkkksssssaaaa.starbucks.kiosk.persistance.entity.MemberPersistenceEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("memberPersistenceRepository")
public interface MemberPersistenceRepository
    extends JpaRepository<MemberPersistenceEntity, Long>, MembershipCustomRepository {
}
