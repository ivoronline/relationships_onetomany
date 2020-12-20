package com.ivoronline.relationships_onetomany.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Book {

  //PRIMARY KEY
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  public Integer id;

  //DATA
  public String  title;

}
