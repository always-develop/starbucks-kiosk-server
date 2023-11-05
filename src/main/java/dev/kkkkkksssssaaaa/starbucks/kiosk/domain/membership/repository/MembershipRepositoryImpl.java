package dev.kkkkkksssssaaaa.starbucks.kiosk.domain.membership.repository;

import dev.kkkkkksssssaaaa.starbucks.kiosk.domain.membership.entity.Membership;
import dev.kkkkkksssssaaaa.starbucks.kiosk.domain.membership.entity.Phone;
import dev.kkkkkksssssaaaa.starbucks.kiosk.persistance.entity.MemberPersistenceEntity;
import dev.kkkkkksssssaaaa.starbucks.kiosk.persistance.repository.MemberPersistenceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Repository
@Transactional
public class MembershipRepositoryImpl implements MembershipRepository {

    private final MemberPersistenceRepository memberPersistenceRepository;

    @Autowired
    public MembershipRepositoryImpl(MemberPersistenceRepository memberPersistenceRepository) {
        this.memberPersistenceRepository = memberPersistenceRepository;
    }

    @Override
    public Membership save(Phone phone) {
        MemberPersistenceEntity newEntity =
            memberPersistenceRepository.saveAndFlush(new MemberPersistenceEntity(phone.toString()));

        return Membership.registeredNew(newEntity);
    }

    @Override
    public Optional<Membership> findMembership(Phone phone) {
        return memberPersistenceRepository.findByPhone(phone.toString())
            .map(Membership::of);
    }
}
