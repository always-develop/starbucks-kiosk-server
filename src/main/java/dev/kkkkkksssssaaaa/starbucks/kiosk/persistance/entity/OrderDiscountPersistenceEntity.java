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
@Table(name = "order_discount")
@NoArgsConstructor
@AllArgsConstructor
public class OrderDiscountPersistenceEntity extends BaseEntity {

    @ManyToOne(
        fetch = FetchType.LAZY,
        cascade = CascadeType.ALL,
        optional = false
    )
    @JoinColumn(name = "order_id", nullable = false)
    private OrderPersistenceEntity order;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "coupon_id")
    private MemberCouponPersistenceEntity coupon;
}
