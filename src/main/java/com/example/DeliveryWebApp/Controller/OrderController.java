package com.example.DeliveryWebApp.Controller;

import com.example.DeliveryWebApp.Dto.OrderRequest.OrderRequestDto;
import com.example.DeliveryWebApp.Dto.Sender.AddSenderDto;
import com.example.DeliveryWebApp.Entity.User;
import com.example.DeliveryWebApp.Service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping(value = "/api/v1/order")
@CrossOrigin
@RequiredArgsConstructor
public class OrderController {
    private OrderService orderservice;


    @PostMapping(value = "/placeorder", consumes = APPLICATION_JSON_VALUE , produces = APPLICATION_JSON_VALUE )
    public String placeOrder(@RequestBody OrderRequestDto orderrequestdto){
        orderservice.placeOrder(orderrequestdto);
        return "Added!!!!";
    }
}
