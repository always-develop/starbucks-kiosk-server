package dev.kkkkkksssssaaaa.starbucks.kiosk.domain.menu.repository;

import dev.kkkkkksssssaaaa.starbucks.kiosk.domain.menu.data.MenuType;
import dev.kkkkkksssssaaaa.starbucks.kiosk.domain.menu.entity.Menus;
import dev.kkkkkksssssaaaa.starbucks.kiosk.persistance.repository.MenuPersistenceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class MenuRepositoryImpl implements MenuRepository {

    private final MenuPersistenceRepository persistenceRepository;

    @Autowired
    public MenuRepositoryImpl(MenuPersistenceRepository persistenceRepository) {
        this.persistenceRepository = persistenceRepository;
    }

    @Override
    public Menus findAllMenus() {
        return Menus.castEntities(persistenceRepository.findAll());
    }

    @Override
    public Menus findAllMenusByType(MenuType type) {
        return Menus.castEntities(
            persistenceRepository.findAllByType(type)
        );
    }
}
