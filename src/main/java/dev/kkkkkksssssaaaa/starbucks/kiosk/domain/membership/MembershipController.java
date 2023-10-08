package dev.kkkkkksssssaaaa.starbucks.kiosk.domain.membership;

import dev.kkkkkksssssaaaa.starbucks.kiosk.domain.membership.dto.Membership;
import dev.kkkkkksssssaaaa.starbucks.kiosk.domain.membership.dto.Phone;
import dev.kkkkkksssssaaaa.starbucks.kiosk.domain.membership.dto.response.MembershipResponse;
import dev.kkkkkksssssaaaa.starbucks.kiosk.domain.membership.service.GetMembershipOrRegisteredService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/memberships")
public class MembershipController {

    private final GetMembershipOrRegisteredService getMembershipOrRegistered;

    @Autowired
    public MembershipController(GetMembershipOrRegisteredService getMembershipOrRegistered) {
        this.getMembershipOrRegistered = getMembershipOrRegistered;
    }

    @GetMapping
    public ResponseEntity<MembershipResponse> findMembership(Phone phone) {
        Membership membership = getMembershipOrRegistered.getMembershipOrRegistered(phone);

        return ResponseEntity.ok(MembershipResponse.castDto(membership));
    }
}
