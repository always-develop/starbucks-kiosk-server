package dev.kkkkkksssssaaaa.starbucks.kiosk.domain.menu.service;

import dev.kkkkkksssssaaaa.starbucks.kiosk.domain.menu.data.MenuType;
import dev.kkkkkksssssaaaa.starbucks.kiosk.domain.menu.dto.response.MenusResponse;
import dev.kkkkkksssssaaaa.starbucks.kiosk.domain.menu.repository.MenuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RetrieveMenusService {

    private final MenuRepository repository;

    @Autowired
    public RetrieveMenusService(MenuRepository repository) {
        this.repository = repository;
    }

    public MenusResponse byType(MenuType type) {
        return new MenusResponse(
            repository.findAllMenusByType(type).toList()
        );
    }
}
