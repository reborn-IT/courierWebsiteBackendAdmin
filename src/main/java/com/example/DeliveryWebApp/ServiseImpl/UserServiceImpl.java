package com.example.DeliveryWebApp.ServiseImpl;

import com.example.DeliveryWebApp.Dto.UserDto.AddUserDto;
import com.example.DeliveryWebApp.Dto.UserDto.SearchUserDto;
import com.example.DeliveryWebApp.Dto.UserDto.UserDetailsDto;
import com.example.DeliveryWebApp.Entity.User;
import com.example.DeliveryWebApp.Repository.UserRepository;
import com.example.DeliveryWebApp.Service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
public class UserServiceImpl implements UserService {
    private final UserRepository userrepo;

    @Override
    public void saveUser(AddUserDto adduserdto) {
        User user=new User(adduserdto.getUsername(), adduserdto.getPassword(), adduserdto.getRole());
        userrepo.save(user);
    }

    @Override
    public List<UserDetailsDto> GetUserByCredentials(SearchUserDto searchuserdto) {
        List<User> userlist=userrepo.GetUserByCredentials(searchuserdto.getUsername(), searchuserdto.getPassword());
        List<UserDetailsDto> userdetailsdtolist=new ArrayList<>();
        for (User user: userlist) {
            userdetailsdtolist.add(new UserDetailsDto(user.getUsername(), user.getRole()));
        }
        return userdetailsdtolist;
    }
}
