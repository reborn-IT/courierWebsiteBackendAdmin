package com.example.DeliveryWebApp.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Delivery {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long deliveryId;
    private String deliveryName;
    private String deliveryAddress;
    private String mobileNumber;
    private String mobileNumberAlt;
    private String email;

    @OneToOne(mappedBy = "delivery")
    private Pickup pickup;

    public Delivery(String deliveryName, String deliveryAddress, String mobileNumber, String mobileNumberAlt, String email) {
        this.deliveryName = deliveryName;
        this.deliveryAddress = deliveryAddress;
        this.mobileNumber = mobileNumber;
        this.mobileNumberAlt = mobileNumberAlt;
        this.email = email;
    }
}
