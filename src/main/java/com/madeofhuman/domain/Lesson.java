package com.madeofhuman.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 *
 * @author madeofhuman
 */
@Entity
public class Lesson {
  @Id
  @GeneratedValue
  private Long id;
  
  private Integer number;
  private String name;
  private String description;
  
  @ManyToOne
  private Course course;

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
   * @return the course
   */
  public Course getCourse() {
    return course;
  }

  /**
   * @param course the course to set
   */
  public void setCourse(Course course) {
    this.course = course;
  }
}
