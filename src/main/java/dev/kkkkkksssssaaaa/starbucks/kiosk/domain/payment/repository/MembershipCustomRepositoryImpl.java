package dev.kkkkkksssssaaaa.starbucks.kiosk.domain.payment.repository;

import dev.kkkkkksssssaaaa.starbucks.kiosk.domain.payment.domain.order.entity.Membership;
import dev.kkkkkksssssaaaa.starbucks.kiosk.persistance.repository.MemberPersistenceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository("paymentsDomainMembershipRepository")
@Transactional(readOnly = true)
public class MembershipCustomRepositoryImpl implements MembershipRepository {

    private final MemberPersistenceRepository persistenceRepository;

    @Autowired
    public MembershipCustomRepositoryImpl(
        @Qualifier("memberPersistenceRepository")
        MemberPersistenceRepository persistenceRepository
    ) {
        this.persistenceRepository = persistenceRepository;
    }

    @Override
    public int getStampCount(Membership entity) {
        return persistenceRepository.findMembership(entity.getPhone().toString())
            .map(membership -> membership.getStamp().size())
            .orElseGet(() -> 0);
    }
}
