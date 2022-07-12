package com.example.DeliveryWebApp.Repository;

import com.example.DeliveryWebApp.Entity.Sender;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface SenderRepository extends JpaRepository<Sender,Long> {
//    @Query(value = "select * from sender where user_id=?", nativeQuery = true)
//    List<Sender> SearchByUserId(Long userId);
//    @Query(value = "UPDATE sender set sender_address=?, sender_name=?, sender_mobile=?, sender_alt_mobile=? where sender_id=?", nativeQuery = true)
//    void UpdateSenderDetails(Long senderId);

//    @Modifying
//    @Query(value = "delete from sender where sender_id=?", nativeQuery = true)
//    void DeleteSender(Long id);
}
