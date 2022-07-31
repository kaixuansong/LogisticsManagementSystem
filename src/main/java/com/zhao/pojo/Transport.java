package com.zhao.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Transport {

  private long tranId;
  private String emergent;
  private String license;
  private String start;
  private String now;
  private String end;
  private String status;

}
