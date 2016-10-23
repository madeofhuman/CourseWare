package com.madeofhuman.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 *
 * @author madeofhuman
 */
@Entity
public class Course {
  @Id
  @GeneratedValue
  private Long id;
  
  private Integer number;
  private String name;
  private String description;

  /**
   * @return the id
   */
  public Long getId() {
    return id;
  }

  /**
   * @param id the id to set
   */
  public void setId(Long id) {
    this.id = id;
  }

  /**
   * @return the number
   */
  public Integer getNumber() {
    return number;
  }

  /**
   * @param number the number to set
   */
  public void setNumber(Integer number) {
    this.number = number;
  }

  /**
   * @return the name
   */
  public String getName() {
    return name;
  }

  /**
   * @param name the name to set
   */
  public void setName(String name) {
    this.name = name;
  }

  /**
   * @return the description
   */
  public String getDescription() {
    return description;
  }

  /**
   * @param description the description to set
   */
  public void setDescription(String description) {
    this.description = description;
  }
}
