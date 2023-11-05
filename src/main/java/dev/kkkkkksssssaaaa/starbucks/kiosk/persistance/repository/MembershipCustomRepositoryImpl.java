package dev.kkkkkksssssaaaa.starbucks.kiosk.persistance.repository;

import com.querydsl.jpa.impl.JPAQueryFactory;
import dev.kkkkkksssssaaaa.starbucks.kiosk.domain.membership.repository.dao.MembershipDao;
import dev.kkkkkksssssaaaa.starbucks.kiosk.domain.membership.repository.dao.QMembershipDao;
import dev.kkkkkksssssaaaa.starbucks.kiosk.persistance.entity.MemberPersistenceEntity;
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

@Repository("memberPersistenceCustomRepository")
@Transactional(readOnly = true)
public class MembershipCustomRepositoryImpl implements MembershipCustomRepository {

    private static final QMemberPersistenceEntity MEMBER =
        QMemberPersistenceEntity.memberPersistenceEntity;
    private static final QMemberStampPersistenceEntity STAMP =
        QMemberStampPersistenceEntity.memberStampPersistenceEntity;
    private static final QMemberCouponPersistenceEntity COUPON =
        QMemberCouponPersistenceEntity.memberCouponPersistenceEntity;

    private final JPAQueryFactory queryFactory;

    @Autowired
    public MembershipCustomRepositoryImpl(JPAQueryFactory queryFactory) {
        this.queryFactory = queryFactory;
    }

    @Override
    public Optional<MembershipDao> findByPhone(String phone) {
        Map<String, MembershipDao> result =
            queryFactory
                .from(MEMBER)
                .where(MEMBER.phone.eq(phone))
                .leftJoin(STAMP)
                .on(
                    STAMP.member.id.eq(MEMBER.id)
                        .and(STAMP.used.isFalse())
                )
                .leftJoin(COUPON)
                .on(
                    COUPON.member.id.eq(MEMBER.id)
                        .and(COUPON.usedAt.isNull())
                )
                .transform(
                    groupBy(MEMBER.phone)
                        .as(
                            new QMembershipDao(
                                MEMBER,
                                set(STAMP),
                                set(COUPON)
                            )
                        )
                );

        return Optional.ofNullable(result.get(phone));
    }

    @Override
    public MembershipDao get(String phone) {
        Map<String, MembershipDao> result =
            queryFactory
                .from(MEMBER)
                .where(MEMBER.phone.eq(phone))
                .leftJoin(STAMP)
                .on(
                    STAMP.member.id.eq(MEMBER.id)
                        .and(STAMP.used.isFalse())
                )
                .leftJoin(COUPON)
                .on(
                    COUPON.member.id.eq(MEMBER.id)
                        .and(COUPON.usedAt.isNull())
                )
                .transform(
                    groupBy(MEMBER.phone)
                        .as(
                            new QMembershipDao(
                                MEMBER,
                                set(STAMP),
                                set(COUPON)
                            )
                        )
                );

        return Optional.ofNullable(result.get(phone))
            .orElseThrow(IllegalStateException::new);
    }
}


