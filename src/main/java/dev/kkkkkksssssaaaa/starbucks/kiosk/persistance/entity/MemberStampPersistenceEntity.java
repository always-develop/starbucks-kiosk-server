package dev.kkkkkksssssaaaa.starbucks.kiosk.persistance.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import org.hibernate.annotations.ColumnDefault;

@Getter
@Entity
@Table(name = "member_stamp")
public class MemberStampPersistenceEntity extends BaseEntity {

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
}
