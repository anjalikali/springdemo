package com.stackroute.controller;

import com.stackroute.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class HomeController {
    @RequestMapping("/")
    public ModelAndView display(ModelMap map)
    {
        ModelAndView model=new ModelAndView("index");
        User obj = new User();
        obj.setName("Anjali");
        map.addAttribute("greeting",obj.getName());
        return model;
    }

    @RequestMapping(value = "/user")
    public ModelAndView userdata(ModelMap map, @RequestParam String firstName, @RequestParam String password) {
        ModelAndView model=new ModelAndView("user");
        User user1=new User();
        user1.setName(firstName);
        user1.setPassword(password);
        model.addObject(user1);
        model.addObject("name", user1.getName());
        model.addObject("password",user1.getPassword());
        return model;
    }
}
