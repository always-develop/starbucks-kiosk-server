package dev.kkkkkksssssaaaa.starbucks.kiosk.persistance.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "menu")
public class MenuPersistenceEntity extends BaseEntity {

    private String name;

    private int price;
}
