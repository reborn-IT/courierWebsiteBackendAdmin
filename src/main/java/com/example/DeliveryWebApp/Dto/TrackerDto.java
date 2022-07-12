package com.example.DeliveryWebApp.Dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class TrackerDto {
    private String deliveryName;
    private String deliveryAddress;
    private LocalDateTime pickupDate;
    private LocalDateTime deliveryDate;
}
