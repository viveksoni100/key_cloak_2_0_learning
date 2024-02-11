package com.example.studentapp.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StudentController {

    @GetMapping(value = {"contact-us"})
    public ModelAndView login() {
        ModelAndView modelAndView = new ModelAndView("contact-us");
        return modelAndView;
    }

    @GetMapping("/home")
    public ModelAndView home() {
        ModelAndView modelAndView = new ModelAndView("home");
        return modelAndView;
    }

    @GetMapping("/manage-student")
    @PreAuthorize("hasAuthority('PROFESSOR')")
    public ModelAndView manageStudent() {
        ModelAndView modelAndView = new ModelAndView("manage-student");
        return modelAndView;
    }

    @GetMapping("/access-denied")
    public ModelAndView accessDenied() {
        ModelAndView modelAndView = new ModelAndView("access-denied");
        return modelAndView;
    }

}
