package com.example.DeliveryWebApp.Repository;

import com.example.DeliveryWebApp.Dto.UserDto.UserDetailsDto;
import com.example.DeliveryWebApp.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {
    @Query(value = "select * from user where username=? and password=?", nativeQuery = true)
    List<User> GetUserByCredentials(String username, String pw);
}
