package dev.kkkkkksssssaaaa.starbucks.kiosk.persistance.entity;

import dev.kkkkkksssssaaaa.starbucks.kiosk.common.Dates;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import org.hibernate.annotations.ColumnDefault;

import java.time.LocalDateTime;

@Getter
@Entity
@Table(name = "member_coupon")
public class MemberCouponPersistenceEntity extends BaseEntity {

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "member_id")
    private MemberPersistenceEntity member;

    @Column(
        name = "used",
        columnDefinition = "BIT",
        nullable = false
    )
    @ColumnDefault("0")
    private boolean used = false;

    @Column(
        name = "expired_at",
        columnDefinition = "DATETIME",
        nullable = false
    )
    @ColumnDefault("CURRENT_TIMESTAMP")
    private LocalDateTime expiredAt = Dates.aWeekLater();
}