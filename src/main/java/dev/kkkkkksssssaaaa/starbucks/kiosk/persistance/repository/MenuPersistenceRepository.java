package dev.kkkkkksssssaaaa.starbucks.kiosk.persistance.repository;

import dev.kkkkkksssssaaaa.starbucks.kiosk.domain.menu.data.MenuType;
import dev.kkkkkksssssaaaa.starbucks.kiosk.persistance.entity.MenuPersistenceEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("menuPersistenceRepository")
public interface MenuPersistenceRepository extends JpaRepository<MenuPersistenceEntity, Long> {

    List<MenuPersistenceEntity> findAllByType(MenuType type);
}
