package dev.kkkkkksssssaaaa.starbucks.kiosk.persistance.repository;

import dev.kkkkkksssssaaaa.starbucks.kiosk.persistance.entity.OrderPersistenceEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("orderPersistenceRepository")
public interface OrderPersistenceRepository
    extends JpaRepository<OrderPersistenceEntity, Long>, OrderCustomRepository {
}
