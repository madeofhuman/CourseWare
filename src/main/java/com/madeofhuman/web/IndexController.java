package com.madeofhuman.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author madeofhuman
 */
@Controller
public class IndexController {
  @RequestMapping("")
  public String index(){
    return "index";
  }
}
