package com.example.DeliveryWebApp.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Pickup {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long pickupId;
    private String itemDescription;
    private Date pickupDate;
    @CreationTimestamp
    private LocalDateTime createpickupTime;
    @UpdateTimestamp
    private LocalDateTime updatepickupTime;
    private Date deliveryDate;
    private String paymentType;
    private String vehicleType;
    private Float parcelWeight;
    private String specialNotes;
    private Float deliveryFee;
    private Boolean immediateCourier;
    private String deliveryStatus;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "pd_fk")
    private Delivery delivery;
}
