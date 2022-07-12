package com.example.DeliveryWebApp.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;
    private String username;
    private String password;
    private String role;

    @OneToMany(targetEntity = Sender.class, cascade = CascadeType.ALL)
    @JoinColumn(name ="us_fk" , referencedColumnName = "userId")
    private List<Sender> senders;

    public User(String username, String password, String role) {
        this.username = username;
        this.password = password;
        this.role = role;
    }
}
