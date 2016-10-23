package com.madeofhuman.repositories;

import com.madeofhuman.domain.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author madeofhuman
 */
@Repository
public interface CourseRepository extends JpaRepository<Course, Long>{
  
}
