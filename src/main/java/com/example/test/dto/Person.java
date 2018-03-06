package com.example.test.dto;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "member")
public class Person {

  private Long id;

  private String name;

  private Integer age;

  private String city;

  private Boolean isSingle;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Integer getAge() {
    return age;
  }

  public void setAge(Integer age) {
    this.age = age;
  }

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public Boolean getIsSingle() {
    return isSingle;
  }

  public void setIsSingle(Boolean isSingle) {
    this.isSingle = isSingle;
  }
}
