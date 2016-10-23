package com.madeofhuman.web;

import com.madeofhuman.domain.Course;
import com.madeofhuman.repositories.CourseRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author madeofhuman
 */
@Controller
public class IndexController {
  @Autowired
  private CourseRepository courseRepo;
  
  @RequestMapping("/")
  public String index(ModelMap model){
    List<Course> courses = courseRepo.findAll();
    model.put("theCourses", courses);
    return "index";
  }
}
