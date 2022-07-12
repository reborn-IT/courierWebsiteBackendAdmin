package com.example.DeliveryWebApp.Repository;

import com.example.DeliveryWebApp.Dto.TrackerDto;
import com.example.DeliveryWebApp.Entity.Pickup;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PickupRepository extends JpaRepository<Pickup, Long> {

     @Query(value = "select delivery.delivery_name,delivery.delivery_address,pickup.pickup_date,pickup.delivery_date from pickup join delivery on pickup.delivery_id=delivery.delivery_id and pickup.pickup_id=?", nativeQuery = true)
     TrackerDto GetTrackerDetails(Long pickupId);
}
