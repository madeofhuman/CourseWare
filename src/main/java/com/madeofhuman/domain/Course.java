package com.madeofhuman.domain;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 *
 * @author madeofhuman
 */
@Entity
public class Course { 
  @Id
  @GeneratedValue
  private Long id;
  
  
  private String name;
  private String description;
  
  @OneToMany(mappedBy = "course")
  private Set<Lesson> lessons = new HashSet<>();

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
   * @return the lessons
   */
  public Set<Lesson> getLessons() {
    return lessons;
  }

  /**
   * @param lessons the lessons to set
   */
  public void setLessons(Set<Lesson> lessons) {
    this.lessons = lessons;
  }
}
