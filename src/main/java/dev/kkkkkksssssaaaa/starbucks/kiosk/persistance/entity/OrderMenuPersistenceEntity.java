package dev.kkkkkksssssaaaa.starbucks.kiosk.persistance.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Entity
@Table(name = "order_menu")
@NoArgsConstructor
@AllArgsConstructor
public class OrderMenuPersistenceEntity extends BaseEntity {

    @ManyToOne(
        fetch = FetchType.LAZY,
        optional = false,
        cascade = CascadeType.ALL
    )
    @JoinColumn(name = "order_id")
    private OrderPersistenceEntity order;

    @ManyToOne(
        fetch = FetchType.LAZY,
        optional = false
    )
    @JoinColumn(name = "menu_id")
    private MenuPersistenceEntity menu;
}
