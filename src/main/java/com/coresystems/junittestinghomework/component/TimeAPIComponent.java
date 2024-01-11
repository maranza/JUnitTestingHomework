package com.coresystems.junittestinghomework.component;

import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

/**
 * @author : Oratile Khutsoane
 * @email : o.maranza@gmail.com
 * @created : 2024/01/11
 * @description :
 * @since : 2024/01/11, Thu
 */
@Component
public class TimeAPIComponent {

  public String getTimeOfDay() {
    LocalDateTime time = LocalDateTime.now();
    if (time.getHour() < 6) {
      return "Night";
    }
    if (time.getHour() >= 6 && time.getHour() < 12) {
      return "Morning";
    }
    if (time.getHour() >= 12 && time.getHour() < 18) {
      return "Afternoon";
    }
    return "Evening";
  }

}
