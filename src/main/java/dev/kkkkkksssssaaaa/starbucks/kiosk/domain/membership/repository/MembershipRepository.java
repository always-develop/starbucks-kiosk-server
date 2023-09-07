package dev.kkkkkksssssaaaa.starbucks.kiosk.domain.membership.repository;

import dev.kkkkkksssssaaaa.starbucks.kiosk.domain.membership.dto.Membership;
import dev.kkkkkksssssaaaa.starbucks.kiosk.domain.membership.dto.Phone;

public interface MembershipRepository {

    Membership findMembership(Phone phone);
}
