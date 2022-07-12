package com.example.DeliveryWebApp.Service;

import com.example.DeliveryWebApp.Dto.Pickup.PickupDetailsDto;
import com.example.DeliveryWebApp.Dto.SearchTrackingDto;
import com.example.DeliveryWebApp.Dto.TrackerDto;

import java.util.List;

public interface PickupService {
    TrackerDto GetTrackingInfo(Long pickupId);
    List<PickupDetailsDto> getPickupDetails();
}
