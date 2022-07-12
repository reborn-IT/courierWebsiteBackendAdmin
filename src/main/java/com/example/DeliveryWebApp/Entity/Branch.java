package com.example.DeliveryWebApp.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Branch {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long branchId;
    private String branchName;
    private String address;
    private String contactNumber;
    private String latitude;
    private String longitude;

    public Branch(String branchName, String address, String contactNumber, String latitude, String longitude) {
        this.branchName = branchName;
        this.address = address;
        this.contactNumber = contactNumber;
        this.latitude = latitude;
        this.longitude = longitude;
    }
}
