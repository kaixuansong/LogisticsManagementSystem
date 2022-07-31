package com.zhao.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
  private long userId;
  private String name;
  private String email;
  private String password;
  private String phone;
  private String sex;
  private String head;
  private String power;
  private String status;
  private String address;

}
