package com.example.DeliveryWebApp.Service;

import com.example.DeliveryWebApp.Dto.UserDto.AddUserDto;
import com.example.DeliveryWebApp.Dto.UserDto.SearchUserDto;
import com.example.DeliveryWebApp.Dto.UserDto.UserDetailsDto;
import com.example.DeliveryWebApp.Entity.User;

import java.util.List;

public interface UserService {
    void saveUser(AddUserDto adduserdto);
    List<UserDetailsDto> GetUserByCredentials(SearchUserDto searchuserdto);
}
