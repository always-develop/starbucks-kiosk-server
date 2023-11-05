package dev.kkkkkksssssaaaa.starbucks.kiosk.persistance.repository;

import dev.kkkkkksssssaaaa.starbucks.kiosk.persistance.entity.OrderMenuPersistenceEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("orderMenuPersistenceRepository")
public interface OrderMenuPersistenceRepository
    extends JpaRepository<OrderMenuPersistenceEntity, Long> {
}
