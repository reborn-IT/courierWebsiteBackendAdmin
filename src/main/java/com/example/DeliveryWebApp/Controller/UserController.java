package com.example.DeliveryWebApp.Controller;

import com.example.DeliveryWebApp.Dto.BranchDetailDto;
import com.example.DeliveryWebApp.Dto.Sender.AddSenderDto;
import com.example.DeliveryWebApp.Dto.UserDto.AddUserDto;
import com.example.DeliveryWebApp.Dto.UserDto.SearchUserDto;
import com.example.DeliveryWebApp.Dto.UserDto.UserDetailsDto;
import com.example.DeliveryWebApp.Service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/api/v1/user")
@CrossOrigin
public class UserController {
    private final UserService userservice;

    @PostMapping(value = "/addUser", consumes = APPLICATION_JSON_VALUE , produces = APPLICATION_JSON_VALUE )
    public AddUserDto AddNewUser(@RequestBody AddUserDto adduser){
        userservice.saveUser(adduser);
        return adduser;
    }

    @GetMapping(value = "/login", consumes = APPLICATION_JSON_VALUE , produces = APPLICATION_JSON_VALUE )
    public List<UserDetailsDto> FindByCridentials(@RequestBody SearchUserDto searchuserdto){
        List<UserDetailsDto> searchedUser=userservice.GetUserByCredentials(searchuserdto);
        return searchedUser;
    }

}
