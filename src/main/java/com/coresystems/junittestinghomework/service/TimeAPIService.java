package com.coresystems.junittestinghomework.service;

import com.coresystems.junittestinghomework.component.TimeAPIComponent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TimeAPIService {

  @Autowired
  private TimeAPIComponent timeAPIComponent;

  public String getTimeOfDay() {
    return timeAPIComponent.getTimeOfDay();
  }

}
