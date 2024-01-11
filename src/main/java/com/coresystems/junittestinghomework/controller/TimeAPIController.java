package com.coresystems.junittestinghomework.controller;

import com.coresystems.junittestinghomework.service.TimeAPIService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/junit-testing")
public class TimeAPIController {

  @Autowired
  private TimeAPIService timeAPIService;

  @GetMapping("time-of-day")
  public String getTimeOfDay() {
    return timeAPIService.getTimeOfDay();
  }
}
