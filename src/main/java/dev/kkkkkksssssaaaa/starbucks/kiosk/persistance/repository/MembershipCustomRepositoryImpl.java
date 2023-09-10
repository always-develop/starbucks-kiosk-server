package dev.kkkkkksssssaaaa.starbucks.kiosk.persistance.repository;

import com.querydsl.jpa.impl.JPAQueryFactory;
import dev.kkkkkksssssaaaa.starbucks.kiosk.domain.membership.repository.dao.MembershipDao;
import dev.kkkkkksssssaaaa.starbucks.kiosk.domain.membership.repository.dao.QMembershipDao;
import dev.kkkkkksssssaaaa.starbucks.kiosk.persistance.entity.QMemberCouponPersistenceEntity;
import dev.kkkkkksssssaaaa.starbucks.kiosk.persistance.entity.QMemberPersistenceEntity;
import dev.kkkkkksssssaaaa.starbucks.kiosk.persistance.entity.QMemberStampPersistenceEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Map;
import java.util.Optional;

import static com.querydsl.core.group.GroupBy.groupBy;
import static com.querydsl.core.group.GroupBy.set;

@Repository
@Transactional(readOnly = true)
public class MembershipCustomRepositoryImpl implements MembershipCustomRepository {

    private final JPAQueryFactory queryFactory;

    @Autowired
    public MembershipCustomRepositoryImpl(JPAQueryFactory queryFactory) {
        this.queryFactory = queryFactory;
    }

    @Override
    public Optional<MembershipDao> findMembership(String phone) {
        Map<String, MembershipDao> result = queryFactory
            .from(QMemberPersistenceEntity.memberPersistenceEntity)
            .where(QMemberPersistenceEntity.memberPersistenceEntity.phone.eq(phone))
            .leftJoin(QMemberStampPersistenceEntity.memberStampPersistenceEntity)
            .on(QMemberStampPersistenceEntity.memberStampPersistenceEntity.member.id.eq(QMemberPersistenceEntity.memberPersistenceEntity.id))
            .leftJoin(QMemberCouponPersistenceEntity.memberCouponPersistenceEntity)
            .on(QMemberCouponPersistenceEntity.memberCouponPersistenceEntity.member.id.eq(QMemberPersistenceEntity.memberPersistenceEntity.id))
            .transform(
                groupBy(QMemberPersistenceEntity.memberPersistenceEntity.phone)
                    .as(
                        new QMembershipDao(
                            QMemberPersistenceEntity.memberPersistenceEntity,
                            set(QMemberStampPersistenceEntity.memberStampPersistenceEntity),
                            set(QMemberCouponPersistenceEntity.memberCouponPersistenceEntity)
                        )
                    )
            );

        return Optional.ofNullable(result.get(phone));
    }
}


