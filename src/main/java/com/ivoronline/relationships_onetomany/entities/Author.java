package com.ivoronline.relationships_onetomany.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.OneToMany;
import javax.persistence.CascadeType;
import java.util.Set;

@Entity
public class Author {

  //PRIMARY KEY
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  public Integer id;

  //RELATIONSHIPS
  @OneToMany(cascade = CascadeType.ALL)
  public Set<Book> books;

  //DATA
  public String  name;
  public Integer age;

}





