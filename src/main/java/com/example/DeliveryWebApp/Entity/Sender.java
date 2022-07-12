package com.example.DeliveryWebApp.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Sender {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long senderId;
    private String senderName;
    private String senderAddress;
    private String senderMobile;
    private String senderAltMobile;
    private String senderEmail;

    @OneToMany(targetEntity = Pickup.class , cascade = CascadeType.ALL )
    @JoinColumn(name ="sp_fk" , referencedColumnName = "senderId" )
    private List<Pickup> pickups;

    public Sender(String senderName, String senderAddress, String senderMobile, String senderAltMobile, String senderEmail) {
        this.senderName = senderName;
        this.senderAddress = senderAddress;
        this.senderMobile = senderMobile;
        this.senderAltMobile = senderAltMobile;
        this.senderEmail = senderEmail;
    }
}
