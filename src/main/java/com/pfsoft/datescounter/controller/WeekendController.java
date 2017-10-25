package com.pfsoft.datescounter.controller;

import com.pfsoft.datescounter.entity.DatePair;
import com.pfsoft.datescounter.service.WeekendService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class WeekendController {

  private WeekendService weekendService;

  @Autowired
  public void setWeekendService(WeekendService weekendService) {
    this.weekendService = weekendService;
  }

  @GetMapping(value = "/")
  public String getBasicHomePage() {
    return "home";
  }

  @GetMapping(value = "/home")
  public String getHomePage() {
    return "home";
  }

  @GetMapping(value = "/login")
  public String getLoginPage() {
    return "login";
  }

  @GetMapping(value = "/dates")
  public String getDatesPage() {
    return "dates";
  }

  @PostMapping(value = "/dates")
  public String getAmountOfWeekends(@ModelAttribute DatePair datePair, Model model) {
    model.addAttribute("amount", weekendService.getAmountOfWeekends(datePair));
    return "dates";
  }

}
