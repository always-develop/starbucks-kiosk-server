package dev.kkkkkksssssaaaa.starbucks.kiosk.domain.membership.service;

import dev.kkkkkksssssaaaa.starbucks.kiosk.domain.membership.dto.Membership;
import dev.kkkkkksssssaaaa.starbucks.kiosk.domain.membership.dto.Phone;
import dev.kkkkkksssssaaaa.starbucks.kiosk.domain.membership.repository.MembershipRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GetMembershipOrRegisteredService {

    private final MembershipRepository repository;

    @Autowired
    public GetMembershipOrRegisteredService(MembershipRepository repository) {
        this.repository = repository;
    }

    public Membership getMembershipOrRegistered(Phone phone) {
        return repository.findMembership(phone)
            .orElseGet(() -> registeredNewMembership(phone));
    }

    private Membership registeredNewMembership(Phone phone) {
        return repository.save(phone);
    }
}
