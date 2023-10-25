package dev.kkkkkksssssaaaa.starbucks.kiosk.domain.payment.repository;

import dev.kkkkkksssssaaaa.starbucks.kiosk.domain.payment.domain.order.entity.Membership;

/**
 * This repository is payments domain's sub domain.
 * If you inject this repository, please follow the code example.
 *
 * <pre>{@code
 *
 * @Component
 * public someClass {
 *     private final MembershipRepository thisClass;
 *
 *     @Autowired
 *     public someClass(
 *         // pleas inject with bean name.
 *         @Qualifier("paymentsDomainMembershipRepository") MembershipRepository thisClass
 *     ) {
 *
 *     }
 * }
 *
 * }</pre>
 * */
public interface MembershipRepository {

    int getStampCount(Membership membership);
}
