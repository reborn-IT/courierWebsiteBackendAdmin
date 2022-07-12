package com.example.DeliveryWebApp.Repository;

import com.example.DeliveryWebApp.Entity.Delivery;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DeliveryRepository extends JpaRepository<Delivery, Long> {
}
