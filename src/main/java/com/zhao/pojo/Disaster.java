package com.zhao.pojo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Disaster {

  private long disId;
  private long userId;
  private String disasterCourse;
  private String disasterSituation;
  private String victimsName;
  private String help;
  private long victimsNum;
  private long isResolve;
  private long top;
  private String location;
}
