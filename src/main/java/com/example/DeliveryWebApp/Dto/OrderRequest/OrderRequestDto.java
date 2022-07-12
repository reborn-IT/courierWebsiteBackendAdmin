package com.example.DeliveryWebApp.Dto.OrderRequest;

import com.example.DeliveryWebApp.Entity.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class OrderRequestDto {
    private User user;
}
