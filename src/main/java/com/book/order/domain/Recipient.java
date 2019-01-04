package com.book.order.domain;

import com.book.member.domain.Address;
import com.book.member.domain.Name;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Embedded;
import javax.validation.Valid;

@Embeddable
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Recipient {

    @Valid
    @Embedded
    private Mobile mobile;

    @Valid
    @Embedded
    private Name name;

    @Valid
    @Embedded
    private Address address;

    @Column(name = "shipping_message")
    private String ShippingMessage;


}
