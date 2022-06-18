package com.example.sisteminventarislab.web.model.Request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotEmpty;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CreateUserWebRequest {
  @NotEmpty(message = "E-mail tidak boleh kosong")
  String email;

  @NotEmpty(message = "Nama tidak boleh kosong")
  String nama;

  @NotEmpty(message = "NIM tidak boleh kosong")
  String nim;

  @NotEmpty(message = "Password tidak boleh kosong")
  String password;

  @NotEmpty(message = "Tipe user tidak boleh kosong")
  String tipeUser;
}