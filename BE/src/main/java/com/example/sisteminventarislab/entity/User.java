package com.example.sisteminventarislab.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Id
    private String email;
    private String nama;
    private String password;
    private String tipeUser;
}