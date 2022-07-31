package com.zhao.pojo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Goods {

  private long goodsId;
  private String name;
  private long typeId;
  private String description;
  private double quantity;
  private double price;

}
