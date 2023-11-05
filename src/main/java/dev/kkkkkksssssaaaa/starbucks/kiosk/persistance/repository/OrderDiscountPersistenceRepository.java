package dev.kkkkkksssssaaaa.starbucks.kiosk.persistance.repository;

import dev.kkkkkksssssaaaa.starbucks.kiosk.persistance.entity.OrderDiscountPersistenceEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("orderDiscountPersistenceRepository")
public interface OrderDiscountPersistenceRepository
    extends JpaRepository<OrderDiscountPersistenceEntity, Long> {
}
