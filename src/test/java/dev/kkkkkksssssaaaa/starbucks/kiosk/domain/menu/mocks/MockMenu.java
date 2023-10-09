package dev.kkkkkksssssaaaa.starbucks.kiosk.domain.menu.mocks;

import dev.kkkkkksssssaaaa.starbucks.kiosk.domain.menu.data.MenuType;
import dev.kkkkkksssssaaaa.starbucks.kiosk.domain.menu.entity.Menus;
import dev.kkkkkksssssaaaa.starbucks.kiosk.persistance.entity.MenuPersistenceEntity;
import org.mockito.Mockito;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static org.mockito.Mockito.when;

public class MockMenu {

    private final List<MenuPersistenceEntity> mocks;

    private MockMenu() {
        this.mocks = Arrays.stream(MenuType.values())
            .map(this::createMockByMenuType)
            .collect(Collectors.toList());
    }

    public static Menus getMocks() {
        return Menus.castEntities(new MockMenu().mocks);
    }

    private MenuPersistenceEntity createMockByMenuType(MenuType type) {
        MenuPersistenceEntity mock = Mockito.mock(MenuPersistenceEntity.class);

        when(mock.getType())
            .thenReturn(type);

        return mock;
    }
}
