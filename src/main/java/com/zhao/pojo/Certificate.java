package com.zhao.pojo;

import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Certificate {

  private long cerId;
  private String donateAmout;
  private long disId;
  private long userId;
  private Date time;
  private long goodsId;
}
