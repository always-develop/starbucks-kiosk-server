package dev.kkkkkksssssaaaa.starbucks.kiosk.persistance.repository;

import dev.kkkkkksssssaaaa.starbucks.kiosk.persistance.entity.SalesHistoryPersistenceEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("salesHistoryPersistenceRepository")
public interface SalesHistoryPersistenceRepository
    extends JpaRepository<SalesHistoryPersistenceEntity, Long> {
}
