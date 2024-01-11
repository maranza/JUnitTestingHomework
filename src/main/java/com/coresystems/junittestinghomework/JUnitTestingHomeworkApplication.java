package com.coresystems.junittestinghomework;

import com.coresystems.junittestinghomework.component.TimeAPIComponent;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JUnitTestingHomeworkApplication {

  public static void main(String[] args) {
    SpringApplication.run(JUnitTestingHomeworkApplication.class, args);

    // running the sample code
    System.out.println("Hello world!");
    TimeAPIComponent timeAPIComponent = new TimeAPIComponent();
    System.out.println(timeAPIComponent.getTimeOfDay());
  }

}
