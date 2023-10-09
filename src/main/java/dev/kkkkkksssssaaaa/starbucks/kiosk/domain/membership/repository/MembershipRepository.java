package dev.kkkkkksssssaaaa.starbucks.kiosk.domain.membership.repository;

import dev.kkkkkksssssaaaa.starbucks.kiosk.domain.membership.entity.Membership;
import dev.kkkkkksssssaaaa.starbucks.kiosk.domain.membership.entity.Phone;

import java.util.Optional;

public interface MembershipRepository {

    Membership save(Phone phone);
    Optional<Membership> findMembership(Phone phone);
}
