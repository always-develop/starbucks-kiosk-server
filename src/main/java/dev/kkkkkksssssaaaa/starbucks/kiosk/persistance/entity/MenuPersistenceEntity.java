package dev.kkkkkksssssaaaa.starbucks.kiosk.persistance.entity;

import dev.kkkkkksssssaaaa.starbucks.kiosk.domain.menu.data.MenuType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Table;
import lombok.Getter;

@Getter
@Entity
@Table(name = "menu")
public class MenuPersistenceEntity extends BaseEntity {

    @Enumerated(EnumType.STRING)
    @Column(length = 20)
    private MenuType type;

    @Column(length = 50)
    private String name;

    private int price;

    private String image;
}
