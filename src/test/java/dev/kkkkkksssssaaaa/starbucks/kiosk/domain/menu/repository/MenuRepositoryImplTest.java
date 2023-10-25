package dev.kkkkkksssssaaaa.starbucks.kiosk.domain.menu.repository;

import dev.kkkkkksssssaaaa.starbucks.kiosk.domain.menu.entity.Menus;
import dev.kkkkkksssssaaaa.starbucks.kiosk.domain.menu.mocks.MockMenu;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

class MenuRepositoryImplTest {

    private MenuRepositoryImpl mockRepository;

    @BeforeEach
    void beforeEach() {
        mockRepository = Mockito.mock(MenuRepositoryImpl.class);

        Menus mockMenu = MockMenu.getMocks();

        when(mockRepository.findAllMenus())
            .thenReturn(mockMenu);
    }

    @Test
    void getAll() {
        assertNotNull(mockRepository.findAllMenus());
    }
}