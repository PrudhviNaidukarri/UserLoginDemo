package com.example.userlogindemo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class UserEntity {

    @Id
    public int user_id;
    public String userName;
    public String email;
    public String password;
    public String registration_date;
    public String last_login_date;
}
