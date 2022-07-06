package jpabook.jpashop.domain;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class Delivery {

    @Id
    @GeneratedValue
    @Column(name = "delivery_id")
    private Long id;

    @OneToOne
    @JoinColumn(name = "delivery_id")
    private Order order;

    @Embedded
    public Address address;

    @Enumerated(EnumType.STRING)
    private DeliveryStatus status; //READY, COMP
}