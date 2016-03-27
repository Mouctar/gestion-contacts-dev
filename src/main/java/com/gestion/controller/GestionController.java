package com.gestion.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Souleyname MATO on 24/03/16.
 */
@Controller
public class GestionController {

  @RequestMapping(value = "/", method = RequestMethod.GET)
  @ResponseBody
  public String hello(){
    return "Hello Word !";
  }

  @RequestMapping(value = "/template", method = RequestMethod.GET)
  public String helloTemplate(){
    return "helloworld";
  }

  @RequestMapping(value = "/heritage", method = RequestMethod.GET)
  public String helloHeritage(){
    return "heritage";
  }

}
