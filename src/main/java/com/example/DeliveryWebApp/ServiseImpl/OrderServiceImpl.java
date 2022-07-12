package com.example.DeliveryWebApp.ServiseImpl;

import com.example.DeliveryWebApp.Dto.OrderRequest.OrderRequestDto;
import com.example.DeliveryWebApp.Entity.User;
import com.example.DeliveryWebApp.Repository.DeliveryRepository;
import com.example.DeliveryWebApp.Repository.PickupRepository;
import com.example.DeliveryWebApp.Repository.SenderRepository;
import com.example.DeliveryWebApp.Repository.UserRepository;
import com.example.DeliveryWebApp.Service.OrderService;

public class OrderServiceImpl implements OrderService {
     private UserRepository userrepo;
     private SenderRepository senderrepo;
     private PickupRepository pickuprepo;
     private DeliveryRepository deliveryrepo;


    @Override
    public void placeOrder(OrderRequestDto orderrequestdto) {
        userrepo.save(orderrequestdto.getUser());
    }
}
