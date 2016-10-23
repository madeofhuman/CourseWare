package com.madeofhuman.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 *
 * @author madeofhuman
 */
@Entity
public class Lesson {
  @Id
  @GeneratedValue
  private Long id;
  
  private String name;
  private String description;
}
