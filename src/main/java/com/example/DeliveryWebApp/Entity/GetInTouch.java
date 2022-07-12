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
public class GetInTouch {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long getinTouchId;
    private String name;
    private String contactNumber;
    private String email;
    private String message;

    public GetInTouch(String name, String contactNumber, String email, String message) {
        this.name = name;
        this.contactNumber = contactNumber;
        this.email = email;
        this.message = message;
    }
}
