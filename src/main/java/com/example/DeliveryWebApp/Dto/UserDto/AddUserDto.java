package com.example.DeliveryWebApp.Dto.UserDto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class AddUserDto {
    private String username;
    private String password;
    private String role;

}
