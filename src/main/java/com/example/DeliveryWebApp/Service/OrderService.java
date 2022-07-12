package com.example.DeliveryWebApp.Service;

import com.example.DeliveryWebApp.Dto.OrderRequest.OrderRequestDto;
import com.example.DeliveryWebApp.Entity.User;

public interface OrderService {
    void placeOrder(OrderRequestDto orderrequestdto);
}
