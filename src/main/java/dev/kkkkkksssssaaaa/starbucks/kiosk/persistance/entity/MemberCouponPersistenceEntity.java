package dev.kkkkkksssssaaaa.starbucks.kiosk.persistance.entity;

import dev.kkkkkksssssaaaa.starbucks.kiosk.common.util.Dates;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.ColumnDefault;

import java.time.LocalDateTime;

@Getter
@Entity
@Table(name = "member_coupon")
@NoArgsConstructor
public class MemberCouponPersistenceEntity extends BaseEntity {

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "member_id")
    private MemberPersistenceEntity member;

    @Column(
        name = "expired_at",
        columnDefinition = "DATETIME",
        nullable = false
    )
    @ColumnDefault("CURRENT_TIMESTAMP")
    private LocalDateTime expiredAt = Dates.aWeekLater();

    @Column(
        name = "used_at",
        columnDefinition = "DATETIME"
    )
    private LocalDateTime usedAt;

    @Column(
        name = "discount_price",
        columnDefinition = "INT"
    )
    private Integer discountPrice;

    private MemberCouponPersistenceEntity(Long id, LocalDateTime usedAt) {
        super(id);
        this.usedAt = usedAt;
    }

    public static MemberCouponPersistenceEntity setUse(Long id) {
        return new MemberCouponPersistenceEntity(
            id,
            LocalDateTime.now()
        );
    }
}
