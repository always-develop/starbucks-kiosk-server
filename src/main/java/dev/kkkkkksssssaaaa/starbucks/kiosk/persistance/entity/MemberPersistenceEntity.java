package dev.kkkkkksssssaaaa.starbucks.kiosk.persistance.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Entity
@Table(name = "member")
@NoArgsConstructor
@AllArgsConstructor
public class MemberPersistenceEntity extends BaseEntity {

    @Column(
        unique = true,
        length = 13,
        nullable = false,
        updatable = false
    )
    private String phone;
}
