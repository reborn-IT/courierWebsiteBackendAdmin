package com.example.DeliveryWebApp.Dto.Pickup;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class PickupDetailsDto {
//    senders details
    private String senderName;
    private String senderAddress;
    private String senderMobile;
    private String senderAltMobile;
    private String senderEmail;
//    delivery details
    private String deliveryName;
    private String deliveryAddress;
    private String mobileNumber;
    private String mobileNumberAlt;
    private String email;
//    pickup details
    private String vehicleType;
    private Float parcelWeight;
    private String specialNotes;
    private Float deliveryFee;
    private Boolean immediateCourier;
    private String deliveryStatus;
    private Date pickupDate;
    private String itemDescription;


}
